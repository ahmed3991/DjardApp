package com.fdc.djardapp.data.repository

import com.fdc.djardapp.data.model.Product

interface ProductRepository {

    fun getProducts(): List<Product>
    fun addProduct(product: Product)
}