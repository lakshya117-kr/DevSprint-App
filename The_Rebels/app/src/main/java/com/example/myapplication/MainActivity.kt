package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.myapplication.databinding.ActivityMainBinding // If using ViewBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // The code must be inside a listener or function
        binding.buttonName.setOnClickListener {
            lifecycleScope.launch {
                try {
                    val result = RetrofitInstance.adviceApi.getRandomAdvice()
                    binding.textView.text = result.slip.advice
                } catch (e: Exception) {
                    binding.textView.text = "Error: ${e.message}"
                }
            }
        }
    }
}