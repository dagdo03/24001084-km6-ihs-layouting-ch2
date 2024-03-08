package com.example.challenge2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.challenge2.adapter.CatalogAdapter
import com.example.challenge2.databinding.ActivityMainBinding
import com.example.challenge2.model.Category
import com.example.challenge2.adapter.CategoryAdapter
import com.example.challenge2.model.Catalog

// aproach by binding
class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val categoryAdapter = CategoryAdapter()
    private val catalogAdapter = CatalogAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListCategory()
        setListCatalog()
    }

    private fun setListCategory() {
        val data = listOf(
            Category(image = R.drawable.ic_burger, name = "Burger"),
            Category(image = R.drawable.ic_cake, name = "Cake"),
            Category(image = R.drawable.ic_ramen, name = "Ramen"),
            Category(image = R.drawable.ic_salad, name = "Salad"),
            Category(image = R.drawable.ic_sushi, name = "Sushi"),
            Category(image = R.drawable.ic_steak, name = "Steak"),
            Category(image = R.drawable.ic_pizza, name = "Pizza"),
            Category(image = R.drawable.ic_pasta, name = "Pasta")
        )
        binding.rvCategory.apply {
            adapter = this@MainActivity.categoryAdapter
        }
        categoryAdapter.submitData(data)
    }

    private fun setListCatalog() {
        val data = listOf(
            Catalog(image = R.drawable.img_burger, name = "Burger", price = 70000.00),
            Catalog(image = R.drawable.img_wagyu, name = "Wagyu Steak", price = 80000.00),
            Catalog(image = R.drawable.img_fruit_salad, name = "Fruit Salad", price = 70000.00),
            Catalog(image = R.drawable.img_salad, name = "Salad", price = 50000.00),
            Catalog(image = R.drawable.img_sushi_roll, name = "Sushi Roll", price = 100000.00),
            Catalog(image = R.drawable.img_burger_double_beef, name = "Burger Double Beef", price = 90000.00),
            Catalog(image = R.drawable.img_burger_double_cheese, name = "Burger Double Cheese", price = 75000.00),
            Catalog(image = R.drawable.img_strawberry_cake, name = "Strawberry Cake", price = 60000.00),
            Catalog(image = R.drawable.img_chocolate_cake, name = "Chocolate Cake", price = 70000.00),
        )
        binding.rvCatalog.apply {
            adapter = this@MainActivity.catalogAdapter
        }
        catalogAdapter.submitData(data)
    }
}