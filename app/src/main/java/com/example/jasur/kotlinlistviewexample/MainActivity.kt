package com.example.jasur.kotlinlistviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //listview init
        listView = findViewById(R.id.listView)

        //setting array of items which will be displayed on list view
        val clubs = arrayOf("Arsenal",
                            "Aston Villa",
                            "Chelsea",
                            "Everton",
                            "Fulham",
                            "Hull City",
                            "Ipswich Town",
                            "Manchester United",
                            "Manchester City",
                            "Stoke City",
                            "Southampton",
                            "Sunderland",
                            "West Ham United",
                            "Arsenal",
                            "Aston Villa",
                            "Chelsea",
                            "Everton",
                            "Fulham",
                            "Hull City",
                            "Ipswich Town",
                            "Manchester United",
                            "Manchester City")

        //setting adapter
        listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, clubs)
    }
}
