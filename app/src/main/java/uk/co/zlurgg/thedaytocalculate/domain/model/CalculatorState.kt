package uk.co.zlurgg.thedaytocalculate.domain.model

data class CalculatorState(
    val number1: String =  "",
    val number2: String =  "",
    val operation: CalculatorOperation? = null,
    val oneNumberOperation: OneNumberCalculatorOperation? = null
)