package com.anishakd4.corecomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.anishakd4.corecomposeapplication.ui.theme.CoreComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            CoreComposeApplicationTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(color = MaterialTheme.colors.background) {
//                    Greeting("Android")
//                }
//            }
            MainScreen9()
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Wrapped Content",
            modifier = Modifier.wrapContentSize(),
            style = MaterialTheme.typography.h4
        )
    }
}

@Composable
fun MainScreen2() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            color = Color.Magenta,
            modifier = Modifier.wrapContentSize()
        ) {
            Text(
                text = "Wrapped Content",
                modifier = Modifier.wrapContentSize(),
                style = MaterialTheme.typography.h4
            )
        }
    }
}

@Composable
fun MainScreen3() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            color = Color.Magenta,
            modifier = Modifier.wrapContentSize(align = Alignment.TopEnd)
        ) {
            Text(
                text = "Wrapped Content",
                modifier = Modifier.wrapContentSize(),
                style = MaterialTheme.typography.h4
            )
        }
    }
}

@Composable
fun MainScreen4() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row() {
            Surface(
                color = Color.Magenta,
                modifier = Modifier
                    .height(600.dp)
                    .width(60.dp)
            ) {
            }
            Surface(
                color = Color.Red,
                modifier = Modifier
                    .height(600.dp)
                    .width(60.dp)
            ) {
            }
        }
    }
}

@Composable
fun MainScreen5() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row() {
            HorizontalColoredBar(Color.Red)
            HorizontalColoredBar(Color.Magenta)
            HorizontalColoredBar(Color.Cyan)
            HorizontalColoredBar(Color.Yellow)
            HorizontalColoredBar(Color.Blue)
        }
    }
}

@Composable
fun HorizontalColoredBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier
            .height(600.dp)
            .width(60.dp)
    ) {
    }
}

@Composable
fun MainScreen6() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            HorizontalColoredBar(Color.Red)
            HorizontalColoredBar(Color.Magenta)
            HorizontalColoredBar(Color.Cyan)
            HorizontalColoredBar(Color.Yellow)
            HorizontalColoredBar(Color.Blue)
        }
    }
}

@Composable
fun MainScreen7() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Bottom
        ) {
            HorizontalColoredBar(Color.Red)
            HorizontalColoredBar(Color.Magenta)
            HorizontalColoredBar(Color.Cyan)
            HorizontalColoredBar(Color.Yellow)
            HorizontalColoredBar(Color.Blue)
        }
    }
}

@Composable
fun MainScreen8() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            VerticalColoredBar(Color.Red)
            VerticalColoredBar(Color.Magenta)
            VerticalColoredBar(Color.Cyan)
            VerticalColoredBar(Color.Yellow)
            VerticalColoredBar(Color.Blue)
        }
    }
}

@Composable
fun VerticalColoredBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier
            .height(100.dp)
            .width(350.dp)
    ) {
    }
}

@Composable
fun MainScreen9() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ColoredSquare(Color.Red)
                ColoredSquare(Color.Magenta)
            }
            ColoredSquare(Color.Cyan)
            ColoredSquare(Color.Yellow)
            ColoredSquare(Color.Blue)
        }
    }
}

@Composable
fun ColoredSquare(color: Color) {
    Surface(
        color = color,
        modifier = Modifier
            .height(100.dp)
            .width(100.dp)
    ) {
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
//    CoreComposeApplicationTheme {
//        Greeting("Android")
//    }
//    MainScreen3()

//    Text(text = "First Content")
//    Text(text = "Second Content")

    MainScreen9()
}