package com.test.article.utils.paged

import android.os.AsyncTask
import androidx.paging.PagedList
import com.test.article.constants.Constants.PAGE_SIZE
import com.test.article.persistence.ArticleDB

/**
 * Created by Binay on 4/6/21.
 */
//PagedList config builder
fun pagedListConfig() = PagedList.Config.Builder()
    .setInitialLoadSizeHint(PAGE_SIZE)
    .setEnablePlaceholders(false)
    .setPageSize(PAGE_SIZE * 2)
    .build()


//Convert normal List<ArticleDB> to PagedList<ArticleDB>
fun getPagedList(listRetrieved: List<ArticleDB>): PagedList<ArticleDB> {
    return PagedList.Builder(
        ListDataSource(
            listRetrieved
        ), pagedListConfig()
    )
        .setNotifyExecutor(UiThreadExecutor())
        .setFetchExecutor(AsyncTask.THREAD_POOL_EXECUTOR)
        .build()
}
