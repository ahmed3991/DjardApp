package com.fdc.djardapp.domain.usecase

import com.fdc.djardapp.data.model.Product
import com.fdc.djardapp.data.repository.ProductRepository
import com.fdc.djardapp.data.repository.ProductRepositoryImpl
import javax.inject.Inject

class AddProductUseCase @Inject constructor(private val productRepository: ProductRepository) {

    operator fun invoke(product: Product){
        productRepository.addProduct(product)
    }
}