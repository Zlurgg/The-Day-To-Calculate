package uk.co.zlurgg.thedaytocalculate.domain.model

sealed class CalculatorEvent {
    data class Number(val number: Int): CalculatorEvent()
    data class Operation(val operation: CalculatorOperation): CalculatorEvent()
    data class OneNumberOperations(val oneNumberOperation: OneNumberCalculatorOperation): CalculatorEvent()
    data object Clear: CalculatorEvent()
    data object Decimal: CalculatorEvent()
    data object Calculate: CalculatorEvent()
    data object Delete: CalculatorEvent()
}