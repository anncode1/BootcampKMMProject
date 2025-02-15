package com.anncode.bootcampkmm

import androidx.compose.runtime.Composable

@Composable
expect fun AppDialog(
    onConfirmed: () -> Unit,
    onDismissed: () -> Unit,
    message: String
)