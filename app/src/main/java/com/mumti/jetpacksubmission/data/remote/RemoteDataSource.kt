package com.mumti.jetpacksubmission.data.remote

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.mumti.jetpacksubmission.data.remote.response.MovieResponse
import com.mumti.jetpacksubmission.data.remote.response.TvResponse
import com.mumti.jetpacksubmission.utils.EspressoIdlingResources
import com.mumti.jetpacksubmission.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {

    private val handler = Handler(Looper.getMainLooper())

    companion object {
        private const val SERVICE_LATENCY_IN_MILLIS: Long = 1000

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
                instance ?: synchronized(this) {
                    instance ?: RemoteDataSource(helper).apply { instance = this }
                }
    }

    fun getAllMovies(): LiveData<ApiResponse<List<MovieResponse>>> {
        EspressoIdlingResources.increment()
        val resultMovies = MutableLiveData<ApiResponse<List<MovieResponse>>>()
        handler.postDelayed({
            resultMovies.value = ApiResponse.success(jsonHelper.loadMovies())
            EspressoIdlingResources.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)
        return resultMovies
    }

    fun getAllTvShows(): LiveData<ApiResponse<List<TvResponse>>> {
        EspressoIdlingResources.increment()
        val resultTvShow = MutableLiveData<ApiResponse<List<TvResponse>>>()
        handler.postDelayed({
            resultTvShow.value = ApiResponse.success(jsonHelper.loadTvShows())
            EspressoIdlingResources.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)
        return resultTvShow
    }

    fun getDetailMovie(filmId: String): LiveData<ApiResponse<List<MovieResponse>>> {
        EspressoIdlingResources.increment()
        val resultMovie = MutableLiveData<ApiResponse<List<MovieResponse>>>()
        handler.postDelayed({
            resultMovie.value = ApiResponse.success(jsonHelper.loadDetailMovies(filmId))
            EspressoIdlingResources.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)
        return resultMovie
    }

    fun getDetailTvShow(filmId: String): LiveData<ApiResponse<List<TvResponse>>> {
        EspressoIdlingResources.increment()
        val resultTvShow = MutableLiveData<ApiResponse<List<TvResponse>>>()
        handler.postDelayed({
            resultTvShow.value = ApiResponse.success(jsonHelper.loadDetailTvShows(filmId))
            EspressoIdlingResources.decrement()
        }, SERVICE_LATENCY_IN_MILLIS)
        return resultTvShow
    }
}