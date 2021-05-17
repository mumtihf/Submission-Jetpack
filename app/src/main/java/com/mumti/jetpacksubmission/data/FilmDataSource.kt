package com.mumti.jetpacksubmission.data

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.mumti.jetpacksubmission.data.local.entity.MovieEntity
import com.mumti.jetpacksubmission.data.local.entity.TvEntity
import com.mumti.jetpacksubmission.vo.Resource

interface FilmDataSource {

    fun getAllMovies(): LiveData<Resource<PagedList<MovieEntity>>>

    fun getAllTvShows(): LiveData<Resource<PagedList<TvEntity>>>

    fun getDetailMovies(filmId: String): LiveData<Resource<MovieEntity>>

    fun getDetailTvShows(filmId: String): LiveData<Resource<TvEntity>>

    fun getFavoritedMovies(): LiveData<PagedList<MovieEntity>>

    fun getFavoritedTvShows(): LiveData<PagedList<TvEntity>>

    fun setFavoritedMovies(movies: MovieEntity, state: Boolean)

    fun setFavoritedTvShows(tv: TvEntity, state: Boolean)
}