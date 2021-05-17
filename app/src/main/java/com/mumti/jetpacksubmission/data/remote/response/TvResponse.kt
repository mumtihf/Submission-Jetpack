package com.mumti.jetpacksubmission.data.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvResponse(
    var filmId: String,
    var title: String,
    var type: String,
    var duration: String,
    var overview: String,
    var date: String,
    var slogan: String,
    var imagePath: String
): Parcelable