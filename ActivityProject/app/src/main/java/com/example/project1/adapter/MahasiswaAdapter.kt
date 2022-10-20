package com.example.project1.adapter

import android.content.Context
import android.content.Intent
import com.example.project1.model.ResponseMahasiswaItem



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.project1.EditData
import com.example.project1.InsertActivity
import com.example.project1.R
import com.example.project1.items


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
        init{
            view.setOnLongClickListener {
                val pop = PopupMenu(view.context,it)
                pop.inflate(R.menu.sample_list_menu)

                pop.setOnMenuItemClickListener { item ->
                    when(item.itemId){
                        R.id.menu_add ->{}
                        R.id.menu_edit ->{}
                        R.id.menu_delete->{
                            
                        }
                    }
                    true
                }
                pop.show()
                false
            }
        }
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
