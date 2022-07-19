package com.example.svgpathsetting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val myDrawing = MyDrawable()
        val image: ImageView = findViewById(R.id.imageView)
        image.setImageDrawable(myDrawing)
        image.contentDescription = resources.getString(R.string.app_name)

       /*var customDrawableView = CustomDrawableView(this)
        setContentView(customDrawableView)*/
    }
}