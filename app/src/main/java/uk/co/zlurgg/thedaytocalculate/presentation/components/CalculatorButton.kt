package uk.co.zlurgg.thedaytocalculate.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.co.zlurgg.thedaytocalculate.ui.theme.TheDayToCalculateTheme

@Composable
fun CalculatorButton(
    modifier: Modifier = Modifier,
    symbol: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .size(80.dp)
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        contentPadding = PaddingValues(0.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.DarkGray,
            contentColor = Color.White,
        ),
        onClick = {
            /* update state */
        }) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            Text(
                fontSize = 26.sp,
                text = symbol
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun CalculatorButtonPreview() {
    TheDayToCalculateTheme {
        CalculatorButton(
            symbol = "1",
            onClick = {}
        )
    }
}