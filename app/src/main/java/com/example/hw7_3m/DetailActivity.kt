package com.example.hw7_3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw7_3m.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        binding.resNameTv.text = name
    }
}