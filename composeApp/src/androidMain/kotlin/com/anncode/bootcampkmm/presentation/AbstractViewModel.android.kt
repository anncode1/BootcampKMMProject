package com.anncode.bootcampkmm.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel

actual abstract class AbstractViewModel : ViewModel() {

    actual val coroutineScope: CoroutineScope = viewModelScope

    actual fun dispose() {
        coroutineScope.cancel()
    }
}