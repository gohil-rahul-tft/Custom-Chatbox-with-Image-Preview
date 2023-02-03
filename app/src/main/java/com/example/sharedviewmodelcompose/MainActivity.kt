package com.example.sharedviewmodelcompose

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.sharedviewmodelcompose.components.ChatBoxEditText
import com.example.sharedviewmodelcompose.components.ChatBoxEditTextWithImage
import com.example.sharedviewmodelcompose.ui.theme.SharedViewModelComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SharedViewModelComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
//                    HangoutsStyleTextWithImages()

                    var message by remember { mutableStateOf("") }
                    val context = LocalContext.current
                    var imageUri by remember { mutableStateOf<Uri?>(null) }

                    val launcher = rememberLauncherForActivityResult(
                        contract = ActivityResultContracts.GetContent()
                    ) { uri: Uri? ->
                        imageUri = uri
                    }


                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        if (imageUri != null) {
                            ChatBoxEditTextWithImage(
                                message = message,
                                onChange = {
                                    message = it
                                },
                                onSend = {},
                                onImageIconClicked = {
                                    launcher.launch("image/*")
                                }
                            )
                        } else {
                            ChatBoxEditText(
                                message = message,
                                onChange = {},
                                onSend = {},
                                onImageIconClicked = {
                                    launcher.launch("image/*")
                                })
                        }


                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SharedViewModelComposeTheme {
        Greeting("Android")
    }
}