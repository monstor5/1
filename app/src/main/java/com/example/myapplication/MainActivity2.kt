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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Money2 = findViewById< TextView>(R.id.textView)
        Money3 = findViewById<Button>(R.id.button)

        Money3.setOnClickListener{
            money1 +=ovosh1
            Money2.text = "доллор $money1"
            if (money1 > 9)
                Money2.text = "доллора $money1"
        }

    }
}