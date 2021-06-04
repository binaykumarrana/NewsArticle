package com.test.article.ui.home

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.test.article.R
import com.test.article.domain.interactor.NetworkState
import com.test.article.extension.hide
import com.test.article.extension.show
import com.test.article.persistence.ArticleDB
import kotlinx.android.synthetic.main.home_fragment.*
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by Binay on 4/6/21.
 */
class HomeFragment : Fragment(R.layout.home_fragment), ItemCallback {
    private lateinit var articleAdapter: ArticleAdapter
    private val articleViewModel by viewModel<ArticleViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        articleAdapter = ArticleAdapter(this)
        setupRecyclerView()
        articleViewModel.loadArticlesPersistence()
        observeViewModelData()
        checkNetworkStatus()
    }

    private fun setupRecyclerView() {
        articleRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = articleAdapter
        }
    }

    private fun observeViewModelData() {
        //Observe local data if not found then call remote
        articleViewModel.localArticles.observe(viewLifecycleOwner, Observer {
            if (it.isNullOrEmpty()) {
                articleViewModel.fetchArticles()
            } else {
                articleAdapter.submitList(it)
                articleRecyclerView.smoothScrollToPosition(0)
            }
        })
        articleViewModel.articles.observe(
            viewLifecycleOwner,
            Observer {
                articleAdapter.submitList(it)
            })
    }

    private fun checkNetworkStatus() {
        articleViewModel.networkState?.observe(viewLifecycleOwner, Observer {
            it?.let { status ->
                when (status) {
                    NetworkState.SUCCESS -> {
                        progress_circular.hide()
                    }
                    NetworkState.LOADING -> {
                        progress_circular.show()
                        progress_circular.bringToFront()
                    }
                    NetworkState.ERROR -> {
                        progress_circular.hide()
                    }
                }
            }
        })
    }

    override fun onArticleClicked(article: ArticleDB) {
        val action = HomeFragmentDirections.actionHomeFragmentToArticleDetailsFragment(
            article
        )
        findNavController().navigate(action)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.new_menu, menu);
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_popular -> {
                articleViewModel.sortByPopular()
            }
            R.id.menu_recent -> {
                articleViewModel.sortByRecent()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}