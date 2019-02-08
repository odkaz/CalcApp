package com.letsbuildthatapp.calcapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_result_page.*
import kotlinx.android.synthetic.main.content_result_page.*

class ResultPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_page)
        setSupportActionBar(toolbar)

        val value1 = intent.getDoubleExtra("RESULT", 0.0)

        textView1.text = value1.toString()
    }

}
