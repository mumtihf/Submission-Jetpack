package com.mumti.jetpacksubmission.di

import android.content.Context
import com.mumti.jetpacksubmission.data.FilmRepository
import com.mumti.jetpacksubmission.data.local.LocalDataSource
import com.mumti.jetpacksubmission.data.local.room.FilmDatabase
import com.mumti.jetpacksubmission.data.remote.RemoteDataSource
import com.mumti.jetpacksubmission.utils.AppExecutors
import com.mumti.jetpacksubmission.utils.JsonHelper

object Injection {

    fun provideRepository(context: Context): FilmRepository {

        val database = FilmDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.filmDao())
        val appExecutors = AppExecutors()

        return FilmRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}