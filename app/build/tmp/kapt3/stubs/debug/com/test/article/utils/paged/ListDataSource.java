package com.test.article.utils.paged;

import java.lang.System;

/**
 * Created by Binay on 4/6/21.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/test/article/utils/paged/ListDataSource;", "Landroidx/paging/PositionalDataSource;", "Lcom/test/article/persistence/ArticleDB;", "items", "", "(Ljava/util/List;)V", "loadInitial", "", "params", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "callback", "Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "loadRange", "Landroidx/paging/PositionalDataSource$LoadRangeParams;", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "app_debug"})
public final class ListDataSource extends androidx.paging.PositionalDataSource<com.test.article.persistence.ArticleDB> {
    private final java.util.List<com.test.article.persistence.ArticleDB> items = null;
    
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.PositionalDataSource.LoadInitialParams params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PositionalDataSource.LoadInitialCallback<com.test.article.persistence.ArticleDB> callback) {
    }
    
    @java.lang.Override()
    public void loadRange(@org.jetbrains.annotations.NotNull()
    androidx.paging.PositionalDataSource.LoadRangeParams params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PositionalDataSource.LoadRangeCallback<com.test.article.persistence.ArticleDB> callback) {
    }
    
    public ListDataSource(@org.jetbrains.annotations.NotNull()
    java.util.List<com.test.article.persistence.ArticleDB> items) {
        super();
    }
}