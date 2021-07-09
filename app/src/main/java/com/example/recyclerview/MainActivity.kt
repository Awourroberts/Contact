package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number()


    }

    fun number() {
        var contactList = listOf<Contact>(
            Contact("Sophie", "0763567812", "sophierobbert@gmail.com"),
            Contact("Jackline", "0778756780", "jacklinecheptanui@gmail.com"),
            Contact("Endah", "0703567872", "endahmukami@gmail.com"),
            Contact("Brian", "0763569012", "brianadell@gmail.com"),
            Contact("Barack", "0763567815", "barackogall@gmail.com"),
            Contact("Robert", "0722356781", "robertjadel@gmail.com"),
            Contact("Samuel", "0740767800", "samuelpoul@gmail.com")

        )
        rvContact=findViewById(R.id.rvContact)
        var ContactAdapter=ContactRecyclerView(contactList)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter= ContactAdapter



    }
    }