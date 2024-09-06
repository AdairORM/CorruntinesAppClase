package com.example.corruntinesapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.corruntinesapp.R

@Composable
fun CoroutinesApp(modifier: Modifier = Modifier ){
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = stringResource(R.string.cambio_de_color))

            }
        Spacer(modifier = modifier.height(30.dp))

            Text(text = stringResource(R.string.datos_web))
        Button(onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = R.string.realizar_consulta))

}

    }
}

