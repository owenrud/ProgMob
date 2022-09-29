package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

lateinit var btnShowList : Button

class SampleList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)
        btnShowList = findViewById(R.id.btnShowList)

        btnShowList.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList,SampleListView::class.java)
            startActivity(intent) })

    }
}