// App.kt
package org.example.testik.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.example.testik.ui.screen.component.MarathonButton
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun App() {
    MaterialTheme {
        Navigator(HomeScreen())
    }
}

class HomeScreen : Screen {
    @Preview
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        Scaffold(
            topBar = { MarathonTopBar() },
            bottomBar = { MarathonBottomBar() }
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .background(Color(0xFFF5F5F5))
            ) {
                Spacer(modifier = Modifier.height(40.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 32.dp),
                    verticalArrangement = Arrangement.spacedBy(space = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    MarathonButton(
                        text = "Я хочу стать бегуном",
                        onClick = { navigator.push(ChoiceParticipateRunnerScreen()) }
                    )

                    MarathonButton(
                        text = "Я хочу стать спонсором бегуна",
                        onClick = {  }
                    )

                    MarathonButton(
                        text = "Я хочу узнать больше о событии",
                        onClick = { navigator.push(SelectingDetailedInformation()) }
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .padding(16.dp)
                    ,
                    contentAlignment = Alignment.BottomCenter
                ) {
                    MarathonButton(
                        text = "Login",
                        onClick = {  },
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .padding(16.dp)
                            .width(120.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun MarathonTopBar() {
    Column(
        modifier = Modifier.fillMaxWidth().background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "MARATHON SKILLS 2016", fontSize = 28.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text(
            text = "Москва, Россия\nСреда 21 октября 2016",
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            color = Color.White
        )
    }
}

@Composable
fun MarathonBottomBar() {
    Column(
        modifier = Modifier.fillMaxWidth().background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "18 дней 8 часов и 17 минут до старта марафона!", fontSize = 16.sp, color = Color.White)
    }
}