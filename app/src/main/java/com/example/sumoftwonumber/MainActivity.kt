package com.example.sumoftwonumber

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val num1 = findViewById(R.id.editText1) as EditText
        val num2 = findViewById(R.id.editText2) as EditText
        val total = findViewById(R.id.tvDisplay) as TextView
        val btnSum = findViewById(R.id.button1) as Button

        btnSum.setOnClickListener {
            val firstNum = num1.text.toString().toInt()
            val secondNum = num2.text.toString().toInt()

            if (firstNum !== null && secondNum !== null) {
                val result = firstNum + secondNum;
                total.text = result.toString()
            } else {
                Toast.makeText(this, "Input all the fill", Toast.LENGTH_SHORT).show()
            }

        }
    }

}


