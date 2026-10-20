
package com.example.cardviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardStudent = findViewById<CardView>(R.id.cardStudent)
        val tvStudentName = findViewById<TextView>(R.id.tvStudentName)

        tvStudentName.text = "Họ và tên: Nguyễn Văn An"
        cardStudent.radius = 32f
        cardStudent.cardElevation = 16f
    }
}
