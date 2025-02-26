package com.anncode.bootcampkmm.data.di

import app.cash.sqldelight.db.SqlDriver
import com.anncode.bootcampkmm.composeApp.database.GoalsDB
import com.anncode.bootcampkmm.data.GoalsRepositoryImpl
import com.anncode.bootcampkmm.domain.goal.repository.GoalsRepository
import org.koin.dsl.module

fun dataModule(driverFactory: DatabaseDriverFactory) = module {
    single { driverFactory }
    single<GoalsRepository> {
        val driver = get<DatabaseDriverFactory>().driver
        GoalsRepositoryImpl(
            goalsDB = GoalsDB(
                driver
            )
        )
    }
}

expect class DatabaseDriverFactory {
    val driver: SqlDriver
}