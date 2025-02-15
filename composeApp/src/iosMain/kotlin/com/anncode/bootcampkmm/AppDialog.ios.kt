package com.anncode.bootcampkmm

import androidx.compose.runtime.Composable
import androidx.compose.ui.interop.LocalUIViewController
import platform.UIKit.UIAlertActionStyleDefault
import platform.UIKit.UIAlertController
import platform.UIKit.UIAlertControllerStyleActionSheet
import platform.UIKit.UIAlertAction.Companion.actionWithTitle
import platform.UIKit.UIAlertActionStyleDestructive
import platform.UIKit.UIAlertControllerStyleAlert

@Composable
actual fun AppDialog(
    onConfirmed: () -> Unit,
    onDismissed: () -> Unit,
    message: String
) {

    val alert = UIAlertController.alertControllerWithTitle(
        title = "Te damos la bienvenida",
        message = message,
        //preferredStyle = UIAlertControllerStyleActionSheet
        preferredStyle = UIAlertControllerStyleAlert
    )

    alert.addAction(
        actionWithTitle(title = "Cancel", style = UIAlertActionStyleDefault, handler = { onDismissed() })
    )

    alert.addAction(
        actionWithTitle(title = "Accept", style = UIAlertActionStyleDestructive, handler = { onConfirmed() })
    )

    LocalUIViewController.current.showViewController(alert, null)

}