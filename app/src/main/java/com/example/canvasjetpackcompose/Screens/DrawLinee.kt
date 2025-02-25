package com.example.canvasjetpackcompose.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

@Composable
fun DrawLine(modifier: Modifier = Modifier) {
    //Drawing line composable
    Canvas(modifier = Modifier.fillMaxSize()) {
        val canvuswidth= size.width
        val canvusheight= size.height
        drawLine(
            color = Color.Red,
            //Starting (0,0)
            //took x to 0 no change y to height/2 ) First pt goes down
            start = Offset(x=0f , y=canvusheight/2 ),
            //took x to canvusw to get itto b point at end (width end)
            end = Offset(x=canvuswidth , y= canvusheight/2),
            strokeWidth = 10f
        )
    }
}