package com.example.hisms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // hiding the action bar
        supportActionBar?.hide()

        // creating a handler
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
        }, 4000)
    }
}