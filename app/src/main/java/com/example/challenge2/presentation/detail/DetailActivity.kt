package com.example.challenge2.presentation.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.challenge2.R
import com.example.challenge2.data.model.Catalog
import com.example.challenge2.databinding.ActivityDetailBinding
import com.example.challenge2.util.fromCurrencyToDouble
import com.example.challenge2.util.toIndonesianFormat

class DetailActivity : AppCompatActivity() {
    private var amount: Int = 1
    private var location: String? = ""

    companion object {
        const val EXTRAS_DETAIL_DATA = "EXTRAS_DETAIL_DATA"
    }

    private val binding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setOnClick()
        setCatalogData()
        updatePrice(amount)
        setContentView(binding.root)
    }

    private fun updatePrice(amount: Int) {
        val price = binding.layoutDesc.tvMenuPrice.text.toString().fromCurrencyToDouble() ?: 0.0
        val total = price * amount
        val formattedTotalPrice = total.toIndonesianFormat()
        val buttonText = getString(R.string.text_add_to_cart_button, formattedTotalPrice)
        binding.layoutAddToCart.bAddToCartButton.text = buttonText
    }

    private fun setOnClick() {
        binding.layoutAddToCart.let {
            it.ivDecrementButton.setOnClickListener {
                updateAmount(amount - 1)
            }
        }
        binding.layoutAddToCart.let {
            it.ivIncrementButton.setOnClickListener {
                updateAmount(amount + 1)
            }
        }
        binding.layoutHeader.let {
            it.ivIconBackButton.setOnClickListener {
                onBackPressed()
            }
        }
        binding.layoutLocation.let {
            it.tvLocationDesc.setOnClickListener {
                openMaps()
            }
        }
    }

    private fun openMaps() {
        val mapsURL = Uri.parse(location)
        val mapIntent = Intent(Intent.ACTION_VIEW, mapsURL)
        startActivity(mapIntent)
    }

    private fun updateAmount(total: Int) {
        val newAmount = maxOf(0, total)
        amount = newAmount
        binding.layoutAddToCart.tvCounterText.text = newAmount.toString()
        updatePrice(newAmount)
    }


    private fun setCatalogData() {
        intent.extras?.getParcelable<Catalog>(EXTRAS_DETAIL_DATA)?.let {
            location = it.locationURL
            binding.layoutHeader.vBackgroundPictureActivityDetail.setBackgroundResource(it.image)
            binding.layoutDesc.tvMenuTitle.text = it.name
            binding.layoutDesc.tvMenuPrice.text = it.price.toIndonesianFormat()
            binding.layoutDesc.tvMenuDesc.text = it.description
            binding.layoutLocation.tvLocationDesc.text = it.location
        }
    }
}