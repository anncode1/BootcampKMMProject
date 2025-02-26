package com.anncode.bootcampkmm.presentation.di

import com.anncode.bootcampkmm.presentation.goal.GoalViewModel
import org.koin.dsl.module

actual fun presentationModule() = module {
    factory {
        GoalViewModel(get())
    }
}