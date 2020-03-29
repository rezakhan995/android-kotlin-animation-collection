package com.rezakhan.kotlinanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_text_animation.*

class TextAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_animation)

        fade_in.setOnClickListener {
            text_view.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            text_view.startAnimation(animation)
        }
        fade_out.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            text_view.startAnimation(animation)
            Handler().postDelayed({ text_view.visibility = View.GONE }, 1000)
        }
        zoom_in.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            text_view.startAnimation(animation)
        }
        zoom_out.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            text_view.startAnimation(animation)
        }
        slide_down.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            text_view.startAnimation(animation)
        }
        slide_up.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            text_view.startAnimation(animation)
        }
        bounce.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            text_view.startAnimation(animation)
        }
        rotate.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            text_view.startAnimation(animation)
        }
    }
}
