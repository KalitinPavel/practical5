package com.example.practicalwork5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private var LOG_TAG = "MYLOG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val morning = "morning"
        Log.d(LOG_TAG,morning)

    }

    override fun onStart() {
        super.onStart()
        val day = "day"
        Log.d(LOG_TAG, day)
    }

    override fun onRestart() {
        super.onRestart()
        val evening = "evening"
        Log.d(LOG_TAG, evening)
    }


    override fun onResume() {
        super.onResume()
        val night = "night"
        Log.d(LOG_TAG, night)
    }
}