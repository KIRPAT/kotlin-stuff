package com.kotlinpractice.examples

class WhileExample: IPracticeExample {
    override val exampleTitle: String?
        get() = "While Example"

    override val exampleExplanation: String?
        get() = "While control flow implementation"

    override fun executeExample(): String? {
        var i = 0
        while (i < 10){
            i++
        }
        return i.toString()
    }
}