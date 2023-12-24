package com.michael.changecolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var view: View
    private lateinit var colorButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view = findViewById(R.id.view)
        colorButton = findViewById(R.id.floatingButton)

        val customColors = CustomColor.values()

        colorButton.setOnClickListener {
            val random = Random.nextInt(customColors.size)
            val color = customColors[random]
            view.setBackgroundColor(color.rgb)
            colorButton.text = color.toString()
            colorButton.setTextColor(color.rgb)
        }
    }
}