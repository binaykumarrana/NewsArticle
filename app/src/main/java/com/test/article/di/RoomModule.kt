package com.test.article.di

import com.test.article.persistence.AppDataBase
import org.koin.dsl.module

/**
 * Created by Binay on 4/6/21.
 */
val roomModule = module {
    single { AppDataBase.getInstance(get()) }
    single { get<AppDataBase>().getArticleDao() }
}