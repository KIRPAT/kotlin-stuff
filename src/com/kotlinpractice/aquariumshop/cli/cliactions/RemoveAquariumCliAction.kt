package com.kotlinpractice.aquariumshop.cli.cliactions

import com.kotlinpractice.aquariumshop.Aquarium
import com.kotlinpractice.aquariumshop.AquariumStorageManager

class RemoveAquariumCliAction : ICliAction {
    override val actionName: String
        get() = "Remove Aquarium"

    override fun action(): () -> Unit = {
        if (AquariumStorageManager.aquariumList.size == 0) {
            println("There are no aquariums in the storage.")
        } else {
            println("Please enter the index number of the aquarium you want to remove, default is \"1\":")
            var aquariumIndex = readLine()

            if (aquariumIndex.isNullOrBlank()) aquariumIndex = "1"

            val aquariumIndexAsInt: Int = try {
                aquariumIndex.toInt()
            } catch (exception: Exception) {
                1
            }
            println(aquariumIndexAsInt)
            AquariumStorageManager.removeAquarium(aquariumIndexAsInt)
        }
    }
}