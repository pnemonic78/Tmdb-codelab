package com.tmdbcodlab.android.api

import com.tmdbcodlab.android.model.Movie
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by ronelg on 12/19/17.
 */
interface TmdbService {

    @GET("/movie/now_playing")
    fun getMoviesNowPlaying(@Query("api_key") apiKey: String,
                            @Query("language") language: String?,
                            @Query("page") page: Int? = 1,
                            @Query("region") region: String?): Single<List<Movie>>

}