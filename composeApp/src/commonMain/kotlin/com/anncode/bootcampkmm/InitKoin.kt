package com.anncode.bootcampkmm

import com.anncode.bootcampkmm.presentation.di.presentationModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun appStartKoin(
    appDeclaration: KoinAppDeclaration = {}
) {

    startKoin {
        appDeclaration()
        modules(
            presentationModule()
        )
    }

}