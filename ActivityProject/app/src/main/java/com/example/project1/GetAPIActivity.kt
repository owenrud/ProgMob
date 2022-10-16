package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project1.adapter.MahasiswaAdapter
import com.example.project1.adapter.UsersAdapter
import com.example.project1.model.ResponseMahasiswaItem
import com.example.project1.model.ResponseUsersItem
import com.example.project1.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class GetAPIActivity : AppCompatActivity() {
    lateinit var rvUser : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_apiactivity)
        rvUser = findViewById(R.id.rvapiuserbaru)
        NetworkConfig().getService().getMahasiswa().enqueue(object : Callback<List<ResponseMahasiswaItem>> {
                override fun onFailure(call: Call<List<ResponseMahasiswaItem>>, t: Throwable) {
                    Toast.makeText(this@GetAPIActivity, t.localizedMessage, Toast.LENGTH_SHORT).show()
                }
                override fun onResponse(call: Call<List<ResponseMahasiswaItem>>, response: Response<List<ResponseMahasiswaItem>>)
                {
                    rvUser.apply{
                        layoutManager = LinearLayoutManager(this@GetAPIActivity)
                        adapter = MahasiswaAdapter(response.body())
                    }
                }
            })

    }
}