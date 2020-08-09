package com.kotlinpractice.aquariumshop.actions

/**
 * An action object is responsible for carrying the action name, and the action function itself.
 * */
interface IAction {
    val actionName: String
    fun action(): () -> Unit
}