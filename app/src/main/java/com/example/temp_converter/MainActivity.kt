package com.example.temp_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.input)
        val b2   = findViewById<Button>(R.id.btn2)
        val ans  = findViewById<TextView>(R.id.op)
        val b1   = findViewById<Button>(R.id.btn1)

        b2.setOnClickListener {

            val c = num1.text.toString().toFloat()
            val f = (c * 9/5)+32
            ans.text = f.toString()
        }
        b1.setOnClickListener {
            num1.setText("")
            ans.setText(" ")
            Toast.makeText(this,"Data clear Sucessfully",Toast.LENGTH_SHORT).show()
        }
    }
}