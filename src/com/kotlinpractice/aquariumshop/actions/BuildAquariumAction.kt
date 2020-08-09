package com.kotlinpractice.aquariumshop.actions

import com.kotlinpractice.aquariumshop.Aquarium
import com.kotlinpractice.aquariumshop.AquariumShopManagementSystem

class BuildAquariumAction : IAction {
    override val actionName: String
        get() = "Build Aquarium"

    override fun action(): () -> Unit = {
        println("Building aquarium, please enter a name:")
        val newAquariumName = readLine()
        val newAquarium = newAquariumName?.let { Aquarium(newAquariumName) } ?: Aquarium()
        println("Aquarium \"${newAquarium.name}\" has been built.")
        AquariumShopManagementSystem.addAquarium(newAquarium)
    }
}