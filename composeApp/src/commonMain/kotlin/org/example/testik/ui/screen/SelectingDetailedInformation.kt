package org.example.testik.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.example.testik.ui.screen.component.MarathonButton

class SelectingDetailedInformation: Screen {
    @Composable
    override fun Content() {
        SelectingDetailedInformationScreen()
    }

    @Composable
    private fun SelectingDetailedInformationScreen() {
        val navigator = LocalNavigator.currentOrThrow

        MaterialTheme {
            Navigator(HomeScreen())
            Scaffold (
                topBar = {
                    org.example.testik.ui.screen.component.MarathonTopBar(onClick = {
                        navigator.push(
                            HomeScreen()
                        )
                    })
                },
                bottomBar = { MarathonBottomBar() }
            ) {
                paddingValues ->
                Column (
                    modifier = Modifier
                        .padding(paddingValues)
                        .fillMaxSize()
                        .padding(50.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    MarathonButton(
                        text = "Marathon Skills 2016",
                        onClick = {  },
                        modifier = Modifier.padding(15.dp)
                    )

                    MarathonButton(
                        text = "Предыдущие результаты",
                        onClick = {  },
                        modifier = Modifier.padding(15.dp)
                    )

                    MarathonButton(
                        text = "BMI калькулятор",
                        onClick = {  },
                        modifier = Modifier.padding(15.dp)
                    )
                }

                Column (
                    modifier = Modifier
                        .padding(paddingValues)
                        .fillMaxSize()
                        .padding(50.dp),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Bottom,
                ) {
                    MarathonButton(
                        text = "Насколько долгий марафон",
                        modifier = Modifier.padding(15.dp),
                        onClick = {  }
                    )

                    MarathonButton(
                        text = "Список благотворительных\nорганизаций",
                        modifier = Modifier.padding(15.dp),
                        onClick = {  }
                    )

                    MarathonButton(
                        text = "BMR калькулятор",
                        modifier = Modifier.padding(15.dp),
                        onClick = {  }
                    )
                }
            }
        }
    }
}

