package com.anncode.bootcampkmm.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.LocalDrink
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
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
import com.anncode.bootcampkmm.presentation.composables.core.ChipGroup
import com.anncode.bootcampkmm.presentation.composables.core.GoalScaffold
import com.anncode.bootcampkmm.presentation.composables.goal.GoalCard
import com.anncode.bootcampkmm.presentation.goal.AddGoalScreen
import com.anncode.bootcampkmm.presentation.goal.GoalViewModel
import com.anncode.bootcampkmm.presentation.goal.UIEvent
import org.jetbrains.compose.resources.stringArrayResource
import org.jetbrains.compose.resources.stringResource

class HomeScreen(private val viewModel: GoalViewModel) : Screen {

    @Composable
    override fun Content() {
        Home(viewModel)
    }
}


@Composable
fun Home(viewModel: GoalViewModel) {
    GoalScaffold {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {

            val homeState by viewModel.onState.collectAsState()
            var months by rememberSaveable { mutableStateOf<List<String>>(emptyList()) }
            months = stringArrayResource(Res.array.months)

            LaunchedEffect(key1 = months) {
                viewModel.onEvent(UIEvent.LoadMonths(months))
                viewModel.onEvent(UIEvent.LoadGoals())
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(18.dp)
            ) {
                Column {
                    Text(
                        homeState.month,
                        style = MaterialTheme.typography.titleMedium
                    )

                    ChipGroup(
                        modifier = Modifier.size(55.dp),
                        elements = homeState.days,
                        initialState = homeState.currentDayIndex
                    ) { index, day ->
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
                            GoalCard(
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
}