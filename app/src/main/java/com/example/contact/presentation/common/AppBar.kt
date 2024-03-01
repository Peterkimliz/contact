package com.example.contact.presentation.common
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(title:String,showLeading:Boolean=false) {

    TopAppBar(
        navigationIcon = {
            if(showLeading)
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back")
        },
        title = {
                Text(text =title)
        },
        colors = topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
            ,
        scrolledContainerColor= MaterialTheme.colorScheme.onPrimary,
    navigationIconContentColor=MaterialTheme.colorScheme.onPrimary,
    titleContentColor=MaterialTheme.colorScheme.onPrimary,
    actionIconContentColor=MaterialTheme.colorScheme.onPrimary,


    )
    )
}