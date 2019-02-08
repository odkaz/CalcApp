package com.letsbuildthatapp.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result_page.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        Log.d("kotlintest", editText1.toString())
        Log.d("kotlintest", editText2.toString())
        if (editText1.getText().toString() != "" && editText2.getText().toString() != "") {
            val intent = Intent(this, ResultPage::class.java)
            var res: Double = 0.0
            val num1: Double = editText1.getText().toString().toDouble()
            val num2: Double = editText2.getText().toString().toDouble()

            when (v?.id) {
                R.id.button1 -> {
                    res = num1 + num2
                }
                R.id.button2 -> {
                    res = num1 - num2
                }
                R.id.button3 -> {
                    res = num1 * num2
                }
                R.id.button4 -> {
                    res = (num1 / num2)
                }

            }
            intent.putExtra("RESULT", res)
            startActivity(intent)

        }else if (v != null){
                    Snackbar.make(v, "please insert number in the text editor", Snackbar.LENGTH_LONG).setAction("Action", null).show()

        }else if (editText1.toString() == "" || editText2.toString() == ""){
            Log.d("kotlintest", "failure")
        }
    }
}
