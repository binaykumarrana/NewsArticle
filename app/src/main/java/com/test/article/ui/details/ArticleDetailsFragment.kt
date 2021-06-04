package com.test.article.ui.details

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.test.article.R
import com.test.article.persistence.ArticleDB
import com.test.article.utils.ImageUtils
import com.test.article.utils.getTimeAgo
import kotlinx.android.synthetic.main.article_details_fragment.*
import java.util.*

/**
 * Created by Binay on 4/6/21.
 */
class ArticleDetailsFragment : Fragment(R.layout.article_details_fragment) {
    private val args: ArticleDetailsFragmentArgs by navArgs()
    private lateinit var article: ArticleDB

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.article = args.article
        article?.let {
            titleTextView.text = it.title
            descTextView.text = it.description
            dateTextView.text = getTimeAgo(Date(it.date))
            ImageUtils.loadImage(
                it.avatarUrl,
                articleImageView,
                requireContext()
            )
        }
    }
}