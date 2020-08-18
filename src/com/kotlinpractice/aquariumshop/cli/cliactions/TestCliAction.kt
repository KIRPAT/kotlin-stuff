package com.kotlinpractice.aquariumshop.cli.cliactions

class TestCliAction : ICliAction {
    override val actionName: String = "Test Action"
    override fun action(): () -> Unit = {
        println("Test Action")
    }
}

