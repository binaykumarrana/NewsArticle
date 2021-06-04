package com.test.article.domain.repository;

import java.lang.System;

/**
 * Created by Binay on 4/6/21.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/test/article/domain/repository/ArticleRepository;", "", "articleService", "Lcom/test/article/data/service/ArticleService;", "articleDao", "Lcom/test/article/persistence/ArticleDao;", "(Lcom/test/article/data/service/ArticleService;Lcom/test/article/persistence/ArticleDao;)V", "getAllArticlesPersistence", "", "Lcom/test/article/persistence/ArticleDB;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArticles", "Lcom/test/article/domain/model/Article;", "getArticlesWithPagination", "app_debug"})
public final class ArticleRepository {
    private final com.test.article.data.service.ArticleService articleService = null;
    private final com.test.article.persistence.ArticleDao articleDao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getArticlesWithPagination(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.test.article.persistence.ArticleDB>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllArticlesPersistence(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.test.article.persistence.ArticleDB>> p0) {
        return null;
    }
    
    public ArticleRepository(@org.jetbrains.annotations.NotNull()
    com.test.article.data.service.ArticleService articleService, @org.jetbrains.annotations.NotNull()
    com.test.article.persistence.ArticleDao articleDao) {
        super();
    }
}