package com.anncode.bootcampkmm.presentation.goal

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.ImportContacts
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.LocalDrink
import androidx.compose.material.icons.filled.Pets
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import bootcampkmmproject.composeapp.generated.resources.Res
import bootcampkmmproject.composeapp.generated.resources.description
import bootcampkmmproject.composeapp.generated.resources.frequency
import bootcampkmmproject.composeapp.generated.resources.new_goal
import bootcampkmmproject.composeapp.generated.resources.pick_icon
import bootcampkmmproject.composeapp.generated.resources.save_goal
import bootcampkmmproject.composeapp.generated.resources.title
import bootcampkmmproject.composeapp.generated.resources.week_days
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.anncode.bootcampkmm.domain.goal.Goal
import com.anncode.bootcampkmm.presentation.composables.core.ChipGroup
import com.anncode.bootcampkmm.presentation.composables.core.ChipGroupMultiselect
import com.anncode.bootcampkmm.presentation.composables.core.GoalCenterTopBar
import com.anncode.bootcampkmm.presentation.composables.core.GoalScaffold
import kotlinx.datetime.DayOfWeek
import org.jetbrains.compose.resources.stringArrayResource
import org.jetbrains.compose.resources.stringResource
import org.koin.compose.koinInject

class AddGoalScreen() : Screen {

    @Composable
    override fun Content() {
        AddGoal()
    }
}

@Composable
fun AddGoal(viewModel: GoalViewModel = koinInject()) {

    val navigator = LocalNavigator.currentOrThrow
    GoalScaffold (
        topBar = {
            GoalCenterTopBar(title = stringResource(Res.string.new_goal), navigator)
        }
    ) {

        Box(modifier = Modifier.fillMaxSize()) {
            var title by rememberSaveable { mutableStateOf("") }
            var description by rememberSaveable { mutableStateOf("") }
            var icon by rememberSaveable { mutableStateOf(GoalIcons.WATER.name) }
            val frequency by rememberSaveable {
                    mutableStateOf(
                        defaultDaysSelected().map { i ->
                            getDayWeekBy(i)
                        }.toMutableSet()
                    )
            }

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(stringResource(Res.string.title),)
                    },
                    value = title,
                    onValueChange = {
                        title = it
                    },
                    singleLine = true,
                    maxLines = 1
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(stringResource(Res.string.description),)
                    },
                    value = description,
                    onValueChange = {
                        description = it
                    },
                    maxLines = 2
                )

                ChipGroup(
                    title = stringResource(Res.string.pick_icon),
                    elements = GoalIcons.entries.map { it.icon },
                    initialState = 0,
                    onChipSelected = { _, iconVector ->
                        icon = GoalIcons.fromImageVector(iconVector).name
                    }
                )

                val weekDays = stringArrayResource(Res.array.week_days).mapNotNull {
                    it.firstOrNull()
                }

                ChipGroupMultiselect(
                    title = stringResource(Res.string.frequency),
                    elements = weekDays,
                    initialState = defaultDaysSelected(),
                    onChipSelected = { items ->
                        frequency.clear()
                        frequency.addAll(items.map { getDayWeekBy(it) })
                    }
                )

            }

            Button(
                modifier = Modifier.fillMaxWidth().align(Alignment.BottomCenter)
                    .padding(PaddingValues(0.dp, 0.dp, 0.dp, 16.dp)),
                onClick = {
                    viewModel.onEvent(
                        UIEvent.SaveGoal(
                            goal = Goal(
                                title = title,
                                description = description,
                                icon = icon,
                                frequency = frequency
                            )
                        )
                    )
                    navigator.pop()
                },
            ) {
                Text(stringResource(Res.string.save_goal))
            }
        }
    }

}

private fun defaultDaysSelected() = setOf(0, 2, 4)

fun getDayWeekBy(index: Int): DayOfWeek {
    return when (index) {
        0 -> DayOfWeek.MONDAY
        1 -> DayOfWeek.TUESDAY
        2 -> DayOfWeek.WEDNESDAY
        3 -> DayOfWeek.THURSDAY
        4 -> DayOfWeek.FRIDAY
        5 -> DayOfWeek.SATURDAY
        6 -> DayOfWeek.SUNDAY
        else -> DayOfWeek.MONDAY
    }
}

enum class GoalIcons(
    val icon: ImageVector
) {
    WATER(Icons.Default.LocalDrink),
    SUN(Icons.Default.LightMode),
    FITNESS(Icons.Default.FitnessCenter),
    SLEEP(Icons.Default.Bedtime),
    BOOK(Icons.Default.ImportContacts),
    PETS(Icons.Default.Pets);

    companion object {
        fun fromImageVector(icon: ImageVector): GoalIcons {
            return entries.find { it.icon == icon } ?: BOOK // Valor por defecto
        }
    }
}