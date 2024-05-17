package com.example.exerciciodomodulo10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(private val contactList: List<ContactInfo>) : RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contactlist, parent, false)
        return ContactsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact = contactList[position]
        holder.contactName.text = contact.name
        holder.phoneNumber.text = contact.phone
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    class ContactsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val contactName: TextView = view.findViewById(R.id.name)
        val phoneNumber: TextView = view.findViewById(R.id.phone)
    }
}
