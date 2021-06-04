package com.test.article.domain.repository

import com.test.article.data.service.ArticleService
import com.test.article.domain.model.Article
import com.test.article.persistence.ArticleDB
import com.test.article.persistence.ArticleDB.Companion.mapList
import com.test.article.persistence.ArticleDao

/**
 * Created by Binay on 4/6/21.
 */
class ArticleRepository(
    private val articleService: ArticleService,
    private val articleDao: ArticleDao
) {
    private suspend fun getArticles() =
        articleService.getArticlesAsync().await()

    suspend fun getArticlesWithPagination(): List<ArticleDB> {
        //sort list by timestamp descending
        val request = getArticles().sortedWith(compareByDescending(Article::date))
        //Save mapped list to room DB
        articleDao.insertList(mapList(articleList = request))
        return mapList(articleList = request)
    }

    suspend fun getAllArticlesPersistence(): List<ArticleDB> {
        return articleDao.findAllArticles()
    }
}