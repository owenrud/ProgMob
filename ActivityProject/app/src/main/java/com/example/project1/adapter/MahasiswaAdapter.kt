package com.example.project1.adapter

import com.example.project1.model.ResponseMahasiswaItem



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project1.R


class MahasiswaAdapter(val mhs: List<ResponseMahasiswaItem>?):
    RecyclerView.Adapter<MahasiswaAdapter.MhsHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MahasiswaAdapter.MhsHolder {
        return MhsHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_mhs_api, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MahasiswaAdapter.MhsHolder, position: Int) {
        holder.bindMhs(mhs?.get(position))
    }

    override fun getItemCount(): Int {
        return mhs?.size ?: 0
    }

    class MhsHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtNim: TextView
        lateinit var txtNama: TextView
        lateinit var txtfoto: TextView
        lateinit var txtEmail: TextView
        lateinit var txtAlamat: TextView
        //lateinit var txtNoTelp: TextView
        fun bindMhs(mhs: ResponseMahasiswaItem?) {
            itemView.apply {
                txtNim = findViewById(R.id.nim)
                txtNama = findViewById(R.id.namaMhs)
                txtfoto = findViewById(R.id.Foto)
                txtEmail = findViewById(R.id.Email)
                txtAlamat = findViewById(R.id.AlamatMhs)
                txtNim.text = mhs?.nim
                txtNama.text = mhs?.nama
                txtfoto.text = mhs?.foto
                txtEmail.text = mhs?.email
                txtAlamat.text = mhs?.alamat
            }
        }
    }
}
