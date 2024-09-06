package com.example.corruntinesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.corruntinesapp.ui.CoroutinesApp
import com.example.corruntinesapp.ui.theme.CorruntinesAppTheme
import com.example.corruntinesapp.viewmodel.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel:MainViewModel by viewModels()
        enableEdgeToEdge()
        setContent {
            CorruntinesAppTheme {
              CoroutinesApp(viewModel)
            }
        }
    }
}

