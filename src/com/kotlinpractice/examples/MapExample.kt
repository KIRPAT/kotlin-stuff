package com.kotlinpractice.examples

class MapExample : IPracticeExample {
    private fun readOnlyMap(): String {
        val readOnlyMap: Map<String, Any> = mapOf("a" to 1, "b" to 2)
        var resultString = ""

        for ((k, v) in readOnlyMap) {
            resultString += "$k-$v "
        }

        return resultString
    }

    private fun mutableMap(): String {
        val mutableMap: MutableMap<String, Any> = mutableMapOf("a" to 1, "b" to 2)
        var resultString = ""

        mutableMap["c"] = 3

        for ((k, v) in mutableMap) {
            resultString += "$k-$v "
        }

        return resultString
    }

    override val exampleTitle: String?
        get() = "Map Examples"

    override val exampleExplanation: String?
        get() = "Examples with Maps"

    override fun executeExample(): String? {
        var resultString = ""

        resultString += "\n${this.readOnlyMap()}"
        resultString += "\n${this.mutableMap()}"

        return resultString
    }
}