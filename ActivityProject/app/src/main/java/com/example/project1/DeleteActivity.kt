package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.project1.model.ResponseDeleteMahasiswaItem
import com.example.project1.model.ResponseUpdateMahasiswaItem

class DeleteActivity : AppCompatActivity() {
    lateinit var delNim : EditText
    lateinit var delNimProgmob : EditText
    lateinit var btnDel : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete)
        delNim = findViewById(R.id.deleteNim)
        delNimProgmob = findViewById(R.id.delNim_progmob)
        btnDel = findViewById(R.id.btnDel)

        btnDel.setOnClickListener(View.OnClickListener { view ->
            val id = delNim.text.toString()
            val nim_progmob = delNimProgmob.text.toString()

            val deleteservice = DeleteApiService()
            val MhsData = ResponseDeleteMahasiswaItem(
                id = id, nim_progmob = nim_progmob)

            deleteservice.DeleteMhs(MhsData){
            }
        })
    }
}