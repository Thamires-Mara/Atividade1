package com.example.bemvindo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv_first = findViewById<TextView>(R.id.tv_first_text)
        tv_first.text = getString(R.string.msg_slogan2)

        val text_input = findViewById<TextView>(R.id.text_input)
        text_input.text = getString(R.string.msg_digite)
    }
}

