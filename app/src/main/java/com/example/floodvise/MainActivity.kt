package com.example.floodvise

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.floodvise.databinding.ActivityMainBinding
import com.example.floodvise.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val addDeviceButton = binding.addDevice
        addDeviceButton.setOnClickListener {
            goToAddDeviceActivity()
        }
    }

    private  fun goToAddDeviceActivity() {
        val intent = Intent(this, AddDeviceActivity::class.java)
        startActivity(intent);
    }

    private fun goToLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent);
    }
}

