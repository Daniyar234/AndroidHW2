package com.example.test1
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test1.ui.theme.whiteBackground

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun Loginpage(){
    val email = remember{ mutableStateOf("") }
    val password = remember{ mutableStateOf("") }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White), contentAlignment = Alignment.TopCenter){

        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
                .background(whiteBackground)
                .padding(10.dp)
        ) {
            Text(
                text = "Sign In",
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(modifier =  Modifier.padding(20.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                OutlinedTextField(value = email.value, onValueChange = {email.value = it}, label = { Text(
                    text = "Email")}, placeholder = { Text(text = "Email")},
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(8.8f)
                )

                OutlinedTextField(value = password.value, onValueChange = {password.value = it}, label = { Text(
                    text = "Password")}, placeholder = { Text(text = "Password")},
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(8.8f)
                )
                
                Spacer(modifier = Modifier.padding(10.dp))
                Button(onClick = { },
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                        .height(55.dp)) {
                    Text(text = "Sign in")
                }
                Spacer(modifier = Modifier.padding(20.dp))
                Text(text = "Don't have account",
                    modifier = Modifier.clickable(onClick = {})
                )
            }
        }
    }
}
