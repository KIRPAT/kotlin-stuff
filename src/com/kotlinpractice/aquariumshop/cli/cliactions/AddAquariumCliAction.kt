package com.kotlinpractice.aquariumshop.cli.cliactions

import com.kotlinpractice.aquariumshop.Aquarium
import com.kotlinpractice.aquariumshop.AquariumStorageManager


class AddAquariumCliAction : ICliAction {
    override val actionName: String
        get() = "Build and store a new aquarium."

    override fun action(): () -> Unit = {
        println("Building aquarium, please enter a name:")
        val newAquariumName = readLine()

        val newAquarium = if (newAquariumName.isNullOrBlank()) Aquarium() else Aquarium(newAquariumName)
        println("Aquarium \"${newAquarium.name}\" has been built.")
        AquariumStorageManager.addAquarium(newAquarium)
    }
}