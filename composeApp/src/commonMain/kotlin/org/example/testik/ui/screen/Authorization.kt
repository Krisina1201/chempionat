package org.example.testik.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow

class Authorization: Screen {

    @Composable
    override fun Content() {
        authorization()
    }

    @Composable
    private fun authorization() {
        val navigator = LocalNavigator.currentOrThrow

        MaterialTheme {
            Navigator(HomeScreen())
            Scaffold(
                topBar = {
                    org.example.testik.ui.screen.component.MarathonTopBar(onClick = {
                        navigator.push(
                            ChoiceParticipateRunnerScreen()
                        )
                    })
                },
                bottomBar = { org.example.testik.ui.screen.component.MarathonBottomBar() }
            ) {
                paddingValues ->
                Column(
                    modifier = Modifier
                        .padding(paddingValues)
                        .fillMaxSize()
                        .padding(50.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text="Форма авторизации", color = Color.Gray)
                    Text(text="Пожалуйста, авторизуйтесь в системе, используя ваш адрес электронной почты и пароль.\n",
                        maxLines = 2)

                    Row {
                        Text(text="Email:")
                        TextField(value = "Enter your email address", onValueChange = {})
                    }
                    Row {
                        Text(text="Password:")
                        TextField(value = "Enter your password", onValueChange = {})
                    }

                    Row {
                        Button(onClick = { navigator.push(HomeScreen()) }) {
                            Text(text = "Login")
                        }
                        Button(onClick = {}) {
                            Text(text = "Cancel")
                        }
                    }
                }
            }
        }
    }
}