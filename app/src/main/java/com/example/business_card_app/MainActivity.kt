package com.example.business_card_app

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.business_card_app.ui.theme.Business_Card_appTheme
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.painter.Painter
import org.w3c.dom.Text


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Business_Card_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}
@Composable
fun Card(){
    Column (){
        Section1()
        Section2()
    }

}


@Composable
fun Section1(modifier : Modifier = Modifier.padding(top = 2.dp, bottom = 7.dp)) {
    val img = painterResource(id = R.drawable.photo)
    val person = "Merry Poppins"
    val title = "Student"
    val rainbowColorsBrush = remember {
        Brush.sweepGradient(
            listOf(
                Color(0xFF9575CD),
                Color(0xFFBA68C8),
                Color(0xFFE57373),
                Color(0xFFFFB74D),
                Color(0xFFFFF176),
                Color(0xFFAED581),
                Color(0xFF4DD0E1),
                Color(0xFF9575CD)
            )
        )
    }
    val borderWidth = 3.dp
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ){
    Box(modifier= Modifier
        .size(47.dp)
        .border(
            BorderStroke(borderWidth, rainbowColorsBrush),
            CircleShape
        )
        .align(Alignment.CenterHorizontally)
//        .size(50.dp, 50.dp)
        .clip(CircleShape)
    ) {
        Image(
            painter = img,
            contentDescription = null,
            contentScale = ContentScale.FillHeight
        )
    }
        Text(
            text = person,
            fontSize = 5.sp,
            color = Color.DarkGray,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally),
            textAlign = TextAlign.Center
        )
        Text(
            text = title,
            fontSize = 4.sp,
            color = Color.DarkGray,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally),
            textAlign = TextAlign.Center
        )

    }
}
@Composable
fun Section2(modifier : Modifier = Modifier) {
    val phone_num = "+7(777)7777777"
    val email = "email@email.com"
    Column(modifier = modifier.wrapContentWidth().padding(start = 8.dp)) {
        Row{
        Icon(
            Icons.Rounded.Call,
            contentDescription = "Phone number",
            modifier = modifier.size(5.dp)
        )
        Text(
            text = phone_num,
            fontSize = 3.sp,
            modifier = modifier
        )
        }
        Row{
            Icon(
                Icons.Rounded.Email,
                contentDescription = "Email address",
                modifier = modifier.size(5.dp)
            )
            Text(
                text = email,
                fontSize = 3.sp,
                modifier = modifier
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CarPreview(){
    Card()
}
