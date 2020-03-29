package com.rezakhan.kotlinanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class ViewAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_animation)

        var scaleBtn = findViewById<Button>(R.id.scale_button)
        var fadeBtn = findViewById<Button>(R.id.fade_button)
        var scaleImage = findViewById<ImageView>(R.id.scale_image)

        scaleBtn.setOnClickListener{
            var animation = AnimationUtils.loadAnimation(this, R.anim.scale)
            scaleImage.startAnimation(animation)
        }

        fadeBtn.setOnClickListener {
            var animation = AnimationUtils.loadAnimation(this, R.anim.fade)
            scaleImage.startAnimation(animation)
        }
    }
}
