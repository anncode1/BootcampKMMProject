package com.anncode.bootcampkmm.data

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import com.anncode.bootcampkmm.composeApp.database.GoalsDB
import com.anncode.bootcampkmm.domain.goal.Goal
import com.anncode.bootcampkmm.domain.goal.GoalDay
import com.anncode.bootcampkmm.domain.goal.repository.GoalsRepository
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate

class GoalsRepositoryImpl(
    goalsDB: GoalsDB
) : GoalsRepository {

    private val queries = goalsDB.goalsQueries

    companion object {
        const val DATABASE_NAME = "goals.db"
    }

    override suspend fun insertGoal(goal: Goal) {
        queries.insertGoal(
            title = goal.title,
            description = goal.description,
            icon = goal.icon,
            frequency = goal.frequency.joinToString(",")
            //TUESDAY,THURSDAY
        )
    }

    override suspend fun insertGoalByDate(date: LocalDate) {
        // 2025-02-25
        val frequency = "%${date.dayOfWeek.name}%" //--> %TUESDAY%

        queries.selectGoalByDay(frequency)
            .executeAsList()
            .forEach { goalEntity ->
                val exists = queries
                    .selectGoalDayByIdAndDate(goalEntity.id, date.toString()).executeAsOneOrNull()
                if (exists == null) {
                    queries.insertGoalDay(goalEntity.id, date.toString(), false)
                }
            }
    }

    override suspend fun getGoalsBy(date: LocalDate): Flow<List<GoalDay>> {
        return queries.selectGoalsByDate(date.toString())
            .asFlow()
            .mapToList(currentCoroutineContext())
            .map { goalDayEntities ->
                goalDayEntities.map { goalEntity ->
                    GoalDay(
                        id = goalEntity.id_,
                        goal = Goal(
                            id = goalEntity.id,
                            title = goalEntity.title,
                            description = goalEntity.description.orEmpty(),
                            icon = goalEntity.icon,
                            frequency = goalEntity.frequency.toFrequency()
                            //TUESDAY,THURSDAY
                        ),
                        isCompleted = goalEntity.isCompleted,
                        date = LocalDate.parse(goalEntity.date)
                    )
                }
            }
    }

    override suspend fun completeGoal(goalDay: GoalDay) {
        queries.updateIsCompletedGoal(goalDay.isCompleted, goalDay.goal.id, goalDay.date.toString())
    }

    override suspend fun getAllGoals(): Flow<List<Goal>> {
        TODO("Not yet implemented")
    }
}

fun String.toFrequency(): Set<DayOfWeek> {
    return this.split(",").map { DayOfWeek.valueOf(it) }.toSet()
}