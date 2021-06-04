package com.test.article.persistence;

import java.lang.System;

/**
 * Created by Binay on 4/6/21.
 */
@androidx.room.Entity(tableName = "Article")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006#"}, d2 = {"Lcom/test/article/persistence/ArticleDB;", "Ljava/io/Serializable;", "articleId", "", "title", "", "description", "avatarUrl", "date", "", "rank", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getArticleId", "()I", "getAvatarUrl", "()Ljava/lang/String;", "getDate", "()J", "getDescription", "getRank", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "app_debug"})
public final class ArticleDB implements java.io.Serializable {
    @androidx.room.PrimaryKey()
    private final int articleId = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "avatar")
    private final java.lang.String avatarUrl = null;
    @androidx.room.ColumnInfo(name = "date")
    private final long date = 0L;
    @androidx.room.ColumnInfo(name = "rank")
    private final int rank = 0;
    public static final com.test.article.persistence.ArticleDB.Companion Companion = null;
    
    public final int getArticleId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvatarUrl() {
        return null;
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final int getRank() {
        return 0;
    }
    
    public ArticleDB(int articleId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String avatarUrl, long date, int rank) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final int component6() {
        return 0;
    }
    
    /**
     * Created by Binay on 4/6/21.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.test.article.persistence.ArticleDB copy(int articleId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String avatarUrl, long date, int rank) {
        return null;
    }
    
    /**
     * Created by Binay on 4/6/21.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Created by Binay on 4/6/21.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Binay on 4/6/21.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u00a8\u0006\n"}, d2 = {"Lcom/test/article/persistence/ArticleDB$Companion;", "", "()V", "map", "Lcom/test/article/persistence/ArticleDB;", "article", "Lcom/test/article/domain/model/Article;", "mapList", "", "articleList", "app_debug"})
    public static final class Companion {
        
        private final com.test.article.persistence.ArticleDB map(com.test.article.domain.model.Article article) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.test.article.persistence.ArticleDB> mapList(@org.jetbrains.annotations.NotNull()
        java.util.List<com.test.article.domain.model.Article> articleList) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}