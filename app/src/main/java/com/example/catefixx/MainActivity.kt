package com.example.catefixx

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.catefixx.ui.theme.CateFixxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()

            }
        }
    }


@Composable
fun  Text(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        Text(text = "Welcome to Android",

            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center)
        Text(text = "It entails creating mobile applications for Android Devices",)

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Types of cars", textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            textDecoration = TextDecoration.Underline,
            color = Color.White,

            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .height(50.dp),
        )

        Text(text = "1.Ferrari")
        Text(text = "2.Mitsubishi")
        Text(text = "3.Land cruz")

        Spacer(modifier = Modifier.height(20.dp))

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Gray)
            ) {
                Text(text = "Explore")
        }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Movies and Series",
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .height(50.dp),)
        Text(text = "a.The Witcher")
        Text(text = "b.Stranger things")
        Text(text = "c.Night Shift")
        Text(text = "d.After we collided")
        Text(text = "e.Legacies")
        Spacer(modifier = Modifier.height(20.dp))
        Divider()


        Spacer(modifier = Modifier.height(20.dp))

       Box (modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center){
           Image(painter = painterResource(id = R.drawable.car11),
               contentDescription ="car11" ,
               modifier = Modifier
                   .size(200.dp)
                   .clip(shape = CircleShape),
               contentScale = ContentScale.Crop
           )
       }
        Button(
            onClick = {
                      mContext.startActivity(Intent(mContext,layoutactivity::class.java))
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
        ) {
            Text(text = "Next")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TextPreview() {
    Text()
}


