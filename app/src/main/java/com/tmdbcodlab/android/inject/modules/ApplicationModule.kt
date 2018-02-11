package com.tmdbcodlab.android.inject.modules

import android.content.Context
import com.tmdbcodlab.android.data.TmdbRepository
import com.tmdbcodlab.android.data.source.local.TmdbLocalDataSource
import com.tmdbcodlab.android.data.source.remote.TmdbRemoteDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(val context: Context) {

    @Provides
    fun provideContext() = context

    @Provides
    @Singleton
    fun provideLocalDataSource(context: Context) = TmdbLocalDataSource(context)

    @Provides
    @Singleton
    fun provideRemoteDataSource() = TmdbRemoteDataSource()

    @Provides
    @Singleton
    fun provideRepository(local: TmdbLocalDataSource, remote: TmdbRemoteDataSource) = TmdbRepository(local, remote)
}