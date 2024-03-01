package com.example.contact.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.contact.presentation.common.AppBar
import com.example.contact.presentation.navigation.Navigations

@Composable

fun Home(navHostController: NavHostController) {
    Scaffold (
        topBar = {
            AppBar(title = "Contacts",navHostController=navHostController)
        },
        floatingActionButton = {
            FloatingActionButton(
                shape = FloatingActionButtonDefaults.largeShape,
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
                onClick = {
                    navHostController.navigate(route = Navigations.AddContact.route)

            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription ="Add contact" )
            }
        }
    ){
        paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

        }

    }


}

@Preview
@Composable
fun PreviewHome(){
 Home(navHostController = rememberNavController())
}