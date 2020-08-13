package com.sin.gtsummerweather.logic.model

import android.location.Location
import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String,val palces:List<Place>)
//SerializedName  注解对应json 返回字段名称
data class Place(val name: String,val lacation:Location,
                 @SerializedName("formatted_address") val address: String)
data class Location(val lng:String,val lat:String)

