package com.test.article.data.service

import com.test.article.domain.model.Article
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

/**
 * Created by Binay on 4/6/21.
 */
interface ArticleService {
    @GET("carousell_news.json")
    fun getArticlesAsync(
    ): Deferred<List<Article>>
}