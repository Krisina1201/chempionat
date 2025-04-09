package org.example.testik.ui.screen.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MarathonTopBar(onClick: () -> Unit)
{
    Row ( modifier = Modifier.fillMaxWidth().background(Color.DarkGray),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,

    ) {
        Button(onClick = onClick, modifier = Modifier.padding(horizontal = 30.dp), colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.LightGray,
        )) {
            Text("Назад")
        }
        Text(text = "MARATHON SKILLS 2016", fontSize = 28.sp, fontWeight = FontWeight.Bold, color = Color.White)
    }
}