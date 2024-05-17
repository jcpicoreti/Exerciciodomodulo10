package com.example.exerciciodomodulo10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

val contact: MutableList<ContactInfo> = mutableListOf()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.listaDeContatos)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listView = findViewById<RecyclerView>(R.id.recycleLista)

        createMockData()
        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = ContactsAdapter(contact)
    }

    private fun createMockData() {
        contact.add(ContactInfo("Julio", "99999999"))
        contact.add(ContactInfo("Alice Silva", "555-1234"))
        contact.add(ContactInfo("Bruno Costa", "555-5678"))
        contact.add(ContactInfo("Carla Ferreira", "555-9101"))
        contact.add(ContactInfo("Daniel Almeida", "555-1121"))
        contact.add(ContactInfo("Eduarda Lima", "555-3141"))
        contact.add(ContactInfo("Felipe Santos", "555-5161"))
        contact.add(ContactInfo("Gabriela Rocha", "555-7181"))
        contact.add(ContactInfo("Henrique Sousa", "555-9202"))
        contact.add(ContactInfo("Isabela Pinto", "555-2232"))
        contact.add(ContactInfo("Jorge Teixeira", "555-4252"))
        contact.add(ContactInfo("Karen Ribeiro", "555-6272"))
        contact.add(ContactInfo("Lucas Moreira", "555-8292"))
        contact.add(ContactInfo("Mariana Cardoso", "555-1313"))
        contact.add(ContactInfo("Nicolas Mendes", "555-3333"))
        contact.add(ContactInfo("Olivia Azevedo", "555-5353"))
        contact.add(ContactInfo("Pedro Correia", "555-7373"))
        contact.add(ContactInfo("Quenia Dias", "555-9393"))
        contact.add(ContactInfo("Rafael Barros", "555-1414"))
        contact.add(ContactInfo("Sofia Cunha", "555-3434"))
        contact.add(ContactInfo("Tiago Vieira", "555-5454"))
    }
}
