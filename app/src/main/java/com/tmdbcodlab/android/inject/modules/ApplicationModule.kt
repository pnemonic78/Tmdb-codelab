package com.knews.android.di.modules

import com.tmdbcodlab.android.MyApplication
import com.tmdbcodlab.android.data.TmdbRepository
import com.tmdbcodlab.android.data.source.local.TmdbLocalDataSource
import com.tmdbcodlab.android.data.source.remote.TmdbRemoteDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(/*val application: MyApplication*/) {

//    @Provides
//    @Singleton
//    fun provideApplication() = application

    @Provides
    @Singleton
    fun provideLocalDataSource() = TmdbLocalDataSource()

    @Provides
    @Singleton
    fun provideRemoteDataSource() = TmdbRemoteDataSource()

    @Provides
    @Singleton
    fun provideRepository(local: TmdbLocalDataSource, remote: TmdbRemoteDataSource) = TmdbRepository(local, remote)
}