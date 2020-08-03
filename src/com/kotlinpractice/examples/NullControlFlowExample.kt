package com.kotlinpractice.examples

import java.lang.IllegalStateException

class NullControlFlowExample : IPracticeExample {
    override val exampleTitle: String?
        get() = "Null Control Flow Example"
    override val exampleExplanation: String?
        get() = "Nul short hand check implementations."

    override fun executeExample(): String? {
        var resultString = ""

        val localMutableListValue: MutableList<String>? = null
        resultString += "\n${localMutableListValue?.size}"
        resultString += "\n${localMutableListValue?.size ?: "empty"}"

        val localMutableMapValue: MutableMap<String, String> = mutableMapOf("a" to "A")
        resultString += "\n${localMutableMapValue["b"]?: IllegalStateException("Key is missing.")}"

        val nullString: String? = null
        val notNullString: String? = "Hello World"

        fun notNullDependentCodeBlock(stringParameter: String?): String {
            return stringParameter?.let {
                "This block got executed cus \"$it\" is not null"
            } ?: "DefaultString cus the string is null"
        }

        resultString += "\n${notNullDependentCodeBlock(nullString)}"
        resultString += "\n${notNullDependentCodeBlock(notNullString)}"

        return resultString
    }
}