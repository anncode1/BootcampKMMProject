package com.anncode.bootcampkmm.presentation.goal

import com.anncode.bootcampkmm.domain.goal.Goal
import com.anncode.bootcampkmm.presentation.AbstractViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class GoalViewModel : AbstractViewModel() {

    private val _uiState = MutableStateFlow(UIState())
    val onState: StateFlow<UIState> = _uiState.asStateFlow()

    fun onEvent(intent: UIEvent) {
        when (intent) {
            is UIEvent.OnGoalCompleted -> {}
            is UIEvent.SaveGoal -> {
                _uiState.update { currentState ->
                    currentState.copy(goals = currentState.goals + intent.goal, userName = "Anahi")
                }
            }
        }
    }

}
data class UIState(
    val goals: List<Goal> = emptyList(),
    val userName: String = ""
)

sealed class UIEvent{
    data class OnGoalCompleted(val goal: Goal) : UIEvent()
    data class SaveGoal(val goal: Goal) : UIEvent()
}
