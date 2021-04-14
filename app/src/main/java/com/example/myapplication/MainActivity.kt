package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var Money: TextView
    lateinit var Money1: Button
    var money = 0
    var ovosh = 10000000000000



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Money = findViewById(R.id.textView)
        Money1 = findViewById(R.id.button)

        Money1.setOnClickListener{
            money +=ovosh
            Money.text = "рубль $money"
        }


    }
}