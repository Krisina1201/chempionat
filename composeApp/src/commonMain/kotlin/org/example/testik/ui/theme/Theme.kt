//package org.example.testik.ui.theme
//
//import androidx.compose.material.Colors
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.CompositionLocalProvider
//import androidx.compose.runtime.Immutable
//import androidx.compose.runtime.staticCompositionLocalOf
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.input.key.Key.Companion.R
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.platform.Font
//import androidx.compose.ui.unit.sp
//import java.awt.Font
//
//@Immutable
//data class MutColors (
//    val blockTitle: Color,
//    val contentTextAndFrame: Color,
//    val button: Color
//    )
//
//@Immutable
//data class MutTextStyle (
//    val boldTitle28: TextStyle,
//    val lightSubtitle18: TextStyle,
//    val body16: TextStyle,
//    val body20: TextStyle
//)
//
//val localTypography = staticCompositionLocalOf {
//    MutTextStyle (
//        boldTitle28 = TextStyle.Default,
//        lightSubtitle18 = TextStyle.Default,
//        body16 = TextStyle.Default,
//        body20 = TextStyle.Default,
//    )
//}
//
//val localColor = staticCompositionLocalOf {
//    MutColors (
//        blockTitle = Color.Unspecified,
//        contentTextAndFrame = Color.Unspecified,
//        button = Color.Unspecified,
//    )
//}
//
//val fontFamily = FontFamily (
//    Font(resource = "composeApp/src/androidMain/res/font/roboto.xml", weight = FontWeight.Normal),
//    Font(resource = "composeApp/src/androidMain/res/font/roboto_bold.xml", weight = FontWeight.Bold),
//    Font(resource = "composeApp/src/androidMain/res/font/roboto_light_italic.xml", weight = FontWeight.Light)
//)
//
//@Composable
//fun MatuleTheme(content: @Composable () -> Unit) {
//    val matuleColor = MutColors (
//        blockTitle = Color(0x545252),
//        contentTextAndFrame = Color(0x999797),
//        button = Color(0xd4cfcf)
//    )
//    val matuleTypography = MutTextStyle (
//        boldTitle28 = TextStyle(fontFamily = fontFamily, fontWeight = FontWeight.Bold, fontSize = 28.sp),
//        lightSubtitle18 = TextStyle(fontFamily = fontFamily, fontWeight = FontWeight.Light, fontSize = 18.sp),
//        body16 = TextStyle(fontFamily = fontFamily, fontWeight = FontWeight.Normal, fontSize = 16.sp),
//        body20 = TextStyle(fontFamily = fontFamily, fontWeight = FontWeight.Normal, fontSize = 20.sp)
//    )
//
//    CompositionLocalProvider(
//        localColor provides matuleColor,
//        localTypography provides matuleTypography,
//        content = content
//    )
//}
//
//object MatuleTheme {
//    val colors: MutColors
//    @Composable
//    get() = localColor.current
//    val typography
//    @Composable
//    get() = localTypography.current
//}
