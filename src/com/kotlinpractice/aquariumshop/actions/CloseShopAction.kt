package com.kotlinpractice.aquariumshop.actions

import com.kotlinpractice.aquariumshop.AquariumShopManagementSystem

class CloseShopAction : IAction {
    override val actionName: String
        get() = "Close the shop."

    override fun action(): () -> Unit = {
        AquariumShopManagementSystem.isShopOpen = false
    }
}