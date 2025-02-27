package com.fdc.djardapp.data.repository

import com.fdc.djardapp.data.model.Product

class ProductRepository {

    private val products = listOf(
        Product(1, "Product 1", "Description 1", "https://via.placeholder.com/150"),
        Product(2, "Product 2", "Description 2", "https://via.placeholder.com/150"),
        Product(3, "Product 3", "Description 3", "https://via.placeholder.com/150")
    )

    fun getProducts(): List<Product> {
        return products
    }
}