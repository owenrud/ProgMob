package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.project1.model.ResponseAddMahasiswaItem

class InsertActivity : AppCompatActivity() {
    lateinit var edNim : EditText
    lateinit var edNama : EditText
    lateinit var edEmail :EditText
    lateinit var edAlamat: EditText
    lateinit var edNimProgmob : EditText
    lateinit var btnPost : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)
        edNim = findViewById(R.id.editTextNim)
        edNama = findViewById(R.id.editTextNama)
        edEmail = findViewById(R.id.editTextEmail)
        edAlamat = findViewById(R.id.editTextAlamat)
        edNimProgmob = findViewById(R.id.EditNimProgmob)
        btnPost = findViewById(R.id.btnupdate)

        btnPost.setOnClickListener(View.OnClickListener { view ->
            val nim = edNim.text.toString()
            val nama = edNama.text.toString()
            val email = edEmail.text.toString()
            val alamat = edAlamat.text.toString()
            val nim_progmob = edNimProgmob.text.toString()

            val postservice = PostApiService()
            val MhsData = ResponseAddMahasiswaItem(id = null,
                nim = nim, nama = nama, email = email, alamat = alamat, nim_progmob = nim_progmob)

            postservice.addMhs(MhsData){
                if(ResponseAddMahasiswaItem().id != null){
                    println("Success")
                }else{
                    println("error")
                }
            }
        })
    }
}