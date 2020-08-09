package com.kotlinpractice.aquariumshop.actions

class TestAction : IAction {
    override val actionName: String = "Test Action"
    override fun action(): () -> Unit = {
        println("Test Action")
    }
}

