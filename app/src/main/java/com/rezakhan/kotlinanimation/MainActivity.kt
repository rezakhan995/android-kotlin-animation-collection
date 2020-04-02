package com.rezakhan.kotlinanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textAnimationBtn = findViewById<Button>(R.id.text_anim)
        var imageAnimationBtn = findViewById<Button>(R.id.image_anim)
        var viewAnimationBtn = findViewById<Button>(R.id.view_anim)
        var uiAnimationBtn = findViewById<Button>(R.id.ui_anim)

        textAnimationBtn.setOnClickListener {
            var intent = Intent(this, TextAnimation::class.java)
            startActivity(intent)
        }

        imageAnimationBtn.setOnClickListener {
            var intent = Intent(this, ImagesAnimation::class.java)
            startActivity(intent)
        }

        viewAnimationBtn.setOnClickListener {
            var intent = Intent(this, ViewAnimation::class.java)
            startActivity(intent)
        }
        uiAnimationBtn.setOnClickListener {
            var intent = Intent(this, UiAnimation::class.java)
            startActivity(intent)
        }
    }
}
