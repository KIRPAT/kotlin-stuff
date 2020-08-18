package com.kotlinpractice.aquariumshop.cli

import com.kotlinpractice.aquariumshop.cli.cliactions.AddAquariumCliAction
import com.kotlinpractice.aquariumshop.cli.cliactions.CloseShopCliAction
import com.kotlinpractice.aquariumshop.cli.cliactions.GoToAquariumStorageCliAction
import com.kotlinpractice.aquariumshop.cli.cliactions.PrintAquariumListCliAction

object AquariumShopCli : ICli {
    override val cliName: String
        get() = "Aquarium Shop"

    override val actionList = listOf(
        PrintAquariumListCliAction(),
        GoToAquariumStorageCliAction(),
        CloseShopCliAction()
    )
}

