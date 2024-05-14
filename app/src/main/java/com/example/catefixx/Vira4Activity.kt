package com.example.catefixx

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.catefixx.ui.theme.CateFixxTheme

class Vira4Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mytaste()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Mytaste(){
    val mContext = LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.img_1), contentScale = ContentScale.FillBounds)) {
//for navigation
        val mContext = LocalContext.current
        //TopAppbar
        TopAppBar(
            title = { androidx.compose.material3.Text(text =" ", ) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = {  mContext.startActivity(Intent(mContext,MainActivity::class.java)) }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "lock",
                        tint = Color.White
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.White
                    )
                }

            })

        Spacer(modifier = Modifier.height(5.dp))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            Spacer(modifier = Modifier.height(5.dp))

            Row(modifier = Modifier.horizontalScroll(rememberScrollState()) ){
                androidx.compose.material3.Text(text = "Chair",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(20.dp))

                androidx.compose.material3.Text(text = "Sofa",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Light)
                Spacer(modifier = Modifier.width(20.dp))
                androidx.compose.material3.Text(text = "Tables",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Light)
                Spacer(modifier = Modifier.width(20.dp))
                androidx.compose.material3.Text(text = "Benches",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Light)

            }
         Row (modifier = Modifier.horizontalScroll(rememberScrollState())
             ){
             Text(text = "120 Products",
                 fontSize = 15.sp,
                 modifier = Modifier.padding(20.dp))

             Spacer(modifier = Modifier.width(100.dp))

             Text(text = "Porpular",
                 fontWeight = FontWeight.Bold,
                 fontSize = 17.sp)
         }

            Row (modifier = Modifier.padding(25.dp))
            {
                //First Column
                Column {
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(100.dp)) {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.img_3),
                                contentDescription = "img3")
                        }

                        Spacer(modifier = Modifier.height(20.dp))
                        androidx.compose.material3.Text(text = "Amos Chair",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.ExtraBold)
                        androidx.compose.material3.Text(text = "chair stock photos and images available")



                    }
                }

            }


        }





    }
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MytastePreview(){
    Mytaste()
}