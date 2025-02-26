package com.anncode.bootcampkmm.data.di

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.anncode.bootcampkmm.composeApp.database.GoalsDB
import com.anncode.bootcampkmm.data.GoalsRepositoryImpl

actual class DatabaseDriverFactory {
    actual val driver: SqlDriver
        get() {
            return NativeSqliteDriver(GoalsDB.Schema, GoalsRepositoryImpl.DATABASE_NAME)
        }
}