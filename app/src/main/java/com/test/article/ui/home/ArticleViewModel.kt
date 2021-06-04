package com.test.article.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.test.article.data.ArticleDataSourceFactory
import com.test.article.domain.interactor.NetworkState
import com.test.article.domain.repository.ArticleRepository
import com.test.article.persistence.ArticleDB
import com.test.article.ui.BaseViewModel
import com.test.article.utils.paged.getPagedList
import com.test.article.utils.paged.pagedListConfig
import kotlinx.coroutines.launch

/**
 * Created by Binay on 4/6/21.
 */
class ArticleViewModel(private val articleRepository: ArticleRepository) : BaseViewModel() {

    var localArticles = MutableLiveData<PagedList<ArticleDB>>()
    private val articleDataSource =
        ArticleDataSourceFactory(repository = articleRepository, scope = ioScope)

    val articles = LivePagedListBuilder(
        articleDataSource,
        pagedListConfig()
    ).build()
    val networkState: LiveData<NetworkState>? =
        Transformations.switchMap(articleDataSource.source) { it.getNetworkState() }

    fun fetchArticles() {
        articleDataSource.updateQuery()
    }

    fun loadArticlesPersistence() {
        ioScope.launch {
            //fetch local and sort by timestamp
            val listRetrieved = articleRepository.getAllArticlesPersistence().sortedWith(
                compareByDescending(
                    ArticleDB::date
                )
            )
            mainScope.launch {
                localArticles.value = getPagedList(listRetrieved)
            }
        }
    }

    fun sortByPopular() {
        ioScope.launch {
            val listRetrieved = articleRepository.getAllArticlesPersistence().sortedWith(
                compareByDescending(
                    ArticleDB::rank
                )
            ).asReversed()
            mainScope.launch {
                localArticles.value = getPagedList(listRetrieved)
            }
        }
    }

    fun sortByRecent() {
        ioScope.launch {
            val listRetrieved = articleRepository.getAllArticlesPersistence().sortedWith(
                compareByDescending(
                    ArticleDB::date
                )
            )
            mainScope.launch {
                localArticles.value = getPagedList(listRetrieved)
            }
        }
    }
}