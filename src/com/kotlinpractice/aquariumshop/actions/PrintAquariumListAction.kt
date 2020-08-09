package com.kotlinpractice.aquariumshop.actions

import com.kotlinpractice.aquariumshop.AquariumShopManagementSystem

class PrintAquariumListAction : IAction {
    override val actionName: String
        get() = "See existing aquariums."

    override fun action(): () -> Unit = {
        AquariumShopManagementSystem.printAquariumList()
    }
}