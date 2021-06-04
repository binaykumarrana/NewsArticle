package com.test.article.di

import com.test.article.ui.home.ArticleViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Binay on 4/6/21.
 */
val viewModelModule = module {
    viewModel { ArticleViewModel(get()) }
}
