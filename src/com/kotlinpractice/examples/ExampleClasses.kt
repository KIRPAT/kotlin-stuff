package com.kotlinpractice.examples

class InferredReturnValueExample : IPracticeExample {
    override val exampleTitle: String
        get() = "Inferred Return Value Function"

    override val exampleExplanation: String = "Sums 5 + 2 and returns its string value as an inferred return value."

    override fun executeExample(): String = (5 + 2).toString()
}

// CONDITIONAL FLOW
class IfExample: IPracticeExample {
    override val exampleTitle: String = "If Else Example"

    override val exampleExplanation: String
        get() = "If-else implementations."

    override fun executeExample(): String {
        var result: String = ""

        if (5 > 3) result += "\n5 is bigger than 3"

        if (5 > 3) {
            result += "\n5 is bigger than 3"
        } else {
            result += "\n5 is smaller than 3, which is not true"
        }

        //If-Else as an expression. Turnerry
        result += if (5 > 3) "5 is bigger than 3" else "5 is smaller than 3, which is not true"

        return result
    }
}

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

// RANGES

class IterationsAndRangeExample : IPracticeExample {
    override val exampleTitle: String?
        get() = "Iterations and Range Example"
    override val exampleExplanation: String?
        get() = "Various range examples."

    private fun inRangeCheckExamples(): String {
        var result: String = ""

        if (10 in 1..10) {
            result += "\nx is in range"
        }

        val list = listOf("a", "b", "c")
        if (-1 !in 0..list.lastIndex) {
            result += "\n-1 is out of range"
        }
        if (list.size !in list.indices) {
            result += "\nlist size is out of valid list indices range, too"
        }

        return result
    }

    private fun iteratingOverRangeExamples(): String{
        var result: String = ""
        var tempResult: String = ""

        for(x in 2..5){
            tempResult += x.toString()
        }
        result += "\n$tempResult"
        tempResult = ""

        for (x in 1..10 step 2) {
            tempResult += x.toString()
        }
        result += "\n$tempResult"
        tempResult = ""

        for (x in 9 downTo 0 step 3) {
            tempResult += x.toString()
        }
        result += "\n$tempResult"

        return result
    }

    private fun iteratingOverCollectionExamples(): String{
        var result = ""
        var tempResult = ""

        var mutableNamesList = mutableListOf("Kitago", "Serastrim", "Vir Dirthera")

        for (item in mutableNamesList){
            tempResult += " $item"
        }
        result += "\n$tempResult"

        fun doesCollectionContain(list: MutableList<String>): String = when {
                "Kitagoo" in list -> "Kitago was here"
                "Vir Dirthera" in list -> "Vir Dirthera was here"
                 else -> "Couldn find nothing."
             }
        result += "\n${doesCollectionContain(mutableNamesList)}"

        return result
    }

    override fun executeExample(): String? {
        var result: String = ""

        result += this.inRangeCheckExamples()
        result += this.iteratingOverRangeExamples()
        result += this.iteratingOverCollectionExamples()

        return result
    }
}

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

// Object Oriented Stuff
class ConstructorInitExample : IPracticeExample {
    override val exampleTitle: String? = null
    override val exampleExplanation: String? = null
    override fun executeExample(): String {
        println("- ConstructorInitExample -")
        println("Tests priorities of class constructor and initializer.")
        println("Result:")
        val regularConstructorExample = RegularConstructorExample(25 )
        val primaryConstructorExampleObject = PrimaryConstructorExample(12 )
        return ""
    }
}