package com.test.article.di

import com.test.article.domain.repository.ArticleRepository
import org.koin.dsl.module

/**
 * Created by Binay on 4/6/21.
 */
val repositoryModule = module {
    factory { ArticleRepository(get(), get()) }
}