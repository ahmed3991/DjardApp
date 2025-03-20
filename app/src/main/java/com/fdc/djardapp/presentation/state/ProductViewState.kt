package com.fdc.djardapp.presentation.state

import com.fdc.djardapp.data.model.Product

data class ProductViewState(
    val products : List<Product> = emptyList(),
    val name : String = "Put your name",
    val age : Int = 0
)
