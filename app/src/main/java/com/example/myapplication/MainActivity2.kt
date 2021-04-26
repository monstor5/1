package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var Money2: TextView
    lateinit var Money3: Button
    var money1 = 0
    var ovosh1 = 1

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Money2 = findViewById< TextView>(R.id.textView)
        Money3 = findViewById<Button>(R.id.button)

        Money1.setOnClickListener{
            money +=ovosh
            Money.text = "доллор $money2"
            if (money > 9)
                Money.text = "доллора $money1"
        }

    }
}