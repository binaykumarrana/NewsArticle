package com.test.article.utils.paged

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor
/**
 * Created by Binay on 4/6/21.
 */
/**/
class UiThreadExecutor : Executor {
    private val handler = Handler(Looper.getMainLooper())
    override fun execute(command: Runnable) {
        handler.post(command)
    }
}