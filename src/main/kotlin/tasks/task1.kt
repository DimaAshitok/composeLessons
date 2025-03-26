package tasks

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp

val size: DpSize = DpSize(375.dp, 80.dp)


@Composable
fun Task1() {
    val icons: List<String> = listOf(
        "task1/Home.svg",
        "task1/Find.svg",
        "task1/Plus.svg",
        "task1/Chat.svg",
        "task1/Users.svg"
    )

    Row(
        modifier = Modifier.size(375.dp, 80.dp).background(Color.Black),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        icons.forEach {
            if (it != "task1/Plus.svg") {
                Box(
                    modifier = Modifier.weight(1f).size(48.dp, 48.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        painter = painterResource(it),
                        contentDescription = "icon",
                        tint = Color(0xffb339ff),
                    )
                }
            }
            else {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .size(48.dp, 48.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                    ,
                    contentAlignment = Alignment.Center,
                ) {
                    Icon(
                        painter = painterResource(it),
                        contentDescription = "icon",
                        tint = Color.White,
                    )
                }
            }
            if (it != "task1/Users.svg") {
                Spacer(modifier = Modifier.weight(.5f))
            }
        }
    }
}
