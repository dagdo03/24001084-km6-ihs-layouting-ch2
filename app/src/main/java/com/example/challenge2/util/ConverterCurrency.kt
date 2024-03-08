package com.example.challenge2.util

import java.lang.Exception
import java.text.NumberFormat
import java.util.Locale


    fun Double?.doubleToCurrency(language: String, country: String): String?{
        return try {
            val locale = Locale(language, country)
            val number = NumberFormat.getCurrencyInstance(locale)
            number.format(this).toString()
        }catch (e: Exception){
            null
        }
    }
    fun Double?.toIndonesianFormat() = this.doubleToCurrency("in","ID")
