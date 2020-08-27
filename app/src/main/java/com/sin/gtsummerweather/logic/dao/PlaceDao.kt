package com.sin.gtsummerweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.sin.gtsummerweather.logic.model.Place
import com.sin.gtsummerweather.SunnyWeatherApplication

object PlaceDao {

    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() =
        SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)

}