package com.fdc.djardapp.domain.usecase

import com.fdc.djardapp.data.model.Product
import com.fdc.djardapp.data.repository.ProductRepository
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(
    private val productRepository: ProductRepository
) {

    operator fun invoke(): List<Product> {
        return productRepository.getProducts()
    }
}