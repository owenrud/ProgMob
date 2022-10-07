package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project1.adapter.PetaniAdapter
import com.example.project1.model.Petani

class SampleRecyclerView : AppCompatActivity() {
    lateinit var rvSample : RecyclerView
    lateinit var petaniAdapter: PetaniAdapter
    lateinit var lPetani: List<Petani>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_recycler_view)

        rvSample = findViewById(R.id.rvLatihan)

        lPetani = listOf(
            Petani(user="OR1",nama="Owen Rudiyanto", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50"),
            Petani(user="OR2",nama="Owen Rudiyanto", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50"),
            Petani(user="OR3",nama="Owen Rudiyanto", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50"),
            Petani(user="OR4",nama="Owen Rudiyanto", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50")

        )

        petaniAdapter = PetaniAdapter(lPetani)

        rvSample.apply {
            layoutManager = LinearLayoutManager(this@SampleRecyclerView)
            adapter = petaniAdapter
        }

    }
}