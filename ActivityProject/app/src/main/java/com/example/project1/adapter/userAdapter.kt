package com.example.project1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project1.R
import com.example.project1.model.ResponseUsersItem

class UsersAdapter(val users: List<ResponseUsersItem>?):
    RecyclerView.Adapter<UsersAdapter.UsersHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UsersAdapter.UsersHolder {
        return UsersHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_user_api, parent, false)
        )
    }

    override fun onBindViewHolder(holder: UsersAdapter.UsersHolder, position: Int) {
        holder.bindUsers(users?.get(position))
    }

    override fun getItemCount(): Int {
        return users?.size ?: 0
    }

    class UsersHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtNama: TextView
        lateinit var txtEmail: TextView
        lateinit var txtAlamat: TextView
        lateinit var txtNoTelp: TextView
        fun bindUsers(users: ResponseUsersItem?) {
            itemView.apply {
                txtNama = findViewById(R.id.nim)
                txtEmail = findViewById(R.id.namaMhs)
                txtAlamat = findViewById(R.id.AlamatMhs)
                txtNoTelp = findViewById(R.id.Foto)
                txtNama.text = users?.name
                txtEmail.text = users?.email
                val address = "${users?.address?.street}," +
                        " ${users?.address?.city}," +
                        " ${users?.address?.suite}," +
                        " ${users?.address?.zipcode}"
                txtAlamat.text = address
                txtNoTelp.text = users?.phone
            }
        }
    }
}



