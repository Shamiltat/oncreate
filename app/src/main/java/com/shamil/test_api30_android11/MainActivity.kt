package com.shamil.test_api30_android11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Будь скромен и не жди от вечности")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Ни постоянства, ни сердечности.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Ведь даже самых сильных мира,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Что к славе яростно рвались,")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "На время возведя в кумиры,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Она затем швыряла вниз.")
    }
}