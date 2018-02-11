package com.tmdbcodlab.android

import android.app.Application
import com.tmdbcodlab.android.inject.components.DaggerApplicationComponent
import timber.log.Timber

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        DaggerApplicationComponent.create().inject(this)
    }
}