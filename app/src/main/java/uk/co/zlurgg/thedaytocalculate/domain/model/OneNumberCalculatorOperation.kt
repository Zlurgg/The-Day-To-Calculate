package uk.co.zlurgg.thedaytocalculate.domain.model

sealed class OneNumberCalculatorOperation(val symbol: String) {
    data object Fraction : OneNumberCalculatorOperation("1/x")
    data object Square : OneNumberCalculatorOperation("x^2")
    data object Sqrt : OneNumberCalculatorOperation("sqrt")
    data object Log : OneNumberCalculatorOperation("log")
    data object Negate : OneNumberCalculatorOperation("+/-")
}