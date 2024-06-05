package uk.co.zlurgg.thedaytocalculate.domain.model

sealed class CalculatorOperation(val symbol: String) {
    data object Divide : CalculatorOperation("/")
    data object Multiply : CalculatorOperation("*")
    data object Subtract : CalculatorOperation("-")
    data object Add : CalculatorOperation("+")
    data object Remainder : CalculatorOperation("%")
}