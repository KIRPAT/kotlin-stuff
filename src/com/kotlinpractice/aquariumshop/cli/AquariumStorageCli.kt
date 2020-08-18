package com.kotlinpractice.aquariumshop.cli

import com.kotlinpractice.aquariumshop.cli.cliactions.*

object AquariumStorageCli : ICli {
    override val cliName: String
        get() = "Aquarium Storage"
    override val actionList: List<ICliAction> = listOf(
        PrintAquariumListCliAction(),
        AddAquariumCliAction(),
        RemoveAquariumCliAction(),
        GoToAquariumShopCliAction()
    )
}