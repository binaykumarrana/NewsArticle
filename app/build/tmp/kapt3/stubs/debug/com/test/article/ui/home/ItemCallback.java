package com.test.article.ui.home;

import java.lang.System;

/**
 * Created by Binay on 4/6/21.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/test/article/ui/home/ItemCallback;", "", "onArticleClicked", "", "article", "Lcom/test/article/persistence/ArticleDB;", "app_debug"})
public abstract interface ItemCallback {
    
    public abstract void onArticleClicked(@org.jetbrains.annotations.NotNull()
    com.test.article.persistence.ArticleDB article);
}