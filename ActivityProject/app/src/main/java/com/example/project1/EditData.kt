package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class EditData : AppCompatActivity() {
    lateinit var editNama : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_data)
        editNama = findViewById(R.id.editNama)
            val username = intent.getStringExtra("username")
        editNama.text = username

        }
    }
