package com.anncode.bootcampkmm.data.di

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.anncode.bootcampkmm.composeApp.database.GoalsDB
import com.anncode.bootcampkmm.data.GoalsRepositoryImpl

actual class DatabaseDriverFactory(
    private val context: Context
) {
    actual val driver: SqlDriver
        get() {
            return AndroidSqliteDriver(GoalsDB.Schema, context, GoalsRepositoryImpl.DATABASE_NAME)
        }
}