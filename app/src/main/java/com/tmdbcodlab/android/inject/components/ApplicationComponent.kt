package com.tmdbcodlab.android.inject.components

import android.app.Application
import com.knews.android.di.modules.ApplicationModule
import com.knews.android.di.modules.NetworkModule
import com.tmdbcodlab.android.data.source.remote.TmdbRemoteDataSource
import com.tmdbcodlab.android.ui.moviedetails.MovieDetailFragment
import com.tmdbcodlab.android.ui.movies.MoviesFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, NetworkModule::class])
interface ApplicationComponent {
    fun inject(app: Application)
    fun inject(dataSource: TmdbRemoteDataSource)
    fun inject(fragment: MoviesFragment)
    fun inject(fragment: MovieDetailFragment)
}