package com.withjetpack.buttonwithjetpackcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.withjetpack.buttonwithjetpackcompose.ui.theme.ButtonWithjetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContent {

                ButtonWithjetpackComposeTheme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        color = MaterialTheme.colors.background
                    ) {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                            //Simple Button
                            SimpleButton("Submit")
                            //OutlinedButton
                            OutlinedButtonFun("Login")
                            //TextButton
                            TextButtonFun("Registration")
                            //IconButton
                            IconButtonFun("icon")
                        }

                    }
                }
            }
        }
    }

    @Composable
    private fun IconButtonFun(s: String) {

        var context = LocalContext.current.applicationContext
        IconButton(onClick = {

            Toast.makeText(context, "Click", Toast.LENGTH_LONG).show()
        }) {
            Icon(Icons.Default.ArrowBack,contentDescription="Arrowback")
        }
    }

    @Composable
     fun TextButtonFun(s: String) {

        var context = LocalContext.current.applicationContext
        TextButton(onClick = {
            Toast.makeText(context, "Click", Toast.LENGTH_LONG).show()
        }) {
            Text(
                text = s,
                modifier = Modifier.padding(10.dp),
                color = Color.Blue,
                textAlign = TextAlign.Center
            )
        }
    }

    @Composable
    fun OutlinedButtonFun(s: String) {
        var context = LocalContext.current.applicationContext
        OutlinedButton(onClick = {
            Toast.makeText(context, "Click", Toast.LENGTH_LONG).show()
        }) {
            Text(text = s, modifier = Modifier.padding(10.dp), color = Color.Black, textAlign = TextAlign.Center)        }
    }

    @Composable
     fun SimpleButton(simple: String) {
        var context = LocalContext.current.applicationContext
        Button(onClick = {
            Toast.makeText(context, "Click", Toast.LENGTH_LONG).show()
        }) {
            Text(text = simple, modifier = Modifier.padding(10.dp), color = Color.Red, textAlign = TextAlign.Center)
        }
    }
}


@Composable
fun DefaultPreview() {
    ButtonWithjetpackComposeTheme {

    }
}