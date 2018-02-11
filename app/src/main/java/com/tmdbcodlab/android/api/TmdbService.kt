package com.tmdbcodlab.android.api

import com.tmdbcodlab.android.model.MovieDetails
import com.tmdbcodlab.android.model.MoviesNowPlayingResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by ronelg on 12/19/17.
 */
interface TmdbService {

    @GET("movie/now_playing")
    fun getMoviesNowPlaying(@Query("api_key") apiKey: String,
                            @Query("language") language: String?,
                            @Query("page") page: Int? = 1,
                            @Query("region") region: String?): Observable<MoviesNowPlayingResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") moveId: Long,
                        @Query("api_key") apiKey: String,
                        @Query("language") language: String?,
                        @Query("append_to_response") append: String?): Observable<MovieDetails>

}