package com.rezakhan.kotlinanimation

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class ImagesAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images_animation)

        var image = findViewById<ImageView>(R.id.animation_image)
        var linearLayout = findViewById<LinearLayout>(R.id.overlay_background)

        proceedAnimation(image);
        proceedAnimation(linearLayout);
    }

    private fun proceedAnimation(drawable: View){
        var backgroundGradient = drawable.background as AnimationDrawable

        backgroundGradient.setEnterFadeDuration(3000)
        backgroundGradient.setExitFadeDuration(2000)
        backgroundGradient.start()
    }
}
