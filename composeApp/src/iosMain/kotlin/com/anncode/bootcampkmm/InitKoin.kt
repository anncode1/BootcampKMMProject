package com.anncode.bootcampkmm

import com.anncode.bootcampkmm.data.di.DatabaseDriverFactory
import com.anncode.bootcampkmm.data.di.dataModule

fun initKoin() {
    appStartKoin {
        modules(
            dataModule(
                driverFactory = DatabaseDriverFactory()
            )
        )
    }
}