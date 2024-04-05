package com.example.catefixx

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.catefixx.ui.theme.Brown
import com.example.catefixx.ui.theme.CateFixxTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Splash()
            val mContext = LocalContext.current
            val coroutineScope = rememberCoroutineScope()
            coroutineScope.launch {
                delay(1000)
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
                   finish()            }

        }
    }
}

@Composable
fun Splash(){
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Brown),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Box (modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(start = 20.dp, top = 20.dp, end = 20.dp, bottom = 20.dp)
            .padding(top = 5.dp),
            contentAlignment = Alignment.Center,) {

            Image(painter = painterResource(id = R.drawable.cars2),
                contentDescription = "cars2",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
                )
        }

        androidx.compose.material3.Text(text = "Perfect Brand",
            fontSize = 50.sp,
            fontFamily = FontFamily.Serif,
            textDecoration = TextDecoration.Underline,
            )
        androidx.compose.material3.Text(text = "For a smooth ride and its comfy",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive)


    }

}

@Preview(showBackground = true)
@Composable
fun SplashPreview(){
    Splash()
}