package com.anncode.bootcampkmm.presentation.goal

import com.anncode.bootcampkmm.domain.goal.Goal
import com.anncode.bootcampkmm.domain.goal.GoalDay
import com.anncode.bootcampkmm.domain.goal.repository.GoalsRepository
import com.anncode.bootcampkmm.presentation.AbstractViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.LocalDate
import kotlinx.datetime.daysUntil
import kotlinx.datetime.number
import kotlinx.datetime.plus

class GoalViewModel(
    private val goalsRepository: GoalsRepository
) : AbstractViewModel() {

    private val _uiState = MutableStateFlow(UIState())
    val onState: StateFlow<UIState> = _uiState.asStateFlow()

    private val months = MutableStateFlow(emptyList<String>())
    private val days = MutableStateFlow(emptyList<String>())

    fun onEvent(intent: UIEvent) {
        when (intent) {
            is UIEvent.LoadDaysAndMonths -> {
                months.value = intent.months
                days.value = intent.weekDays
            }
            is UIEvent.LoadGoals -> getGoalsBy(intent.date)
            is UIEvent.SaveGoal -> saveGoal(intent.goal)
            is UIEvent.OnCompleteGoal -> completeGoal(intent.goalDay)
        }
    }

    private fun completeGoal(goalDay: GoalDay) {
        coroutineScope.launch {
            goalsRepository.completeGoal(goalDay)
        }
    }

    private fun saveGoal(goal: Goal) {
        coroutineScope.launch {
            goalsRepository.insertGoal(goal)
        }
    }

    private fun getGoalsBy(date: LocalDate) {
        val currentMonthIndex = date.month.ordinal
        val currentDayIndex = date.dayOfMonth - 1
        coroutineScope.launch {
            goalsRepository.insertGoalByDate(date)
        }
        coroutineScope.launch {
            try {
                val goals = goalsRepository.getGoalsBy(date)
                _uiState.update { currentState ->
                    currentState.copy(
                        goals = goals,
                        month = months.value[currentMonthIndex],
                        currentWeekDay = days.value[date.dayOfWeek.ordinal],
                        currentDayIndex = currentDayIndex,
                        days = daysPerMonth(date.year, date.month.number),
                    )
                }
            } catch (e: Throwable) {
                // Error
                println("Error: ${e.printStackTrace()}")
            }
        }


    }

    private fun daysPerMonth(year: Int, month: Int): List<String> {
        val startMonth = LocalDate(year, month, 1)
        val endMonth = startMonth.plus(1, DateTimeUnit.MONTH)
        val totalDays = startMonth.daysUntil(endMonth)
        return (1..totalDays).map { it.toString() }
    }
}
data class UIState(
    val month: String = "",
    val days: List<String> = emptyList(),
    val currentWeekDay: String = "",
    val currentDayIndex: Int = 0,
    val goals: List<GoalDay> = emptyList(),
    val userName: String = ""
)

sealed class UIEvent{

    data class LoadDaysAndMonths(
        val weekDays: List<String>,
        val months: List<String>
    ) : UIEvent()
    data class LoadGoals(
        val date: LocalDate
    ) : UIEvent()
    data class OnCompleteGoal(
        val goalDay: GoalDay
    ) : UIEvent()

    data class SaveGoal(val goal: Goal) : UIEvent()
}
