package com.challenger.jokes_challenger_api_clean_archichecture.executor

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import com.challenger.domain.executor.PostExecutionThread

/**
 * MainThread (UI Thread) implementation based on a [Scheduler]
 * which will execute actions on the Android UI thread
 */
class UiThread  internal constructor() : PostExecutionThread {

    override val scheduler: Scheduler
        get() = AndroidSchedulers.mainThread()

}