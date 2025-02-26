package com.anncode.bootcampkmm.presentation.goal

import com.anncode.bootcampkmm.domain.goal.Goal
import com.anncode.bootcampkmm.domain.goal.GoalDay
import com.anncode.bootcampkmm.domain.goal.repository.GoalsRepository
import com.anncode.bootcampkmm.presentation.AbstractViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.datetime.Clock
import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.daysUntil
import kotlinx.datetime.number
import kotlinx.datetime.plus
import kotlinx.datetime.todayIn

class GoalViewModel(
    private val goalsRepository: GoalsRepository
) : AbstractViewModel() {

    private val _uiState = MutableStateFlow(UIState())
    val onState: StateFlow<UIState> = _uiState.asStateFlow()

    private val months = MutableStateFlow(emptyList<String>())

    fun onEvent(intent: UIEvent) {
        when (intent) {
            is UIEvent.LoadMonths -> months.value = intent.months
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
        val currentMonth = date.month.ordinal
        coroutineScope.launch {
            goalsRepository.insertGoalByDate(date)
        }
        coroutineScope.launch {
            goalsRepository.getGoalsBy(date)
                .catch {  } // errors
                .collect { goals ->
                    _uiState.update { currentState ->
                        currentState.copy(
                            goals = goals,
                            month = months.value[currentMonth],
                            currentDayIndex = date.dayOfMonth - 1,
                            days = daysPerMonth(date.year, date.month.number),
                        )
                    }
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
    val currentDayIndex: Int = 0,
    val goals: List<GoalDay> = emptyList(),
    val userName: String = ""
)

sealed class UIEvent{

    data class LoadMonths(
        val months: List<String> = emptyList()
    ) : UIEvent()
    data class LoadGoals(
        val date: LocalDate = Clock.System.todayIn(TimeZone.currentSystemDefault()),
    ) : UIEvent()

    data class SaveGoal(val goal: Goal) : UIEvent()
    data class OnCompleteGoal(
        val goalDay: GoalDay
    ) : UIEvent()
}
