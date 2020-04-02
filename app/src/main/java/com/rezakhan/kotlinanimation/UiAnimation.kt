package com.rezakhan.kotlinanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class UiAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui_animation)

        //declare the animation
        var ttb = AnimationUtils.loadAnimation(this, R.anim.ttb)
        var headerTitle = findViewById<TextView>(R.id.headertitle)
        var subTitle = findViewById<TextView>(R.id.subtitle)
        headerTitle.startAnimation(ttb)
        subTitle.startAnimation(ttb)

        var stb = AnimationUtils.loadAnimation(this, R.anim.stb)
        var icCards = findViewById<ImageView>(R.id.ic_cards)
        icCards.startAnimation(stb)


        var btn1 = AnimationUtils.loadAnimation(this, R.anim.btn1)
        var btn2 = AnimationUtils.loadAnimation(this, R.anim.btn2)
        var btn3 = AnimationUtils.loadAnimation(this, R.anim.btn3)
        var resultOne = findViewById<LinearLayout>(R.id.resultOne)
        var resultTwo = findViewById<LinearLayout>(R.id.resultTwo)
        var resultThree = findViewById<LinearLayout>(R.id.resultThree)
        resultOne.startAnimation(btn1)
        resultTwo.startAnimation(btn2)
        resultThree.startAnimation(btn3)

        var btnStartAnimation = AnimationUtils.loadAnimation(this, R.anim.btn_start)
        var btnNext = findViewById<Button>(R.id.btn_next)
        btnNext.startAnimation(btnStartAnimation)

     }

}
