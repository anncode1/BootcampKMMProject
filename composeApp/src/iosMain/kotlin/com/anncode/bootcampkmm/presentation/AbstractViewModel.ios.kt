package com.anncode.bootcampkmm.presentation

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel

actual abstract class AbstractViewModel {
    actual val coroutineScope: CoroutineScope = CoroutineScope(Dispatchers.IO + SupervisorJob())

    actual fun dispose() {
        coroutineScope.cancel()
    }
}