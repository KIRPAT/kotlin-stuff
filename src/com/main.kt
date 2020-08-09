package com

import com.kotlinpractice.PracticeExamplesWriter
import com.kotlinpractice.aquariumshop.AquariumCommandLineInterface
import com.kotlinpractice.aquariumshop.AquariumShopManagementSystem
import com.kotlinpractice.clearConsole

fun main(args: Array<String>) {
    when {
        args.isEmpty() -> PracticeExamplesWriter.printExampleArray()
        else -> aquariumShopLoop()
    }
}

fun aquariumShopLoop() {
    while (AquariumShopManagementSystem.isShopOpen) {
        AquariumCommandLineInterface.selectAquariumShopAction()
    }
}
