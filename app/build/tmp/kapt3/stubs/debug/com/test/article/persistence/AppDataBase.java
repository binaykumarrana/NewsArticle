package com.test.article.persistence;

import java.lang.System;

/**
 * Created by Binay on 4/6/21.
 */
@androidx.room.Database(entities = {com.test.article.persistence.ArticleDB.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/test/article/persistence/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "getArticleDao", "Lcom/test/article/persistence/ArticleDao;", "Companion", "app_debug"})
public abstract class AppDataBase extends androidx.room.RoomDatabase {
    private static volatile com.test.article.persistence.AppDataBase INSTANCE;
    private static final androidx.room.migration.Migration MIGRATION_1_TO_2 = null;
    public static final com.test.article.persistence.AppDataBase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.test.article.persistence.ArticleDao getArticleDao();
    
    public AppDataBase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/test/article/persistence/AppDataBase$Companion;", "", "()V", "INSTANCE", "Lcom/test/article/persistence/AppDataBase;", "MIGRATION_1_TO_2", "Landroidx/room/migration/Migration;", "build", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.test.article.persistence.AppDataBase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.test.article.persistence.AppDataBase build(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}