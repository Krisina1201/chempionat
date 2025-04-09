package org.example.testik

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.example.testik.ui.screen.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Multiplatform",
    ) {
        App()
    }
}