package com.kotlinpractice

import com.kotlinpractice.examples.*

object PracticeExamplesWriter {
    private val exampleList = mutableListOf<IPracticeExample>()

    init {
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
        exampleList.add(MapExample())
        exampleList.add(ConstructorAndInitExample())
        exampleList.add(ExtensionFunctionsExample())
        exampleList.add(NullControlFlowExample())
        exampleList.add(WithExample())
    }
}


