package com.test.article.data;

import java.lang.System;

/**
 * Created by Binay on 4/6/21.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/test/article/data/ArticleDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/test/article/persistence/ArticleDB;", "repository", "Lcom/test/article/domain/repository/ArticleRepository;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/test/article/domain/repository/ArticleRepository;Lkotlinx/coroutines/CoroutineScope;)V", "source", "Landroidx/lifecycle/MutableLiveData;", "Lcom/test/article/data/ArticleDataSource;", "getSource", "()Landroidx/lifecycle/MutableLiveData;", "create", "Landroidx/paging/DataSource;", "updateQuery", "", "app_debug"})
public final class ArticleDataSourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, com.test.article.persistence.ArticleDB> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.test.article.data.ArticleDataSource> source = null;
    private final com.test.article.domain.repository.ArticleRepository repository = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.test.article.data.ArticleDataSource> getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, com.test.article.persistence.ArticleDB> create() {
        return null;
    }
    
    private final com.test.article.data.ArticleDataSource getSource() {
        return null;
    }
    
    public final void updateQuery() {
    }
    
    public ArticleDataSourceFactory(@org.jetbrains.annotations.NotNull()
    com.test.article.domain.repository.ArticleRepository repository, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
}