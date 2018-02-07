package com.tmdbcodlab.android

import android.app.Application
import com.tmdbcodlab.android.inject.components.ApplicationComponent
import com.tmdbcodlab.android.inject.components.DaggerApplicationComponent
import timber.log.Timber

class MyApplication : Application() {

    companion object {
        lateinit var appComponent: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        appComponent = DaggerApplicationComponent.create()
        appComponent.inject(this)
    }
}