package com.anncode.bootcampkmm.presentation.composables.core

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GoalCenterTopBar(title: String, navigator: Navigator) {
    CenterAlignedTopAppBar(
        title = {
            Text(title)
        },
        navigationIcon = {
            IconButton(
                onClick = {
                    navigator.pop()
                }
            ) {
                Icon(imageVector = Icons.Default.ArrowBackIosNew, contentDescription = "Back")
            }
        }
    )
}