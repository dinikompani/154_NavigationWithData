package com.example.esjumbo.data

import androidx.navigation.NavBackStackEntry

data class OrderUiState(

    val jumlah: NavBackStackEntry = 0,
    val rasa: NavBackStackEntry = "",
    val harga: String = "",
)

