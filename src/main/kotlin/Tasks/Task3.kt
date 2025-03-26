package Tasks

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun task3(){
    Column(
        modifier = Modifier
    ) {
        Box(modifier = Modifier
            .padding(start = 135.dp)
            .size(96.dp)){
            Image(painter = painterResource("chel_s_ochkami.png"),
                contentDescription = "")
        }
        Box(modifier = Modifier
            .padding(start = 127.dp)
            .padding(top = 15.dp)

        ){
            Text(fontWeight = FontWeight(700),
                fontSize = 20.sp,
                text = "X_AE_C-921",)
        }
        Box(modifier = Modifier
            .padding(start = 126.dp)
        ){
            Text(fontWeight = FontWeight(500),
                text = "@xtheobliterator")
        }
        Box(modifier = Modifier
            .padding(start = 130.dp)){
            Text(text = "Osaka, Japan  \uD83C\uDF8C ")
        }

    }
    Row(modifier = Modifier
        .padding(top = 210.dp)
        .padding(start = 60.dp)
        .size(width = 400.dp, height = 50.dp)) {
        Column {
            Box(){Text( fontWeight = FontWeight(500),
                        fontSize = 20.sp,
                        text = "548")}
            Box(){Text(text = "Posts")}
        }
        Spacer(modifier = Modifier
            .padding(start = 40.dp)
            .width(1.dp)
            .fillMaxHeight()
            .background(color = Color.Gray))
        Column() {
            Box(modifier = Modifier
                .padding(start = 25.dp))
            {Text(fontWeight = FontWeight(500),
                  fontSize = 20.sp,
                  text = "12.7K")}
            Box(modifier = Modifier
                .padding(start = 20.dp))
            {Text(text = "Followers")}}
        Spacer(modifier = Modifier
            .padding(start = 15.dp)
            .width(1.dp)
            .fillMaxHeight()
            .background(color = Color.Gray))
        Column() {
            Box(modifier = Modifier
                .padding(start = 40.dp)){
                Text(fontWeight = FontWeight(500),
                    fontSize = 20.sp,
                    text = "221")
            }
            Box(modifier = Modifier
                .padding(start = 25.dp)){
                Text(text = "Following")
            }
        }


    }
}