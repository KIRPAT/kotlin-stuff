package com.kotlinpractice.examples

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