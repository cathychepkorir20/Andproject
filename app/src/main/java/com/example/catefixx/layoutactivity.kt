package com.example.catefixx

import android.content.Intent
import android.graphics.drawable.Icon
import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.catefixx.ui.theme.CateFixxTheme
import org.w3c.dom.Text

//FOR PHONE DISPLAYS
class layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id =  R.drawable.img_1), contentScale = ContentScale.FillBounds)) {
//for navigation
        val mContext = LocalContext.current
        //TopAppbar
        TopAppBar(
            title = { androidx.compose.material3.Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription ="menu",
                        tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = {  val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share")) }) {
                    androidx.compose.material3.Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White)
                }

                IconButton(onClick = {  }) {
                    androidx.compose.material3.Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White)
                }

            })
        //End of TopAppbar

        Spacer(modifier = Modifier.height(5.dp))
        androidx.compose.material3.Text(text = "THE CARS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(5.dp))
        //First row
        Row {
            Image(painter = painterResource(id = R.drawable.cars) ,
                contentDescription = "cars",
                modifier = Modifier.size(width = 250.dp, height = 200.dp))
//creating space in a row
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                androidx.compose.material3.Text(
                    text = "Couplish",
                    fontSize = 18.sp,
                    textDecoration = TextDecoration.Underline)
                androidx.compose.material3.Text(text = "Can also be used in sports but its best for dgfhjnb bcvyr")
            }
        }
        //End of row 1
        Spacer(modifier = Modifier.height(5.dp))

        //Second row
        Row {
            Image(painter = painterResource(id = R.drawable.cars1) ,
                contentDescription = "cars1",
                modifier = Modifier.size(width = 250.dp, height = 200.dp))

            Spacer(modifier = Modifier.width(20.dp))
            Column {
                androidx.compose.material3.Text(
                    text = "Fancy and Cool",
                    fontSize = 18.sp,
                    textDecoration = TextDecoration.Underline)
                androidx.compose.material3.Text(text = "Moreso in the twentieth century")
            }
        }
        //End of row 2

        Spacer(modifier = Modifier.height(5.dp))
        //Third row
        Row {
            Image(painter = painterResource(id = R.drawable.cars2) ,
                contentDescription = "cars2",
                modifier = Modifier.size(width = 250.dp, height = 200.dp))

            Spacer(modifier = Modifier.width(20.dp))
            Column {
                androidx.compose.material3.Text(
                    text = "Global Personel",
                    fontSize = 18.sp,
                    textDecoration = TextDecoration.Underline)
                androidx.compose.material3.Text(text = "For party party or so cool in the beaches")
            }
        }
        //End of row 3
        Row {

            Spacer(modifier = Modifier.width(40.dp))
            Button(
                onClick = {  mContext.startActivity(Intent(mContext,MainActivity::class.java)) },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red),) {
                androidx.compose.material3.Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow back", tint = Color.White)
                androidx.compose.material3.Text(text = "Back")

            }
            Spacer(modifier = Modifier.width(40.dp))
            Button(
                onClick = {  mContext.startActivity(Intent(mContext,IntentActivity::class.java)) },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue),) {
                androidx.compose.material3.Icon(imageVector = Icons.Default.ArrowForward,
                    contentDescription = "arrow forward")
                androidx.compose.material3.Text(text = "Next")

            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()

}