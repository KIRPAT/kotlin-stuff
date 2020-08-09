package com.kotlinpractice.examples

class IfExample : IPracticeExample {
    override val exampleTitle: String = "If Else Example"

    override val exampleExplanation: String
        get() = "If-else implementations."

    override fun executeExample(): String {
        var result: String = ""

        if (5 > 3) result += "\n5 is bigger than 3"

        result += if (5 > 3) {
            "\n5 is bigger than 3"
        } else {
            "\n5 is smaller than 3, which is not true"
        }

        //If-Else as an expression. Turnerry
        result += if (5 > 3) "5 is bigger than 3" else "5 is smaller than 3, which is not true"

        return result
    }
}