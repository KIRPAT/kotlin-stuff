package com.kotlinpractice

import com.kotlinpractice.examples.*

class PracticeExamplesManager {
    private val exampleList = mutableListOf<IPracticeExample>()

    constructor() {
        this.registerExamplesToExampleList()
    }

    fun printExampleArray() {
        this.exampleList.forEach {
            println("${it.generateExampleString()}" )
        }
    }

    private fun registerExamplesToExampleList() {
        exampleList.add(InferredReturnValueExample())
        exampleList.add(IfExample())
        exampleList.add(WhileExample())
        exampleList.add(WhenExample())
        exampleList.add(IterationsAndRangeExample())
        exampleList.add(LambdaExpressionsExample())
        exampleList.add(ConstructorInitExample())
    }
}


