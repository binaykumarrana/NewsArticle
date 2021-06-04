package com.test.article.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.test.article.domain.model.Article
import java.io.Serializable

/**
 * Created by Binay on 4/6/21.
 */
@Entity(tableName = "Article")
data class ArticleDB(
    @PrimaryKey val articleId: Int,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "avatar") val avatarUrl: String,
    @ColumnInfo(name = "date") val date: Long,
    @ColumnInfo(name = "rank") val rank: Int
) : Serializable {
    companion object {
        private fun map(article: Article): ArticleDB {
            return ArticleDB(
                articleId = article.articleId.toInt(),
                title = article.title,
                description = article.description,
                avatarUrl = article.avatarUrl,
                date = article.date,
                rank = article.rank
            )
        }

        fun mapList(articleList: List<Article>): List<ArticleDB> {
            val articlePostDBList = mutableListOf<ArticleDB>()
            for (article in articleList) {
                articlePostDBList.add(map(article))
            }
            return articlePostDBList
        }
    }
}