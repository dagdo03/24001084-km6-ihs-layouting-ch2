package com.example.challenge2.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.challenge2.R
import com.example.challenge2.adapter.CatalogAdapter
import com.example.challenge2.databinding.ActivityMainBinding
import com.example.challenge2.data.model.Category
import com.example.challenge2.adapter.CategoryAdapter
import com.example.challenge2.data.model.Catalog

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}