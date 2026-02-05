package com.example.first_application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first_application.ui.theme.FirstapplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstapplicationTheme {

            }
            Surface(
                color = Color(0xFF2B2D42),
                modifier = Modifier
                    .fillMaxSize()
                    .safeDrawingPadding()
            ) {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Surface(
                            color = Color.White,
                            modifier = Modifier
                                .size(320.dp)
                                .padding(24.dp),
                            shape = RoundedCornerShape(16.dp), shadowElevation = 10.dp

                            ) {

                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Top, modifier = Modifier.padding(0.dp, 15.dp, 0.dp, 32.dp)
                            ) {

                                AsyncImage(
                                    model = "https://exemplo.com/imagem.jpg",
                                    contentDescription = "Descrição da imagem"
                                )


                                Text(
                                        text = "Guerreiro Kotlin",
                                        fontSize = 28.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )


                                    Text(
                                        text = "Mago Supremo",
                                        fontSize = 16.sp,
                                        color = Color.Gray
                                    )

                                    Row(modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(24.dp),  Arrangement.SpaceBetween){

                                        Text(text = "LVL 99", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                                        Text(text = "HP 5000", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Red)
                                    }

                                Text(
                                    text = "Mestre no código limpo e caçador de bugs",
                                    modifier = Modifier.padding(22.dp, 0.dp), textAlign = TextAlign.Center, fontSize =  14.sp
                                )


                            }

                        }

                    }

                }
            }
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Surface(color = Color.Black, modifier = Modifier.size(600.dp)) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Row(verticalAlignment = Alignment.CenterVertically) {

                    Surface(color = Color.Red, modifier = Modifier.size(200.dp)) {

                    }

                    /*Spacer(modifier = Modifier.size(200.sp))*/

                    Surface(color = Color.Green, modifier = Modifier.size(200.dp)) {

                    }

                }

            }


        }

    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        FirstapplicationTheme {
            Greeting("Android")
        }
    }
}