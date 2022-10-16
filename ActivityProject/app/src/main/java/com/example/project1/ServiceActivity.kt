package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

lateinit var btnGetAPI : Button

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        btnGetAPI = findViewById(R.id.btnGetAPI)

        btnGetAPI.setOnClickListener(View.OnClickListener { view ->

            var intent = Intent(this@ServiceActivity, GetAPIActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}