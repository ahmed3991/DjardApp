package com.fdc.djardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.fdc.djardapp.presentation.view.MainScreen
import com.fdc.djardapp.ui.theme.DjardAppTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DjardAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->


                    MainScreen(
                        name = "FDC Team !!!",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


