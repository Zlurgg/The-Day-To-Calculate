package uk.co.zlurgg.thedaytocalculate.presentation.components

import android.view.Display
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import uk.co.zlurgg.thedaytocalculate.domain.model.CalculatorOperation
import uk.co.zlurgg.thedaytocalculate.ui.theme.TheDayToCalculateTheme

@Composable
fun Display(
    modifier: Modifier = Modifier,
    number1: String,
    number2: String,
    operation: CalculatorOperation?
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .border(width = 1.dp, color = Color.LightGray)
            .background(Color.Cyan)
    ) {
        Text(
            text = number1 + (operation?.symbol ?: "") + number2,
            textAlign = TextAlign.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 32.dp),
            fontWeight = FontWeight.Light,
            fontSize = 80.sp,
            color = Color.Black,
            maxLines = 2,
            lineHeight = 80.sp,
            softWrap = true
        )
    }

}