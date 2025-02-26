package com.anncode.bootcampkmm.presentation.di

import com.anncode.bootcampkmm.presentation.goal.GoalViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

actual fun presentationModule() = module {
    viewModel {
        GoalViewModel(get())
    }
}