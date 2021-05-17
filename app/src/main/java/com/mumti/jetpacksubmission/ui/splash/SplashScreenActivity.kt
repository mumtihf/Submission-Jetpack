package com.mumti.jetpacksubmission.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.mumti.jetpacksubmission.R
import com.mumti.jetpacksubmission.ui.MainActivity

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var handler: Handler

    companion object {
        private const val delayMillis = 3000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        handler = Handler(mainLooper)
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, delayMillis.toLong())
    }
}