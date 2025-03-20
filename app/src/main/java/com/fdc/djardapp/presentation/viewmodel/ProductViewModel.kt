package com.fdc.djardapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fdc.djardapp.domain.usecase.GetProductsUseCase
import com.fdc.djardapp.presentation.state.ProductViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(private val getProductsUseCase: GetProductsUseCase) : ViewModel() {
    private val _uiState = MutableStateFlow(ProductViewState(name = "Ahmed", age = 3))
    val uiState= _uiState.asStateFlow()

    fun changeName(){

        viewModelScope.launch {
            delay(3000)
            _uiState.value = _uiState.value.copy(name = "Sinwar", products = getProductsUseCase())
        }
    }

    init {
        changeName()
    }

}