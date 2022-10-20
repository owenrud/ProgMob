package com.example.project1.network


import com.example.project1.model.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

class NetworkConfig {
    // set interceptor
fun getInterceptor() : OkHttpClient {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        return  okHttpClient
}
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://kpsi.fti.ukdw.ac.id")
            .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService() = getRetrofit().create(Users::class.java)
}
interface Users {
    @GET("api/progmob/mhs/72200371")
    fun getMahasiswa(): Call<List<ResponseMahasiswaItem>>
    @POST("api/progmob/mhs/create")
    fun addMahasiswa(@Body req : ResponseAddMahasiswaItem): Call<ResponseAddMahasiswa>
    @Headers("User-Agent: ok","status:ok")
    @HTTP(method = "PUT", path = "api/progmob/mhs/update", hasBody = true)
    fun updateMahasiswa(@Body req : ResponseUpdateMahasiswaItem): Call<ResponseUpdateMahasiswa>
    @HTTP(method = "DELETE", path = "api/progmob/mhs/delete", hasBody = true)
    fun deleteMahasiswa(@Body req: ResponseDeleteMahasiswaItem): Call<ResponseDeleteMahasiswa>

}