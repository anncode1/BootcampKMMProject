package com.anncode.bootcampkmm.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

open class AppScreen : Screen {

    open val contentComposable: @Composable () -> Unit = { }
    open val topBarTitle: (@Composable () -> Unit)? = null

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {

        val navigator = LocalNavigator.currentOrThrow
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                topBarTitle?.let { titleComposable ->
                    CenterAlignedTopAppBar(
                        title = {
                            titleComposable()
                        },
                        navigationIcon = {
                            IconButton(
                                onClick = {
                                    navigator.pop()
                                }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.ArrowBackIosNew,
                                    contentDescription = "Back"
                                )
                            }
                        }
                    )
                }
            }
        ) { padding ->
            Column(
                modifier = Modifier.fillMaxSize().padding(16.dp)
            ) {
                contentComposable()
            }
        }
    }

}