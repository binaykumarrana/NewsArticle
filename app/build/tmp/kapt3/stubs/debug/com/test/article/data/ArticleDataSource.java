package com.test.article.data;

import java.lang.System;

/**
 * Created by Binay on 4/6/21.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u0004\u0012\u00020\u00120\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019J\b\u0010\u001a\u001a\u00020\u0012H\u0016J*\u0010\u001b\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001eH\u0016J*\u0010\u001f\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001eH\u0016J*\u0010 \u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"H\u0016J\u0006\u0010#\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/test/article/data/ArticleDataSource;", "Landroidx/paging/PageKeyedDataSource;", "", "Lcom/test/article/persistence/ArticleDB;", "articleRepository", "Lcom/test/article/domain/repository/ArticleRepository;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/test/article/domain/repository/ArticleRepository;Lkotlinx/coroutines/CoroutineScope;)V", "networkState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/test/article/domain/interactor/NetworkState;", "retryQuery", "Lkotlin/Function0;", "", "supervisorJob", "Lkotlinx/coroutines/CompletableJob;", "executeQuery", "", "callback", "Lkotlin/Function1;", "", "getJobErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getNetworkState", "Landroidx/lifecycle/LiveData;", "invalidate", "loadAfter", "params", "Landroidx/paging/PageKeyedDataSource$LoadParams;", "Landroidx/paging/PageKeyedDataSource$LoadCallback;", "loadBefore", "loadInitial", "Landroidx/paging/PageKeyedDataSource$LoadInitialParams;", "Landroidx/paging/PageKeyedDataSource$LoadInitialCallback;", "refresh", "app_debug"})
public final class ArticleDataSource extends androidx.paging.PageKeyedDataSource<java.lang.Integer, com.test.article.persistence.ArticleDB> {
    private kotlinx.coroutines.CompletableJob supervisorJob;
    private final androidx.lifecycle.MutableLiveData<com.test.article.domain.interactor.NetworkState> networkState = null;
    private kotlin.jvm.functions.Function0<? extends java.lang.Object> retryQuery;
    private final com.test.article.domain.repository.ArticleRepository articleRepository = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadInitialCallback<java.lang.Integer, com.test.article.persistence.ArticleDB> callback) {
    }
    
    @java.lang.Override()
    public void loadAfter(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.test.article.persistence.ArticleDB> callback) {
    }
    
    @java.lang.Override()
    public void loadBefore(@org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadParams<java.lang.Integer> params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PageKeyedDataSource.LoadCallback<java.lang.Integer, com.test.article.persistence.ArticleDB> callback) {
    }
    
    @java.lang.Override()
    public void invalidate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.test.article.domain.interactor.NetworkState> getNetworkState() {
        return null;
    }
    
    public final void refresh() {
    }
    
    private final void executeQuery(kotlin.jvm.functions.Function1<? super java.util.List<com.test.article.persistence.ArticleDB>, kotlin.Unit> callback) {
    }
    
    private final kotlinx.coroutines.CoroutineExceptionHandler getJobErrorHandler() {
        return null;
    }
    
    public ArticleDataSource(@org.jetbrains.annotations.NotNull()
    com.test.article.domain.repository.ArticleRepository articleRepository, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
}