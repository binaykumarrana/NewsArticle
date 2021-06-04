package com.test.article.ui.home

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.test.article.persistence.ArticleDB
import com.test.article.utils.ImageUtils
import com.test.article.utils.getTimeAgo
import kotlinx.android.synthetic.main.article_item.view.*
import java.util.*

/**
 * Created by Binay on 4/6/21.
 */
class ArticleViewHolder(parent: View) : RecyclerView.ViewHolder(parent) {

    fun bind(
        article: ArticleDB?,
        listener: ItemCallback
    ) {
        article?.let {
            setupViews(it, itemView)
            setListeners(listener, article)
        }
    }

    private fun setupViews(article: ArticleDB, itemView: View) {
        itemView.titleTextView.text = article.title
        itemView.descTextView.text = article.description
        itemView.dateTextView.text = getTimeAgo(Date(article.date))
        ImageUtils.loadImage(
            article.avatarUrl,
            itemView.articleImageView,
            itemView.articleImageView.context
        )
    }

    private fun setListeners(
        listener: ItemCallback,
        article: ArticleDB
    ) {
        itemView.setOnClickListener {
            listener.onArticleClicked(article)
        }
    }
}