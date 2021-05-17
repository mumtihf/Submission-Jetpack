package com.mumti.jetpacksubmission.data.local

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import com.mumti.jetpacksubmission.data.local.entity.MovieEntity
import com.mumti.jetpacksubmission.data.local.entity.TvEntity
import com.mumti.jetpacksubmission.data.local.room.FilmDao

class LocalDataSource private constructor(private val mFilmDao: FilmDao) {

    companion object {
        private var INSTANCE: LocalDataSource? = null

        fun getInstance(filmDao: FilmDao): LocalDataSource =
            INSTANCE ?: LocalDataSource(filmDao)
    }

    //movies
    fun getAllMovies(): DataSource.Factory<Int, MovieEntity> = mFilmDao.getMovies()

    fun getFavMovies(): DataSource.Factory<Int, MovieEntity> = mFilmDao.getFavMovies()

    fun getDetailMovie(filmId: String): LiveData<MovieEntity> =
        mFilmDao.getDetailMovie(filmId)

    fun insertMovies(movies: List<MovieEntity>) = mFilmDao.insertMovies(movies)

    fun setFavoritedMovies(movies: MovieEntity, newState: Boolean) {
        movies.favorited = newState
        mFilmDao.updateMovies(movies)
    }

    //tv shows
    fun getAllTvShows(): DataSource.Factory<Int, TvEntity> = mFilmDao.getTvShows()

    fun getFavTvShows(): DataSource.Factory<Int, TvEntity> = mFilmDao.getFavTv()

    fun getDetailTvShow(filmId: String): LiveData<TvEntity> =
        mFilmDao.getDetailTv(filmId)

    fun insertTvShows(tv: List<TvEntity>) = mFilmDao.insertTvShows(tv)

    fun setFavoritedTvShow(tv: TvEntity, newState: Boolean) {
        tv.favorited = newState
        mFilmDao.updateTvShows(tv)
    }
}
