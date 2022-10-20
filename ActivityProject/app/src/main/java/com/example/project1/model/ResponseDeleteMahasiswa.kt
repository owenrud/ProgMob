package com.example.project1.model

import com.google.gson.annotations.SerializedName

data class ResponseDeleteMahasiswa(

	@field:SerializedName("ResponseDeleteMahasiswa")
	val responseDeleteMahasiswa: List<ResponseDeleteMahasiswaItem?>? = null
)

data class ResponseDeleteMahasiswaItem(

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("nim_progmob")
	val nim_progmob: String? = null
)
