package com.mumti.jetpacksubmission.utils

import android.content.Context
import com.mumti.jetpacksubmission.data.remote.response.MovieResponse
import com.mumti.jetpacksubmission.data.remote.response.TvResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {

    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)
        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMovies(): List<MovieResponse> {
        val list = ArrayList<MovieResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("MovieResponses.json").toString())
            val listArray = responseObject.getJSONArray("movies")
            for (i in 0 until listArray.length()) {
                val movie = listArray.getJSONObject(i)

                val filmId = movie.getString("filmId")
                val title = movie.getString("title")
                val type = movie.getString("type")
                val duration = movie.getString("duration")
                val overview = movie.getString("overview")
                val date = movie.getString("date")
                val slogan = movie.getString("slogan")
                val imagePath = movie.getString("imagePath")

                val movieResponse = MovieResponse(filmId, title, type, duration, overview, date, slogan, imagePath)
                list.add(movieResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }

    fun loadTvShows(): List<TvResponse> {
        val list = ArrayList<TvResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("TvShowResponses.json").toString())
            val listArray = responseObject.getJSONArray("tv")
            for (i in 0 until listArray.length()) {
                val tv = listArray.getJSONObject(i)

                val filmId = tv.getString("filmId")
                val title = tv.getString("title")
                val type = tv.getString("type")
                val duration = tv.getString("duration")
                val overview = tv.getString("overview")
                val date = tv.getString("date")
                val slogan = tv.getString("slogan")
                val imagePath = tv.getString("imagePath")

                val tvResponse = TvResponse(filmId, title, type, duration, overview, date, slogan, imagePath)
                list.add(tvResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }


    fun loadDetailMovies(filmId: String): List<MovieResponse> {
        val fileName = String.format("MovieResponses.json", filmId)
        val list = ArrayList<MovieResponse>()
        try {
            val result = parsingFileToString(fileName)
            if (result != null) {
                val responseObject = JSONObject(result)
                val listArray = responseObject.getJSONArray("movies")
                for (i in 0 until listArray.length()) {
                    val movie = listArray.getJSONObject(i)

                    val id = movie.getString("filmId")
                    val title = movie.getString("title")
                    val type = movie.getString("type")
                    val duration = movie.getString("duration")
                    val overview = movie.getString("overview")
                    val date = movie.getString("date")
                    val slogan = movie.getString("slogan")
                    val imagePath = movie.getString("imagePath")

                    val movieResponse = MovieResponse(id, title, type, duration, overview, date, slogan, imagePath)
                    list.add(movieResponse)
                }
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }

    fun loadDetailTvShows(filmId: String): List<TvResponse> {
        val fileName = String.format("TvShowResponses.json", filmId)
        val list = ArrayList<TvResponse>()
        try {
            val result = parsingFileToString(fileName)
            if (result != null) {
                val responseObject = JSONObject(result)
                val listArray = responseObject.getJSONArray("tv")
                for (i in 0 until listArray.length()) {
                    val tv = listArray.getJSONObject(i)

                    val id = tv.getString("filmId")
                    val title = tv.getString("title")
                    val type = tv.getString("type")
                    val duration = tv.getString("duration")
                    val overview = tv.getString("overview")
                    val date = tv.getString("date")
                    val slogan = tv.getString("slogan")
                    val imagePath = tv.getString("imagePath")

                    val tvResponse = TvResponse(id, title, type, duration, overview, date, slogan, imagePath)
                    list.add(tvResponse)
                }
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return list
    }
}