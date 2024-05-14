package com.example.catefixx

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.catefixx.ui.theme.CateFixxTheme
import com.example.catefixx.ui.theme.Orange

class TwoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Two()

        }
    }
}

@Composable
fun Two(){
    val mContext = LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Orange),
        horizontalAlignment = Alignment.CenterHorizontally  ,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Box (modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.ladie4),
                contentDescription ="ladie4" ,
                modifier = Modifier
                    .size(350.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )

        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Add to your Cart",
            fontSize = 40.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Default)

        Spacer(modifier = Modifier.height(20.dp))
        Text("dhjfdjghfjknbkgjk kjfkgjhlfjgh jdfgljtyjuotriujgvjb igdujigrfigfbbj  ifudguf uhurg uy7uy yyfr ftyf tfyyt fudufdfvhv hgyu yuuhuy yyyu utgyuhuih yugyuuiiokju ygyuhufhhubhgbgbjkbgi gfgtfigutuyuy uyyytrt")


        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,ThreeActivity::class.java))
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





@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TwoPreview(){
    Two()
}