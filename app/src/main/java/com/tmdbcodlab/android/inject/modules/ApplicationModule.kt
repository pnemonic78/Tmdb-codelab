package com.knews.android.di.modules

import com.tmdbcodlab.android.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(val application: MyApplication) {

    @Provides
    @Singleton
    fun provideApplication() = application

//    @Provides
//    @Singleton
//    fun provideMovieDatabase(): MovieDatabase = Room.databaseBuilder(application, MovieDatabase::class.java, "movies").build()
}