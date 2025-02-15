package com.anncode.bootcampkmm

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.anncode.bootcampkmm.presentation.goal.AddGoalScreen
import com.anncode.bootcampkmm.presentation.home.HomeScreen
import com.anncode.bootcampkmm.presentation.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    AppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Box(
                modifier = Modifier.fillMaxSize().padding(16.dp)
            ) {
                HomeScreen()
                //AddGoalScreen()
                FloatingActionButton(
                    onClick = {},
                    modifier = Modifier.align(Alignment.BottomEnd)
                ) {
                    Image(
                        painter = rememberVectorPainter(Icons.Default.Add),
                        contentDescription = ""
                    )
                }
            }

        }
    }
}