package com.kotlinpractice.aquariumshop.cli.cliactions

import com.kotlinpractice.aquariumshop.cli.AquariumShopCli
import com.kotlinpractice.aquariumshop.cli.CliRunner

class GoToAquariumShopCliAction : ICliAction {
    override val actionName: String
        get() = "Go to Aquarium Shop"

    override fun action(): () -> Unit = {
        CliRunner.activeCli = AquariumShopCli
    }
}