package com.lumsum.hoolanla.kotlin

import android.app.Application
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.Toast
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {



    private  lateinit var mEditText: EditText
    private lateinit var mButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bindWidget()
        setEvents()

    }

    private fun setEvents() {

        mButton.setOnClickListener(View.OnClickListener { v ->
Toast.makeText(applicationContext,"Hi" + mEditText.text,Toast.LENGTH_LONG).show()

        })
    }



    private fun bindWidget() {

        //Option + Enter get property var
       mEditText = findViewById(R.id.editText) as EditText
        mButton = findViewById(R.id.button) as Button
    }


}
