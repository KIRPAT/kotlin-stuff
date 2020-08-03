package com.kotlinpractice.examples

class LambdaExpressionsExample : IPracticeExample {
    override val exampleTitle: String?
        get() = "Lambda Expressions"
    override val exampleExplanation: String?
        get() = "Using lambda expressions to filter and map collections."
    override fun executeExample(): String? {
        var result = ""
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits
                .filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { result += it }
        return result
    }
}