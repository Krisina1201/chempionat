package org.example.testik.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.example.testik.ui.screen.component.MarathonBottomBar
import org.example.testik.ui.screen.component.MarathonButton
import org.example.testik.ui.screen.component.MarathonTopBar
import org.jetbrains.compose.ui.tooling.preview.Preview

class ChoiceParticipateRunnerScreen : Screen {
    @Composable
    override fun Content() {
        ChoiceParticipateRunner()
    }


    @Composable
    private fun ChoiceParticipateRunner() {
        val navigator = LocalNavigator.currentOrThrow
        MaterialTheme {
            Navigator(HomeScreen())
            Scaffold(
                topBar = { MarathonTopBar(onClick = { navigator.push(HomeScreen()) }) },
                bottomBar = { MarathonBottomBar() },
            ) { paddingValues ->
                Column(
                    modifier = Modifier
                        .padding(paddingValues)
                        .fillMaxSize()
                        .padding(50.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {

                    MarathonButton(
                        text = "Я участвовал ранее",
                        onClick = { navigator.push(Authorization()) },
                        modifier = Modifier.padding(15.dp)
                    )

                    MarathonButton(
                        text = "Я новый участник",
                        onClick = {  }
                    )
                }
            }
        }
    }
}

