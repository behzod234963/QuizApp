package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        initViews()
    }

    private fun initViews() {
        val bGetStart = findViewById<Button>(R.id.b_getstart)
        bGetStart.setOnClickListener {
            val intent = Intent(this, NameActivity::class.java)
            startActivity(intent)

        }
    }
}