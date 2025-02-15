package com.anncode.bootcampkmm

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import bootcampkmmproject.composeapp.generated.resources.Res
import bootcampkmmproject.composeapp.generated.resources.compose_multiplatform
import bootcampkmmproject.composeapp.generated.resources.tea
import bootcampkmmproject.composeapp.generated.resources.week_days
import bootcampkmmproject.composeapp.generated.resources.welcome
import coil3.compose.AsyncImage
import com.anncode.bootcampkmm.theme.AppTheme
import org.jetbrains.compose.resources.stringArrayResource
import org.jetbrains.compose.resources.stringResource

@Composable
@Preview
fun App() {
    AppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background

        ) {
            Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
                Text(
                    text = stringResource(Res.string.welcome),
                    style = MaterialTheme.typography.displayLarge
                )

                Text(
                    text = "Lunes 2 de Febrero",
                    style = MaterialTheme.typography.displayMedium
                )

                Text(
                    text = "Lunes 2 de Febrero",
                    style = MaterialTheme.typography.displaySmall
                )

                Text(
                    text = "Lunes 2 de Febrero",
                    style = MaterialTheme.typography.headlineLarge
                )

                Text(
                    text = "Lunes 2 de Febrero",
                    style = MaterialTheme.typography.headlineMedium
                )

                Text(
                    text = "Lunes 2 de Febrero",
                    style = MaterialTheme.typography.headlineSmall
                )

                stringArrayResource(Res.array.week_days).forEach {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.headlineSmall
                    )
                }

                Image(
                    painterResource(Res.drawable.tea),
                    contentDescription = "Tea image"
                )

                AsyncImage(
                    model = "https://kotlinlang.org/_next/static/chunks/images/hero-cover-6dd34ed75729683235a4f47d714a604e.png",
                    contentDescription = "Kotlin Multiplatform Rocks"
                )


                var email by rememberSaveable { mutableStateOf("") }
                var password by rememberSaveable { mutableStateOf("") }
                var showDialog by rememberSaveable { mutableStateOf(false) }

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text("email")
                    },
                    value = email,
                    onValueChange = {
                        email = it
                    },
                    singleLine = true,
                    maxLines = 1
                )

                TextField(
                    modifier = Modifier.fillMaxWidth(),
                    value = password,
                    onValueChange = { password = it },
                    label = {
                        Text("Password")
                    },
                    singleLine = true,
                    maxLines = 1,
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )

                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        showDialog = true
                    }
                ) {
                    Text("Sing In")
                }


                if (showDialog) {
                    /*AlertDialog(
                        title = { Text("Te damos la bienvenida") },
                        text = { Text("Hola $email") },
                        onDismissRequest = { showDialog = false },
                        confirmButton = {
                            TextButton(onClick = {
                                showDialog = false
                            }) { Text("Aceptar") }
                        },
                        dismissButton = {
                            TextButton(onClick = {
                                showDialog = false
                            }) { Text("Cancelar") }
                        }
                    )*/
                    AppDialog(
                        onConfirmed = {showDialog = false},
                        onDismissed = {showDialog = false},
                        message = "Hola $email"
                    )
                }
            }
        }
    }
}