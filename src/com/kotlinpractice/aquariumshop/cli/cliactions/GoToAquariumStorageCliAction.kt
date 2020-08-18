package com.kotlinpractice.aquariumshop.cli.cliactions

import com.kotlinpractice.aquariumshop.cli.AquariumStorageCli
import com.kotlinpractice.aquariumshop.cli.CliRunner

class GoToAquariumStorageCliAction : ICliAction {
    override val actionName: String
        get() = "Go to AquariumStorage"

    override fun action(): () -> Unit = {
        CliRunner.activeCli = AquariumStorageCli
    }
}