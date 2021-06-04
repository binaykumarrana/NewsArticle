package com.test.article.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel

/**
 * Created by Binay on 4/6/21.
 */
abstract class BaseViewModel : ViewModel() {

    /**
     * Coroutines in a Main Thread
     */
    protected val mainScope = CoroutineScope(Dispatchers.Main)

    /**
     * Coroutines in a Pool of Thread
     */
    protected val ioScope = CoroutineScope(Dispatchers.Default)

    override fun onCleared() {
        super.onCleared()
        mainScope.coroutineContext.cancel()
        ioScope.coroutineContext.cancel()
    }
}