package com.kotlinpractice.examples

class ExtensionFunctionsExample : IPracticeExample {
    override val exampleTitle: String?
        get() = "Extension Functions Example"
    override val exampleExplanation: String?
        get() = "Extension Functions"

    private fun String.makeItSayHelloWorld(): String {
        return "${this} says Hello World"
    }

    override fun executeExample(): String? {
        var localStringVariable = "Kitago"
        return localStringVariable.makeItSayHelloWorld()
    }
}