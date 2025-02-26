package com.anncode.bootcampkmm.domain.goal.repository

import com.anncode.bootcampkmm.domain.goal.Goal
import com.anncode.bootcampkmm.domain.goal.GoalDay
import kotlinx.coroutines.flow.Flow
import kotlinx.datetime.LocalDate

interface GoalsRepository {
    suspend fun insertGoal(goal: Goal)
    suspend fun insertGoalByDate(date: LocalDate)
    suspend fun getGoalsBy(date: LocalDate): Flow<List<GoalDay>>
    suspend fun completeGoal(goalDay: GoalDay)
    suspend fun getAllGoals(): Flow<List<Goal>>
}