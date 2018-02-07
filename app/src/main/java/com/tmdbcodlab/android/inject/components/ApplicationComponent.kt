package com.tmdbcodlab.android.inject.components

import android.app.Application
import com.knews.android.di.modules.ApplicationModule
import com.knews.android.di.modules.NetworkModule
import com.tmdbcodlab.android.data.source.remote.TmdbRemoteDataSource
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        ApplicationModule::class,
        NetworkModule::class))
interface ApplicationComponent {
    fun inject(app: Application)
    fun inject(app: TmdbRemoteDataSource)
}