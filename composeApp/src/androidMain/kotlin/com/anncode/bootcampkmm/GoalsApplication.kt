package com.anncode.bootcampkmm

import android.app.Application
import com.anncode.bootcampkmm.data.di.DatabaseDriverFactory
import com.anncode.bootcampkmm.data.di.dataModule
import org.koin.android.ext.koin.androidContext

class GoalsApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // initialize Koin
        appStartKoin {
            androidContext(this@GoalsApplication)
            modules(
                dataModule(
                    driverFactory = DatabaseDriverFactory(this@GoalsApplication)
                )
            )
        }
    }
}