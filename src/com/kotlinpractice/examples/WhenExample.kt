package com.kotlinpractice.examples

class WhenExample: IPracticeExample {
    override val exampleTitle: String?
        get() = "When Example"

    override val exampleExplanation: String?
        get() = "When control flow implementation."

    private fun whenFlow(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }

    override fun executeExample(): String? {
        val longLocalMember : Long = 20000
        return "${this.whenFlow("Hello")}, ${this.whenFlow(longLocalMember)}, ${this.whenFlow(1)}"
    }
}