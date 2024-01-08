package com.example.hw7_3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw7_3m.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container_first, FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_second, SecondFragment()).commit()
    }
}