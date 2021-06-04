package com.test.article.ui.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.test.article.R
import com.test.article.persistence.ArticleDB
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToArticleDetailsFragment(
    val article: ArticleDB
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_homeFragment_to_articleDetailsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(ArticleDB::class.java)) {
        result.putParcelable("article", this.article as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(ArticleDB::class.java)) {
        result.putSerializable("article", this.article as Serializable)
      } else {
        throw UnsupportedOperationException(ArticleDB::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionHomeFragmentToArticleDetailsFragment(article: ArticleDB): NavDirections =
        ActionHomeFragmentToArticleDetailsFragment(article)
  }
}
