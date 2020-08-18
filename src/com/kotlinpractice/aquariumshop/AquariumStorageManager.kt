package com.kotlinpractice.aquariumshop

/**
 * Aquarium Storage Manager is a singleton,
 * It is safe to create its instances anywhere.
 * */
object AquariumStorageManager {
    val aquariumList = mutableListOf<Aquarium>()

    /**
     * Adds a new aquarium.
     * */
    fun addAquarium(newAquarium: Aquarium) {
        var isThereAnAquariumWithTheSameName = false
        for (aquarium in aquariumList) {
            if (aquarium.name == newAquarium.name) isThereAnAquariumWithTheSameName = true
        }

        if (isThereAnAquariumWithTheSameName) {
            println("Error: We cannot store ${newAquarium.name}. An aquarium with the same name already exists.")
        } else {
            this.aquariumList.add(newAquarium)
            println("Stored new aquarium, \"${newAquarium.name}\".")
        }
    }

    fun removeAquarium(aquariumIndex: Int) {
        if (aquariumIndex in 1..aquariumList.size) {
            println("Removing \"${aquariumList[aquariumIndex - 1].name}\" from the storage.")
            aquariumList.removeAt(aquariumIndex - 1)
        } else {
            println("Error: Invalid aquarium number.")
        }
    }

    fun printAquariumList() {
        aquariumList.forEachIndexed { index, aquarium -> print("${index + 1}) ${aquarium.name} ") }
        println()
    }
}