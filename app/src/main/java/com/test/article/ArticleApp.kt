package com.test.article

import android.app.Application
import com.test.article.di.networkModule
import com.test.article.di.repositoryModule
import com.test.article.di.roomModule
import com.test.article.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Created by Binay on 4/6/21.
 */
class ArticleApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            if (BuildConfig.DEBUG) {
                printLogger() // Koin Logger//TODO remove for release build
            }
            androidContext(this@ArticleApp)
            modules(listOf(roomModule, viewModelModule, networkModule, repositoryModule))
        }
    }
}