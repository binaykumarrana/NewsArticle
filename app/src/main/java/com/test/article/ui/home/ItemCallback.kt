package com.test.article.ui.home

import com.test.article.persistence.ArticleDB

/**
 * Created by Binay on 4/6/21.
 */
interface ItemCallback {
    fun onArticleClicked(article: ArticleDB)
}