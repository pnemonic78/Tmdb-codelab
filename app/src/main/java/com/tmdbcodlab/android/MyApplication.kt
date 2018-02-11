package com.tmdbcodlab.android

import android.app.Application
import com.tmdbcodlab.android.inject.components.DaggerApplicationComponent
import com.tmdbcodlab.android.inject.modules.ApplicationModule
import timber.log.Timber

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build().inject(this)
    }
}