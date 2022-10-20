package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

lateinit var btnGetAPI : Button
lateinit var btnInsAPI : Button

class ServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        btnGetAPI = findViewById(R.id.btnGetAPI)
        btnInsAPI = findViewById(R.id.btnInsert)

        btnGetAPI.setOnClickListener(View.OnClickListener { view ->

            var intent = Intent(this@ServiceActivity, GetAPIActivity::class.java)
            startActivity(intent)
            finish()
        })
        btnInsAPI.setOnClickListener(View.OnClickListener { view ->

            var intent = Intent(this@ServiceActivity, InsertActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}