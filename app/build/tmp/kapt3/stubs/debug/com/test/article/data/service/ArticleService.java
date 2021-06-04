package com.test.article.data.service;

import java.lang.System;

/**
 * Created by Binay on 4/6/21.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/test/article/data/service/ArticleService;", "", "getArticlesAsync", "Lkotlinx/coroutines/Deferred;", "", "Lcom/test/article/domain/model/Article;", "app_debug"})
public abstract interface ArticleService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "carousell_news.json")
    public abstract kotlinx.coroutines.Deferred<java.util.List<com.test.article.domain.model.Article>> getArticlesAsync();
}