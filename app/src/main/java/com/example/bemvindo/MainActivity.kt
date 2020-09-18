package com.example.bemvindo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val TAG = "<<<TMA>>>"
    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_curso.setOnClickListener  {
            readCourse()
        }


        }

   private fun readCourse () {
        val nomecurso = dt_curso. text. toString()
        val text = getString(R.string.text_curso)
        tx_curso. text = "$text  :  $nomecurso"
    }



    }





