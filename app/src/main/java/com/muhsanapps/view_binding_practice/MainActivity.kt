package com.muhsanapps.view_binding_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
//    private lateinit var tv1 : TextView
//    private lateinit var tv2 : TextView
//    private lateinit var btnClickMe : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
//        tv1 = findViewById(R.id.tv_output1)
//        tv1 = findViewById(R.id.tv_output2)
//        btnClickMe = findViewById(R.id.btnClickMe)

//        tv1.text = "Hello World!"
//        tv1.text = "Welcome to View Binding"

        tv_output1.text = "Hello World!"
        tv_output2.text = "Welcome to View Binding"

        btnClickMe.setOnClickListener {
            Toast.makeText(this, "Hi sir!!", Toast.LENGTH_SHORT).show()
        }
        
    }
}