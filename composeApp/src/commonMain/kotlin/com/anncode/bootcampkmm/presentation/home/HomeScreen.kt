package com.anncode.bootcampkmm.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import bootcampkmmproject.composeapp.generated.resources.Res
import bootcampkmmproject.composeapp.generated.resources.months
import bootcampkmmproject.composeapp.generated.resources.today_goals
import bootcampkmmproject.composeapp.generated.resources.welcome
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.anncode.bootcampkmm.presentation.AppScreen
import com.anncode.bootcampkmm.presentation.composables.core.ChipGroup
import com.anncode.bootcampkmm.presentation.composables.goal.Goal
import com.anncode.bootcampkmm.presentation.goal.AddGoal
import com.anncode.bootcampkmm.presentation.goal.AddGoalScreen
import com.anncode.bootcampkmm.presentation.goal.GoalViewModel
import org.jetbrains.compose.resources.stringArrayResource
import org.jetbrains.compose.resources.stringResource

class HomeScreen(private val viewModel: GoalViewModel) : AppScreen() {

    override val contentComposable: @Composable () -> Unit
        get() = { Home(viewModel) }
}


@Composable
fun Home(viewModel: GoalViewModel) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        val homeState  by viewModel.onState.collectAsState()

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

            if (homeState.goals.isNotEmpty()) {
                LazyColumn {
                    items(homeState.goals) { goal ->
                        Goal(
                            Icons.Default.LocalDrink,
                            goal.title,
                            goal.description
                        )
                    }
                }
            }

        }

        val navigator = LocalNavigator.currentOrThrow
        FloatingActionButton(
            onClick = {
                navigator.push(AddGoalScreen(viewModel))
            },
            modifier = Modifier.align(Alignment.BottomEnd)
        ) {
            Image(
                painter = rememberVectorPainter(Icons.Default.Add),
                contentDescription = "Add"
            )
        }
    }
}