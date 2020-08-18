package com.kotlinpractice.aquariumshop.cli

/**
 * Responsible for printing CLI options, and executing those actions.
 *
 * There are multiple CLIs for multiple purposes. AquariumShop is the Home CLI.
 * You can go to other CLIs from there. Just change the activeCli and you will see others.
 * */
object CliRunner {
    var isCliOpen = true
    var activeCli: ICli = AquariumShopCli

    private fun selectAction() {
        println("\nPlease type in the index number of the ${this.activeCli.cliName} action:")
        this.activeCli.actionList.forEachIndexed { index, iAction ->
            println("${index + 1}) ${iAction.actionName}")
        }

        var actionIndex = readLine()
        if (actionIndex.isNullOrBlank()) actionIndex = "1"

        val actionIndexAsInt: Int = try {
            actionIndex.toInt()
        } catch (exception: Exception) {
            1
        }

        val action = this.activeCli.actionList[actionIndexAsInt - 1].action()
        action()
    }

    fun cliLoop() {
        while (isCliOpen) {
            selectAction()
        }
    }
}