import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.onClick
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import java.awt.SystemColor.text

@Composable
@OptIn
fun Task2() {
    var chrom by remember { mutableStateOf(0) }
fun chrom(){
    chrom++
    }

    Column(
        modifier = Modifier.size(305.dp, 88.dp).background(Color.White)
            .padding(horizontal = 12.5.dp, vertical = 10.5.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(.1f))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 12.5.dp, vertical = 10.5.dp)
        ) {if (chrom < 1){
            Image(
                painter = painterResource("task2/pfp.png"),
                contentDescription = "",
                modifier = Modifier.clip(CircleShape).size(40.dp, 40.dp),
            )}
            else{
                Image(
                painter = painterResource("geyniy.png"),
                contentDescription = "",
                modifier = Modifier.clip(CircleShape).size(40.dp, 40.dp)

            )}
            Column(
                modifier = Modifier.size(172.dp, 46.dp).padding(start = 12.dp)
            ) {if (chrom < 1){
                Text(
                    text = "Azunyan U. Wu",
                    modifier = Modifier.size(172.dp, 22.dp),
                    color = Color(0xff1e293b),
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font("task2/font.ttf", weight = FontWeight.W700)))

                Text(
                    text = "Basic Member",
                    modifier = Modifier.size(172.dp, 22.dp),
                    color = Color(0xff475569),
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font("task2/font2.ttf", weight = FontWeight.W500)),
                )}
                else{Text(
                text = "Guest",
                modifier = Modifier.size(172.dp, 22.dp),
                color = Color(0xff1e293b),
                fontSize = 16.sp,
                fontFamily = FontFamily(Font("task2/font.ttf", weight = FontWeight.W700)),
            )
                Text(
                    text = "Unknown",
                    modifier = Modifier.size(172.dp, 22.dp),
                    color = Color(0xff475569),
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font("task2/font2.ttf", weight = FontWeight.W500)),
                )}
            }
            Spacer(Modifier.weight(1f))
            Box(
                modifier = Modifier.weight(1f).size(40.dp, 40.dp).clickable {chrom()},
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