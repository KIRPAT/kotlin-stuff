package com

import com.kotlinpractice.PracticeExamplesWriter
import com.kotlinpractice.aquariumshop.cli.AquariumShopCli
import com.kotlinpractice.aquariumshop.cli.CliRunner

fun main(args: Array<String>) {
    when {
        args.isEmpty() -> PracticeExamplesWriter.printExampleArray()
        else -> CliRunner.cliLoop()
    }
}

