package uk.co.zlurgg.thedaytocalculate.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uk.co.zlurgg.thedaytocalculate.presentation.components.CalculatorButton
import uk.co.zlurgg.thedaytocalculate.presentation.components.Display
import uk.co.zlurgg.thedaytocalculate.ui.theme.TheDayToCalculateTheme

@Composable
fun CalculatorScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Row(
            modifier = modifier
                .padding(8.dp)
                .fillMaxWidth()
                .height(250.dp)
        ) {
            // Display
            Display()
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Row(
            modifier = modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // operators % CE C del
            CalculatorButton(symbol = "%") {

            }
            CalculatorButton(symbol = "CE") {

            }
            CalculatorButton(symbol = "C") {

            }
            CalculatorButton(symbol = "<x]") {

            }
        }

        Row(
            modifier = modifier
                .padding(horizontal = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // operators 1/x x^2 sqrt /
            CalculatorButton(symbol = "1/x") {

            }
            CalculatorButton(symbol = "x^2") {

            }
            CalculatorButton(symbol = "sqrt") {

            }
            CalculatorButton(symbol = "/") {

            }
        }

        Row(
            modifier = modifier
                .padding(horizontal = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // operators and numbers 7 8 9 *
            CalculatorButton(symbol = "7") {

            }
            CalculatorButton(symbol = "8") {

            }
            CalculatorButton(symbol = "9") {

            }
            CalculatorButton(symbol = "*") {

            }
        }

        Row(
            modifier = modifier
                .padding(horizontal = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // operators and numbers 4 5 6 -
            CalculatorButton(symbol = "4") {

            }
            CalculatorButton(symbol = "5") {

            }
            CalculatorButton(symbol = "6") {

            }
            CalculatorButton(symbol = "-") {

            }
        }

        Row(
            modifier = modifier
                .padding(horizontal = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // operators and numbers 1 2 3 +
            CalculatorButton(symbol = "1") {

            }
            CalculatorButton(symbol = "2") {

            }
            CalculatorButton(symbol = "3") {

            }
            CalculatorButton(symbol = "+") {

            }
        }

        Row(
            modifier = modifier
                .padding(horizontal = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // operators and numbers  +/- 0 . =
            CalculatorButton(symbol = "+/-") {

            }
            CalculatorButton(symbol = "0") {

            }
            CalculatorButton(symbol = ".") {

            }
            CalculatorButton(symbol = "=") {

            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorScreenPreview() {
    TheDayToCalculateTheme {
        CalculatorScreen()
    }
}
