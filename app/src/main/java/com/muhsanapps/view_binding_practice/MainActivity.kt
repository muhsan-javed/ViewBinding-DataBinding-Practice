package com.muhsanapps.view_binding_practice

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.muhsanapps.view_binding_practice.databinding.ActivityMainBinding
import com.muhsanapps.view_binding_practice.fragments.BlankFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    
//    private lateinit var tv1 : TextView
//    private lateinit var tv2 : TextView
//    private lateinit var btnClickMe : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            tv_output1.text = "Hello World!"
            tv_output2.text = "Welcome to View Binding"
            btnClickMe.setOnClickListener {
                Toast.makeText(this@MainActivity, "Hi sir!!", Toast.LENGTH_SHORT).show()

                val   fragment = BlankFragment()

                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit()

            }

            binding.includedLayout.tvIncludeOutput.text = "View Binding in Included layout...."

            binding.btnNext.setOnClickListener {
                val i = Intent(applicationContext, MainListActivity::class.java)
                startActivity(i)
            }
        }



//        tv1 = findViewById(R.id.tv_output1)
//        tv1 = findViewById(R.id.tv_output2)
//        btnClickMe = findViewById(R.id.btnClickMe)

//        tv1.text = "Hello World!"
//        tv1.text = "Welcome to View Binding"

//        tv_output1.text = "Hello World!"
//        tv_output2.text = "Welcome to View Binding"
//
//        btnClickMe.setOnClickListener {
//            Toast.makeText(this, "Hi sir!!", Toast.LENGTH_SHORT).show()
//        }



    }
}