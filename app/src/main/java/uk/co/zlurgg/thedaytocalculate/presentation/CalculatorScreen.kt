package uk.co.zlurgg.thedaytocalculate.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uk.co.zlurgg.thedaytocalculate.presentation.components.CalculatorButton
import uk.co.zlurgg.thedaytocalculate.presentation.components.Display
import uk.co.zlurgg.thedaytocalculate.ui.theme.TheDayToCalculateTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import uk.co.zlurgg.thedaytocalculate.domain.model.CalculatorEvent
import uk.co.zlurgg.thedaytocalculate.domain.model.CalculatorOperation
import uk.co.zlurgg.thedaytocalculate.domain.model.OneNumberCalculatorOperation

@Composable
fun CalculatorScreen(modifier: Modifier = Modifier) {
    val viewModel = viewModel<CalculatorViewModel>()
    val state = viewModel.state

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(8.dp),

            ) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Display(
                    modifier = modifier,
                    number1 = state.number1,
                    number2 = state.number2,
                    operation = state.operation
                )
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // operators % CE C del
//                CalculatorButton(symbol = "log") {
//                    viewModel.onEvent(CalculatorEvent.OneNumberOperations(OneNumberCalculatorOperation.Log))
//                }
                CalculatorButton(
                    symbol = "%",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Operation(CalculatorOperation.Remainder))
                    }
                )
                CalculatorButton(
                    symbol = "CE",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Clear)
                    }
                )
                CalculatorButton(
                    symbol = "C",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Clear)
                    }
                )
                CalculatorButton(
                    symbol = "<x]",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Delete)
                    }
                )
            }
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // operators 1/x x^2 sqrt /
                CalculatorButton(
                    symbol = "1/x",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.OneNumberOperations(OneNumberCalculatorOperation.Fraction))
                    }
                )
                CalculatorButton(
                    symbol = "x^2",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.OneNumberOperations(OneNumberCalculatorOperation.Square))
                    }
                )
                CalculatorButton(
                    symbol = "sqrt",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.OneNumberOperations(OneNumberCalculatorOperation.Sqrt))
                    }
                )
                CalculatorButton(
                    symbol = "/",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Operation(CalculatorOperation.Divide))
                    }
                )
            }
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // operators and numbers 7 8 9 *
                CalculatorButton(
                    symbol = "7",
                    color = Color.LightGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Operation(CalculatorOperation.Divide))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    color = Color.LightGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Number(8))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    color = Color.LightGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Number(9))
                    }
                )
                CalculatorButton(
                    symbol = "*",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Operation(CalculatorOperation.Multiply))
                    }
                )
            }
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // operators and numbers 4 5 6 -
                CalculatorButton(
                    symbol = "4",
                    color = Color.LightGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Number(4))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    color = Color.LightGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Number(5))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    color = Color.LightGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Number(6))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Operation(CalculatorOperation.Subtract))
                    }
                )
            }
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // operators and numbers 1 2 3 +
                CalculatorButton(
                    symbol = "1",
                    color = Color.LightGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Number(1))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    color = Color.LightGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Number(2))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    color = Color.LightGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Number(3))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Operation(CalculatorOperation.Add))
                    }
                )
            }
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // operators and numbers  +/- 0 . =
                CalculatorButton(
                    symbol = "+/-",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.OneNumberOperations(OneNumberCalculatorOperation.Negate))
                    }
                )
                CalculatorButton(
                    symbol = "0",
                    color = Color.LightGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Number(0))
                    }
                )
                CalculatorButton(
                    symbol = ".",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    color = Color.DarkGray,
                    modifier = modifier.weight(1f),
                    onClick = {
                        viewModel.onEvent(CalculatorEvent.Calculate)
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorScreenPreview() {
    TheDayToCalculateTheme {
        CalculatorScreen()
    }
}
