package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project1.adapter.PetaniAdapterCV
import com.example.project1.model.Petani

class SampleCardView : AppCompatActivity() {
    lateinit var rvSample : RecyclerView
    lateinit var petaniAdapterCV: PetaniAdapterCV
    lateinit var lPetani: List<Petani>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_card_view)


        rvSample = findViewById(R.id.rvLatihanCV)

        lPetani = listOf(
            Petani(user="OR1",nama="Owen Rudiyanto", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50"),
            Petani(user="OR2",nama="Owen Rudiyanto", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50"),
            Petani(user="OR3",nama="Owen Rudiyanto", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50"),
            Petani(user="OR4",nama="Owen Rudiyanto", jumlahLahan = "100", identifikasi = "50", tambahLahan = "50")

        )

        petaniAdapterCV = PetaniAdapterCV(lPetani)

        rvSample.apply {
            layoutManager = LinearLayoutManager(this@SampleCardView)
            adapter = petaniAdapterCV
        }
    }
}