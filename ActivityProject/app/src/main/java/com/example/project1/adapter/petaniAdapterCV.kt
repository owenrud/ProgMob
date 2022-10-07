package com.example.project1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project1.R
import com.example.project1.databinding.CvItemDutataniBinding
import com.example.project1.model.Petani

class PetaniAdapterCV(val petani:List<Petani>): RecyclerView.Adapter<PetaniAdapterCV.PetaniCVHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetaniAdapterCV.PetaniCVHolder {
        return PetaniCVHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.cv_item_dutatani, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PetaniAdapterCV.PetaniCVHolder, position: Int) {
        holder.bindPetani(petani[position])
    }

    override fun getItemCount(): Int {
        return petani.size
    }
    class PetaniCVHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtUserCV: TextView
        lateinit var txtNamaCV: TextView
        lateinit var txtJumlahLahanCV: TextView
        lateinit var txtIdentifikasiCV: TextView
        lateinit var txtTambahLahanCV: TextView
        fun bindPetani(petani: Petani)
        {itemView.apply {
            txtUserCV = findViewById(R.id.txtUserCV)
            txtNamaCV = findViewById(R.id.txtNamaCV)
            txtJumlahLahanCV = findViewById(R.id.txtJumlahLahanCV)
            txtIdentifikasiCV = findViewById(R.id.txtIdentifikasiCV)
            txtTambahLahanCV = findViewById(R.id.txtTambahLahanCV)
            txtUserCV.text = petani.user
            txtNamaCV.text = petani.nama
            txtJumlahLahanCV.text = petani.jumlahLahan
            txtIdentifikasiCV.text = petani.identifikasi
            txtTambahLahanCV.text = petani.tambahLahan
        }
        }
    }
}
