package com.example.floodvise

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.floodvise.databinding.ActivityListDeviceBinding

class ListDeviceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListDeviceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListDeviceBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}