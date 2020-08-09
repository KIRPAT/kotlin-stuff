package com.kotlinpractice.examples

class WithExample : IPracticeExample {
    override val exampleTitle: String?
        get() = "With Example"
    override val exampleExplanation: String?
        get() = "Calling multiple methods of a single object instance."

    override fun executeExample(): String? {
        val localCounter = Counter()

        localCounter.apply { counterVariable = 5 }

        with(localCounter) {
            for (i in 1..5)
                increaseCounterVariable()
        }


        return localCounter.counterVariable.toString()
    }
}

class Counter {
    var counterVariable = 0
    fun increaseCounterVariable() {
        this.counterVariable += 1
    }
}