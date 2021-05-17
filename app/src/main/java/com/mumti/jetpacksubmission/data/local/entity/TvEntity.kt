package com.mumti.jetpacksubmission.data.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tventities")
data class TvEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "filmId")
    var filmId: String,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "type")
    var type: String,

    @ColumnInfo(name = "duration")
    var duration: String,

    @ColumnInfo(name = "overview")
    var overview: String,

    @ColumnInfo(name = "date")
    var date: String,

    @ColumnInfo(name = "slogan")
    var slogan: String,

    @ColumnInfo(name = "imagePath")
    var imagePath: String,

    @ColumnInfo(name = "favorited")
    var favorited: Boolean = false
)
