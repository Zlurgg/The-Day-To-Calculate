package uk.co.zlurgg.thedaytocalculate.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import uk.co.zlurgg.thedaytocalculate.domain.model.CalculatorEvent
import uk.co.zlurgg.thedaytocalculate.domain.model.CalculatorOperation
import uk.co.zlurgg.thedaytocalculate.domain.model.CalculatorState
import uk.co.zlurgg.thedaytocalculate.domain.model.OneNumberCalculatorOperation
import java.lang.Math.pow
import kotlin.math.log10
import kotlin.math.sqrt

class CalculatorViewModel : ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set

    fun onEvent(event: CalculatorEvent) {
        when (event) {
            is CalculatorEvent.Number -> enterNumber(event.number)
            is CalculatorEvent.Decimal -> enterDecimal()
            is CalculatorEvent.Clear -> state = CalculatorState()
            is CalculatorEvent.Operation -> enterOperation(event.operation)
            is CalculatorEvent.Calculate -> performCalculation()
            is CalculatorEvent.Delete -> performDeletion()
            is CalculatorEvent.OneNumberOperations -> performOneNumberOperations(event.oneNumberOperation)
        }
    }

    private fun performOneNumberOperations(oneNumberOperation: OneNumberCalculatorOperation) {
        if(state.number1.isNotBlank()) {
            state = state.copy(oneNumberOperation = oneNumberOperation)
        }
        val number1 = state.number1.toDoubleOrNull()
        if(number1 != null) {
            val result = when(state.oneNumberOperation) {
                OneNumberCalculatorOperation.Fraction -> 1 / number1
                OneNumberCalculatorOperation.Log -> log10(number1)
                OneNumberCalculatorOperation.Sqrt -> sqrt(number1)
                OneNumberCalculatorOperation.Square -> pow(number1, 2.0)
                OneNumberCalculatorOperation.Negate -> number1 * -1
                null -> return
            }
            state = state.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operation = null
            )
        }
    }

    private fun performDeletion() {
        when {
            state.number2.isNotBlank() -> state = state.copy(
                number2 = state.number2.dropLast(1)
            )
            state.operation != null -> state = state.copy(
                operation = null
            )
            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.dropLast(1)
            )
        }
    }

    private fun performCalculation() {
        val number1 = state.number1.toDoubleOrNull()
        val number2 = state.number2.toDoubleOrNull()
        if(number1 != null && number2 != null) {
            val result = when(state.operation) {
                is CalculatorOperation.Add -> number1 + number2
                is CalculatorOperation.Subtract -> number1 - number2
                is CalculatorOperation.Multiply -> number1 * number2
                is CalculatorOperation.Divide -> number1 / number2
                is CalculatorOperation.Remainder -> number1 % number2
                null -> return
            }
            state = state.copy(
                number1 = result.toString().take(9),
                number2 = "",
                operation = null
            )
        }
    }

    private fun enterOperation(operation: CalculatorOperation) {
        if(state.number1.isNotBlank()) {
            state = state.copy(operation = operation)
        }
    }

    private fun enterDecimal() {
        if(state.operation == null && !state.number1.contains(".") && state.number1.isNotBlank()) {
            state = state.copy(
                number1 = state.number1 + "."
            )
            return
        } else if(!state.number2.contains(".") && state.number2.isNotBlank()) {
            state = state.copy(
                number2 = state.number2 + "."
            )
        }
    }

    private fun enterNumber(number: Int) {
        if(state.operation == null) {
            if(state.number1.length >= MAX_NUM_LENGTH) {
                return
            }
            state = state.copy(
                number1 = state.number1 + number
            )
            return
        }
        if(state.number2.length >= MAX_NUM_LENGTH) {
            return
        }
        state = state.copy(
            number2 = state.number2 + number
        )
    }

    companion object {
        private const val MAX_NUM_LENGTH = 8
    }
}