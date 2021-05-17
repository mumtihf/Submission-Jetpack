package com.mumti.jetpacksubmission.data.local.room

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.room.*
import com.mumti.jetpacksubmission.data.local.entity.MovieEntity
import com.mumti.jetpacksubmission.data.local.entity.TvEntity

@Dao
interface FilmDao {

    //movies
    @Query("SELECT * FROM movieentities")
    fun getMovies(): DataSource.Factory<Int, MovieEntity>

    @Query("SELECT * FROM movieentities WHERE favorited = 1")
    fun getFavMovies(): DataSource.Factory<Int, MovieEntity>

    @Transaction
    @Query("SELECT * FROM movieentities WHERE filmId = :filmId")
    fun getDetailMovie(filmId: String): LiveData<MovieEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(movies: List<MovieEntity>)

    @Update
    fun updateMovies(movies: MovieEntity)

    //tv show
    @Query("SELECT * FROM tventities")
    fun getTvShows(): DataSource.Factory<Int, TvEntity>

    @Query("SELECT * FROM tventities WHERE favorited = 1")
    fun getFavTv(): DataSource.Factory<Int, TvEntity>

    @Transaction
    @Query("SELECT * FROM tventities WHERE filmId = :filmId")
    fun getDetailTv(filmId: String): LiveData<TvEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTvShows(tv: List<TvEntity>)

    @Update
    fun updateTvShows(tv: TvEntity)
}