package com.example.project1

import com.example.project1.model.ResponseDeleteMahasiswa
import com.example.project1.model.ResponseDeleteMahasiswaItem
import com.example.project1.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DeleteApiService {
    fun DeleteMhs(req: ResponseDeleteMahasiswaItem, onResult: (ResponseDeleteMahasiswa) -> Unit){
        val retrofit = NetworkConfig().getService()
        retrofit.deleteMahasiswa(req).enqueue(
            object : Callback<ResponseDeleteMahasiswa> {
                override fun onFailure(call: Call<ResponseDeleteMahasiswa>, t: Throwable){
                }
                override fun onResponse(call: Call<ResponseDeleteMahasiswa>, response: Response<ResponseDeleteMahasiswa>){
                    val DeletedMhs = response.body()
                    if (DeletedMhs != null) {
                        onResult(DeletedMhs)
                    }
                }
            }
        )
    }
}