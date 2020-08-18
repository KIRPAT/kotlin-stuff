package com.kotlinpractice.aquariumshop.cli

import com.kotlinpractice.aquariumshop.cli.cliactions.ICliAction

interface ICli {
    val cliName: String
    val actionList: List<ICliAction>
}