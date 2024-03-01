package com.example.contact.presentation.common
import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(title:String,showLeading:Boolean=false,navHostController: NavHostController) {

    TopAppBar(
        navigationIcon = {
            if(showLeading)
                IconButton(onClick = {
                 navHostController.popBackStack()
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back")
                }

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