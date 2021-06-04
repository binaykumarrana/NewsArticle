package com.test.article.ui;

import java.lang.System;

/**
 * Created by Binay on 4/6/21.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/test/article/ui/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "getIoScope", "()Lkotlinx/coroutines/CoroutineScope;", "mainScope", "getMainScope", "onCleared", "", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    
    /**
     * Coroutines in a Main Thread
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    
    /**
     * Coroutines in a Pool of Thread
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope ioScope = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.CoroutineScope getMainScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.CoroutineScope getIoScope() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
}