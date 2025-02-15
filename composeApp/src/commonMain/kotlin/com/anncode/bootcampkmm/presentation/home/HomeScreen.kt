package com.anncode.bootcampkmm.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.ImportContacts
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.LocalDrink
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import bootcampkmmproject.composeapp.generated.resources.Res
import bootcampkmmproject.composeapp.generated.resources.months
import bootcampkmmproject.composeapp.generated.resources.today_goals
import bootcampkmmproject.composeapp.generated.resources.welcome
import com.anncode.bootcampkmm.presentation.composables.core.ChipGroup
import com.anncode.bootcampkmm.presentation.composables.goal.Goal
import org.jetbrains.compose.resources.stringArrayResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            Column {
                Text(
                    stringArrayResource(Res.array.months)[2],
                    style = MaterialTheme.typography.titleMedium
                )
                val l = 1..30
                ChipGroup(elements = l.toList(), initialState = 0) { _, _ ->

                }
            }

            Column {
                Text(
                    stringResource(Res.string.welcome),
                    style = MaterialTheme.typography.displaySmall
                )

                Text(
                    stringResource(Res.string.today_goals),
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Column {
                Goal(
                    Icons.Default.LocalDrink,
                    "Drink watter",
                    "Beber agua es bueno para la salud"
                )
                Goal(
                    Icons.Filled.LightMode,
                    "Despertar temprano",
                    "Beber agua es bueno para la salud"
                )
                Goal(
                    Icons.Default.FitnessCenter,
                    "Ejercitarse",
                    "Beber agua es bueno para la salud"
                )
                Goal(
                    Icons.Default.Bedtime,
                    "Dormir temprano",
                    "Beber agua es bueno para la salud",
                )
                Goal(
                    Icons.Default.ImportContacts,
                    "Leer",
                    "Beber agua es bueno para la salud",
                )
            }

        }

        FloatingActionButton(
            onClick = { },
            modifier = Modifier.align(Alignment.BottomEnd)
        ) {
            Image(
                painter = rememberVectorPainter(Icons.Default.Add),
                contentDescription = "Add"
            )
        }
    }
}