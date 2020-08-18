package com.kotlinpractice.aquariumshop.cli.cliactions

import com.kotlinpractice.aquariumshop.AquariumStorageManager

class PrintAquariumListCliAction : ICliAction {
    override val actionName: String
        get() = "See existing aquariums."

    override fun action(): () -> Unit = {
        AquariumStorageManager.printAquariumList()
    }
}