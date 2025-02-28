package com.anncode.bootcampkmm.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
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
import bootcampkmmproject.composeapp.generated.resources.week_days
import bootcampkmmproject.composeapp.generated.resources.welcome
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.anncode.bootcampkmm.domain.goal.GoalDay
import com.anncode.bootcampkmm.presentation.composables.core.ChipGroup
import com.anncode.bootcampkmm.presentation.composables.core.GoalScaffold
import com.anncode.bootcampkmm.presentation.composables.goal.GoalCard
import com.anncode.bootcampkmm.presentation.goal.AddGoalScreen
import com.anncode.bootcampkmm.presentation.goal.GoalIcons
import com.anncode.bootcampkmm.presentation.goal.GoalViewModel
import com.anncode.bootcampkmm.presentation.goal.UIEvent
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.todayIn
import org.jetbrains.compose.resources.stringArrayResource
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.koinInject

class HomeScreen : Screen {

    @Composable
    override fun Content() {
        Home()
    }
}


@Composable
fun Home(viewModel: GoalViewModel = koinInject()) {
    GoalScaffold {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {

            val homeState by viewModel.onState.collectAsState()
            var months by rememberSaveable { mutableStateOf<List<String>>(emptyList()) }
            months = stringArrayResource(Res.array.months)

            var weekDays by rememberSaveable { mutableStateOf<List<String>>(emptyList()) }
            weekDays = stringArrayResource(Res.array.week_days)

            var currentDateSelected by rememberSaveable {
                mutableStateOf(
                    Clock.System.todayIn(
                        TimeZone.currentSystemDefault()
                    ).toString()
                )
            }

            LaunchedEffect(key1 = months) {
                viewModel.onEvent(UIEvent.LoadDaysAndMonths(weekDays, months))
                viewModel.onEvent(UIEvent.LoadGoals(LocalDate.parse(currentDateSelected)))
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(18.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().wrapContentHeight()
                ) {
                    // Days list
                    ChipGroup(
                        modifier = Modifier.size(55.dp),
                        title = homeState.month,
                        elements = homeState.days,
                        initialState = homeState.currentDayIndex
                    ) { _, day ->
                        val dateTmp = Clock.System.todayIn(TimeZone.currentSystemDefault())
                        currentDateSelected = LocalDate(dateTmp.year, dateTmp.month, day.toInt()).toString() // 2025-02-25
                        viewModel.onEvent(
                            UIEvent.LoadGoals(
                                date = LocalDate.parse(currentDateSelected)
                            )
                        )
                    }
                }

                Column(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        //stringResource(Res.string.welcome),
                        text = homeState.currentWeekDay,
                        style = MaterialTheme.typography.displaySmall
                    )

                    Text(
                        stringResource(Res.string.today_goals),
                        style = MaterialTheme.typography.titleMedium
                    )
                }

                if (homeState.goals.isNotEmpty()) {
                    LazyColumn(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(homeState.goals) { goalDay ->
                            GoalCard(
                                GoalIcons.valueOf(goalDay.goal.icon).icon,
                                goalDay.goal.title,
                                goalDay.goal.description,
                                goalDay.isCompleted
                            ) { isCompleted ->
                                viewModel.onEvent(
                                    UIEvent.OnCompleteGoal(
                                        GoalDay(
                                            goalDay.id,
                                            goal = goalDay.goal,
                                            date = goalDay.date,
                                            isCompleted = isCompleted
                                        )
                                    )
                                )
                            }
                        }
                    }
                }

            }

            val navigator = LocalNavigator.currentOrThrow
            FloatingActionButton(
                onClick = {
                    navigator.push(AddGoalScreen())
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