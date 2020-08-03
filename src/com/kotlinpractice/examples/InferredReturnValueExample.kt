package com.kotlinpractice.examples

class InferredReturnValueExample : IPracticeExample {
    override val exampleTitle: String
        get() = "Inferred Return Value Function"

    override val exampleExplanation: String = "Sums 5 + 2 and returns its string value as an inferred return value."

    override fun executeExample(): String = (5 + 2).toString()
}