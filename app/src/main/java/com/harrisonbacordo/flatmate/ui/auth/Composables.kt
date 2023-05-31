package com.harrisonbacordo.flatmate.ui.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.harrisonbacordo.flatmate.R

@Composable
fun CompanyLogo(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxWidth().wrapContentHeight(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painterResource(id = R.drawable.ic_logo_transparent), "Logo", modifier = modifier.width(250.dp))
    }
}

@Composable
fun AuthOnboardingScreenOption(title: String, leadingIcon: Int, modifier: Modifier = Modifier, contentColor: Color = Color.White) {
//    FIXME content color is screwy for facebookBlue and white, need to resolve this
    Surface(modifier.fillMaxWidth().padding(vertical = 24.dp, horizontal = 16.dp), contentColor = contentColor) {
        Row(horizontalArrangement = Arrangement.SpaceBetween) {
            Row {
                Image(painterResource(id = leadingIcon), "", Modifier.width(24.dp).height(24.dp), colorFilter = ColorFilter.tint(contentColor))
                Text(title, modifier = Modifier.padding(start = 16.dp), color = contentColor)
            }
            Image(painterResource(id = R.drawable.ic_arrow_right_24dp), "", Modifier.width(24.dp).height(24.dp).padding(end = 8.dp), colorFilter = ColorFilter.tint(contentColor))
        }
    }
}