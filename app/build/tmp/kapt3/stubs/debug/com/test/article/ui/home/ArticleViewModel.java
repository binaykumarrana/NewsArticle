package com.test.article.ui.home;

import java.lang.System;

/**
 * Created by Binay on 4/6/21.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R;\u0010\u0007\u001a,\u0012(\u0012&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/test/article/ui/home/ArticleViewModel;", "Lcom/test/article/ui/BaseViewModel;", "articleRepository", "Lcom/test/article/domain/repository/ArticleRepository;", "(Lcom/test/article/domain/repository/ArticleRepository;)V", "articleDataSource", "Lcom/test/article/data/ArticleDataSourceFactory;", "articles", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/test/article/persistence/ArticleDB;", "kotlin.jvm.PlatformType", "getArticles", "()Landroidx/lifecycle/LiveData;", "localArticles", "Landroidx/lifecycle/MutableLiveData;", "getLocalArticles", "()Landroidx/lifecycle/MutableLiveData;", "setLocalArticles", "(Landroidx/lifecycle/MutableLiveData;)V", "networkState", "Lcom/test/article/domain/interactor/NetworkState;", "getNetworkState", "fetchArticles", "", "loadArticlesPersistence", "sortByPopular", "sortByRecent", "app_debug"})
public final class ArticleViewModel extends com.test.article.ui.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<androidx.paging.PagedList<com.test.article.persistence.ArticleDB>> localArticles;
    private final com.test.article.data.ArticleDataSourceFactory articleDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.test.article.persistence.ArticleDB>> articles = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.lifecycle.LiveData<com.test.article.domain.interactor.NetworkState> networkState = null;
    private final com.test.article.domain.repository.ArticleRepository articleRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<androidx.paging.PagedList<com.test.article.persistence.ArticleDB>> getLocalArticles() {
        return null;
    }
    
    public final void setLocalArticles(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<androidx.paging.PagedList<com.test.article.persistence.ArticleDB>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.test.article.persistence.ArticleDB>> getArticles() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<com.test.article.domain.interactor.NetworkState> getNetworkState() {
        return null;
    }
    
    public final void fetchArticles() {
    }
    
    public final void loadArticlesPersistence() {
    }
    
    public final void sortByPopular() {
    }
    
    public final void sortByRecent() {
    }
    
    public ArticleViewModel(@org.jetbrains.annotations.NotNull()
    com.test.article.domain.repository.ArticleRepository articleRepository) {
        super();
    }
}