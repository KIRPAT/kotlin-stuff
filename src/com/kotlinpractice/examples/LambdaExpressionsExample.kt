package com.kotlinpractice.examples

class LambdaExpressionsExample : IPracticeExample {
    // Assigning a lambda function (a function without a name) to a value.
    private val divideByTwo: (Int) -> Int = { divide -> divide / 2 }

    // Higher order function
    private fun applyOperation(operationInteger: Int = 24, operationFunction: (Int) -> Int): Int {
        return operationFunction(operationInteger)
    }

    // Last statement gets returned.
    private val filteringWithLambdaExpressions: () -> String = {
        var result = ""
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { result += it }
        result
    }

    override val exampleTitle: String?
        get() = "Lambda Expressions"

    override val exampleExplanation: String?
        get() = "Using lambda expressions to filter and map collections."

    override fun executeExample(): String? {
        var result = ""
        result += "\n${filteringWithLambdaExpressions()}"
        result += "\n${applyOperation { anInteger -> anInteger }}" // Last parameter lambda function.
        result += "\n${applyOperation(operationFunction = { anInteger -> anInteger })}" // Same thing, but in the function parenthesis.
        result += "\n${applyOperation(operationInteger = 12, operationFunction = divideByTwo)}"
        return result
    }
}