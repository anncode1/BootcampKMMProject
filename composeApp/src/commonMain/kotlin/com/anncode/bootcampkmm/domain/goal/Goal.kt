package com.anncode.bootcampkmm.domain.goal

import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate

data class Goal(
    val id: Long = 0,
    val title: String,
    val description: String,
    val icon: String,
    val frequency: Set<DayOfWeek>
)

data class GoalDay(
    val id: Long = 0,
    val goal: Goal,
    val date: LocalDate,
    val isCompleted: Boolean
)
