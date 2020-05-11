package com.omori.city_guide_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val SPLASH_TIMER: Long = 5000

    private lateinit var slideAnim: Animation
    private lateinit var bottomAnim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        slideAnim = AnimationUtils.loadAnimation(this, R.anim.slide_anim)
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim)

        iv_app_splash_img.animation = slideAnim
        tv_powered_by.animation = bottomAnim

        Handler().postDelayed(Runnable {
            intent = Intent(this, UserDashboardActivity::class.java)
            startActivity(intent)
        }, SPLASH_TIMER)

    }
}
