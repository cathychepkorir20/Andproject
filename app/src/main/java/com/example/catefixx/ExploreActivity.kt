package com.example.catefixx

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.catefixx.ui.theme.CateFixxTheme

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Explore()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        //Top appbar
        TopAppBar(title = { Text(text = "Cities", color = Color.Black)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.Black)

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = Color.Black)

                }

                IconButton(onClick = {
                    val shareIntents = Intent(Intent.ACTION_SEND)
                    shareIntents.type= "text/plain"
                    shareIntents.putExtra(Intent.EXTRA_TEXT,"Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntents,"share"))
                }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.Black)

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "search",
                        tint = Color.Black
                    )

                }
                }
        )
        //End of topappbar
        Column (modifier = Modifier
            .verticalScroll(rememberScrollState()))
        {
            androidx.compose.material3.Text(text = "Tickets",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp))

            //This is row 1

            Row (modifier = Modifier.padding(start = 20.dp)){
                //Column 1

                Column {
                    Card (modifier = Modifier
                        .height(100.dp)
                        .width(160.dp))
                    {
                        Box (modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(painter = painterResource(id = R.drawable.cars1),
                                contentDescription = "cars1",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                               )
                            Icon(imageVector = Icons.Default.Favorite,
                                contentDescription = "FAVOURITE",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)
                            )
                            Spacer(modifier = Modifier.height(2.dp))

                            Row {
                                Icon(imageVector = Icons.Default.Star, contentDescription ="Star", tint = Color.Magenta )
                                Icon(imageVector = Icons.Default.Star, contentDescription ="Star", tint = Color.Magenta )
                                Icon(imageVector = Icons.Default.Star, contentDescription ="Star", tint = Color.Magenta )
                                Icon(imageVector = Icons.Default.Star, contentDescription ="Star", tint = Color.Magenta )
                                Icon(imageVector = Icons.Default.Star, contentDescription ="Star", tint = Color.Magenta )
                            }

                            Spacer(modifier = Modifier.height(2.dp))
                            androidx.compose.material3.Text(text = "coloseum,")
                            androidx.compose.material3.Text(text = "Roman Forum")
                            androidx.compose.material3.Text(text = "and Palatine Hill...")

                            Spacer(modifier = Modifier.height(2.dp))




                        }


                    }
                }

            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun ExplorePreview(){
    Explore()
}