package com.example.catefixx

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.catefixx.ui.theme.CateFixxTheme

class IntentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyIntents()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyIntents() {
    val mContext = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint
                (painterResource(id = R.drawable.img), contentScale = ContentScale.FillBounds)
    )
    {




        //TopAppbar
        TopAppBar(
            title = { androidx.compose.material3.Text(text = "Intents", color = Color.White) },
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
                        imageVector = Icons.Default.Add,
                        contentDescription = "add",
                        tint = Color.White
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "settings",
                        tint = Color.White
                    )
                }

            })
        //End of TopAppbar


        Spacer(modifier = Modifier.height(30.dp))
//STK

        OutlinedButton(
            onClick = { val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)
        ) {
            androidx.compose.material3.Text(
                text = "MPESA",
                color = Color.Black
            )
        }


        Spacer(modifier = Modifier.height(30.dp))

        //email

        OutlinedButton(
            onClick = {val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("catekaso216@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent)  },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)
        ) {
            androidx.compose.material3.Text(
                text = "EMAIL",
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        //SMS
        OutlinedButton(
            onClick = { val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0799600713".toUri()
                smsIntent.putExtra("sms_body","Hello Cate,have a gorgeous day?")
                mContext.startActivity(smsIntent) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)
        ) {
            androidx.compose.material3.Text(
                text = "SMS",
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(30.dp))
        //CAL
        OutlinedButton(
            onClick = { val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0799600713".toUri()
                mContext.startActivity(callIntent) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)
        ) {
            androidx.compose.material3.Text(
                text = "CALL",
                color = Color.Black
            )}

            Spacer(modifier = Modifier.height(30.dp))
        //Camera
            OutlinedButton(
                onClick = { val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                        mContext.startActivity(cameraIntent)
                    }else{
                        println("Camera app is not available")
                    } },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Blue)
            ) {
                androidx.compose.material3.Text(
                    text = "CAMERA",
                    color = Color.Black
                )
            }

        Spacer(modifier = Modifier.height(30.dp))
        //Share
        OutlinedButton(
            onClick = { val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "https://github.com/cathychepkorir20")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share")) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Blue)
        ) {
            androidx.compose.material3.Text(
                text = "SHARE",
                color = Color.Black
            )
        }


    }

    androidx.compose.material3.Text(
        text = "Dont have an account",
        fontSize = 15.sp,
        modifier = Modifier
            .fillMaxWidth()
            .clickable {

                mContext.startActivity(Intent(mContext,FormActivity::class.java))
            })

}



           
@Preview(showBackground = true)
@Composable
fun MyintentsPreview(){
    MyIntents()
}









