package com.kotlinpractice.aquariumshop.cli.cliactions

/**
 * An action object is responsible for carrying the action name, and the action function itself.
 *
 * Actions can access singletons and do operations on them.
 * */
interface ICliAction {
    val actionName: String
    fun action(): () -> Unit
}