package com.test.article.domain.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Binay on 4/6/21.
 */
data class Article(
    @SerializedName("id") val articleId: String,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("banner_url") val avatarUrl: String,
    @SerializedName("time_created") val date: Long,
    @SerializedName("rank") val rank: Int
)