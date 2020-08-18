package com.kotlinpractice.aquariumshop.cli.cliactions

import com.kotlinpractice.aquariumshop.cli.CliRunner

class CloseShopCliAction : ICliAction {
    override val actionName: String
        get() = "Close the shop."

    override fun action(): () -> Unit = {
        CliRunner.isCliOpen = false
    }
}