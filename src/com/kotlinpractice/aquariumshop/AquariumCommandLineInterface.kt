package com.kotlinpractice.aquariumshop

import com.kotlinpractice.aquariumshop.actions.BuildAquariumAction
import com.kotlinpractice.aquariumshop.actions.CloseShopAction
import com.kotlinpractice.aquariumshop.actions.PrintAquariumListAction
import com.kotlinpractice.aquariumshop.actions.TestAction

object AquariumCommandLineInterface {
    val actionList = listOf(
        //TestAction(),
        PrintAquariumListAction(),
        BuildAquariumAction(),
        CloseShopAction()
    )

    fun selectAquariumShopAction() {
        println("\nPlease type in aquarium action index:")
        actionList.forEachIndexed { index, iAction ->
            println("${index + 1}) ${iAction.actionName}")
        }

        var actionIndex = readLine()
        if (actionIndex.isNullOrBlank()) actionIndex = "1"

        var actionIndexAsInt: Int = try {
            actionIndex.toInt()
        } catch (exception: Exception) {
            1
        }

        val action = actionList[actionIndexAsInt - 1].action()
        action()
    }
}

