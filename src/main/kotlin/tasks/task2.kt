package tasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Task2() {

    Column(
        modifier = Modifier.size(305.dp, 88.dp).background(Color.White)
            .padding(horizontal = 12.5.dp, vertical = 10.5.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(.1f))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 12.5.dp, vertical = 10.5.dp)
        ) {
            Image(
                painter = painterResource("task2/pfp.png"),
                contentDescription = "",
                modifier = Modifier.clip(CircleShape).size(40.dp, 40.dp),
            )
            Column(
                modifier = Modifier.size(172.dp, 46.dp).padding(start = 12.dp)
            ) {
                Text(
                    text = "Azunyan U. Wu",
                    modifier = Modifier.size(172.dp, 22.dp),
                    color = Color(0xff1e293b),
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font("task2/font.ttf", weight = FontWeight.W700)),
                )
                Text(
                    text = "Basic Member",
                    modifier = Modifier.size(172.dp, 22.dp),
                    color = Color(0xff475569),
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font("task2/font2.ttf", weight = FontWeight.W500)),
                )
            }
            Spacer(Modifier.weight(1f))
            Box(
                modifier = Modifier.weight(1f).size(40.dp, 40.dp),
                contentAlignment = Alignment.Center,
            ) {
                Icon(
                    painter = painterResource("task2/logout.svg"),
                    contentDescription = "icon",
                    tint = Color(0xff475569),
                )
            }
        }
    }
}