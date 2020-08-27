package com.sin.gtsummerweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    //companion 静态  object 单例
    companion object {

        const val TOKEN = "BhF86VEauO56lSCo" // 填入你申请到的令牌值 xys

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}