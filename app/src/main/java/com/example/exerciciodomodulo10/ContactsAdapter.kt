package com.example.exerciciodomodulo10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(private val contact: MutableList<ContactInfo>): RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contactlist, parent, false)
        return ContactsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        holder.contactName.text = position.toString()
        holder.phoneNumber.text = position.toString()

    }

    override fun getItemCount(): Int {
        return contact.size
    }

    class ContactsViewHolder(view: View): RecyclerView.ViewHolder(view){
        var contactName = view.findViewById<TextView>(R.id.name)
        var phoneNumber = view.findViewById<TextView>(R.id.phone)
    }

}