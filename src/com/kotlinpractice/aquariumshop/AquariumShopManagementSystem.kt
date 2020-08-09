package com.kotlinpractice.aquariumshop

/**
 * Aquarium Management systems is a singleton,
 * It is safe to create its instances anywhere.
 * */
object AquariumShopManagementSystem {
    var isShopOpen = true
    private val aquariumList = mutableListOf<Aquarium>()

    fun addAquarium(newAquarium: Aquarium) {
        println("Adding new Aquarium: ${newAquarium.name}")
        this.aquariumList.add(newAquarium)
    }

    fun printAquariumList() {
        aquariumList.forEachIndexed { index, aquarium -> print("${index + 1}) ${aquarium.name} ") }
        println()
    }
}