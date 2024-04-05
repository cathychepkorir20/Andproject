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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.catefixx.ui.theme.CateFixxTheme

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current

        //topapp bar
        TopAppBar(
            title = { Text(text = "Destination", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription ="menu",
                        tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = {  val shareIntent= Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share")) }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.White)
                }

                IconButton(onClick = {  }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White)
                }

            })
        //end of topappbar

        Box (modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)){
            Image(painter = painterResource(id = R.drawable.img),
                contentDescription = "img",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop)

            androidx.compose.material3.Text(text =
             "Lets plan your next vocation",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                textAlign = TextAlign.Center
            )

            //end of box

            Spacer(modifier = Modifier.height(30.dp))
            var search by remember { mutableStateOf("") }

            OutlinedTextField(
                value =search,
                 onValueChange = {search = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                placeholder = { androidx.compose.material3.Text(text = "Whats your next Destination")},
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Search,
                        contentDescription = "search")


                })
            //end of search
            androidx.compose.material3.Text(text = "Recently viewed",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier.padding(20.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))



            Spacer(modifier = Modifier.horizontalScroll(rememberScrollState())
            )
            Row {
                //card 1
                Card(modifier = Modifier
                    .height(200.dp)
                    .width(200.dp))
                {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.car11),
                                contentDescription = "car11",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop)

                        }
                        androidx.compose.material3.Text(text = "car11",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }

                }
                //Enf of card 1

                Spacer(modifier = Modifier.width(5.dp))
                //card 2
                Card(modifier = Modifier
                    .height(200.dp)
                    .width(200.dp))
                {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.car11),
                                contentDescription = "car11",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop)

                        }
                        androidx.compose.material3.Text(text = "car11",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }

                }
                //End of card 2
                Spacer(modifier = Modifier.width(5.dp))
                //card 3
                Card(modifier = Modifier
                    .height(200.dp)
                    .width(200.dp))
                {
                    Column {
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                            contentAlignment = Alignment.Center) {
                            Image(painter = painterResource(id = R.drawable.car11),
                                contentDescription = "car11",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop)

                        }
                        androidx.compose.material3.Text(text = "car11",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }

                }
                //End of card 3




            }

        }



    }

}

@Preview(showBackground = true)
@Composable
fun DestinationPreview(){
    Destination()
}