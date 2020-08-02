package com.kotlinpractice.examples

interface IPracticeExample {
    val exampleTitle: String?
    val exampleExplanation: String?
    fun executeExample(): String?
    fun generateExampleString(): String {
        return  "${if(this.exampleTitle !== null) "\n - ${exampleTitle} - " else ""}" +
                "${if(this.exampleExplanation !== null) "\n Explanation: ${this.exampleExplanation}" else ""}" +
                "${if(this.executeExample() !== "") "\n Result: ${this.executeExample()}" else ""} \n"
    }
}