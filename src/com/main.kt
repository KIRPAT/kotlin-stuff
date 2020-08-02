package com

import com.kotlinpractice.PracticeExamplesManager

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        val practiceExampleManager = PracticeExamplesManager()
        practiceExampleManager.printExampleArray()
    } else {
        println("Fish Tank Incoming. Soon TM.")
    }
}

