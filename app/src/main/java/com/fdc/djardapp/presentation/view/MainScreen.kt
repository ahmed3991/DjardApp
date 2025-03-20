package com.fdc.djardapp.presentation.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.fdc.djardapp.presentation.viewmodel.ProductViewModel


@Composable
fun MainScreen(name: String, modifier: Modifier = Modifier,
               ProductViewModel: ProductViewModel = hiltViewModel()) {

    val uiState =ProductViewModel.uiState.collectAsState()

    Column {
        Text(text=uiState.value.name,
            fontSize = 70.sp)
    }

    Spacer(modifier=Modifier.padding(20.dp))

    LazyColumn {
        items(uiState.value.products) { product ->
            Text(
                text = product.name,
                fontSize = 36.sp,
                modifier = modifier
            )
        }
    }

}