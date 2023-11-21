package com.example.sumoftwonumber

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById(R.id.editText1) as EditText
        val num2 = findViewById(R.id.editText2) as EditText
        val tot = findViewById(R.id.text) as TextView
        val btn = findViewById(R.id.button1) as Button

        btn.setOnClickListener {
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()

            val  result = val1 + val2;
            tot.setText(result.toString())
        }
    }

}


