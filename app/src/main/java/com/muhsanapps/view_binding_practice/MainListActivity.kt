package com.muhsanapps.view_binding_practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhsanapps.view_binding_practice.databinding.ActivityMainListBinding

class MainListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvUsers.layoutManager = LinearLayoutManager(this)
        binding.rvUsers.adapter = UserListAdapter(getUserList())
    }

    private fun getUserList() : List<User> {
        val userList = mutableListOf<User>()
        for (i in 1..20) {
            userList.add(User("username $i", i))
        }
        return userList
    }

}

data class User(val username: String, val age:Int)