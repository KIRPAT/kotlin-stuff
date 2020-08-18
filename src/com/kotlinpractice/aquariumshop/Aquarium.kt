package com.kotlinpractice.aquariumshop

import com.kotlinpractice.aquariumshop.fish.IFish

data class Aquarium(var name: String = "Aquarium", var height: Int = 10, var width: Int = 15, var length: Int = 20) {
    val fishes = mutableMapOf<IFish, Int>() // Fish Type and the amount of it.

    val volume: Int
        get() = this.height * this.width * this.length / 1000


    fun addFish(fish: IFish, amount: Int) {
        this.fishes[fish] = this.fishes[fish]?.let { it + amount } ?: amount
    }

    fun removeFish(fish: IFish, amount: Int) {
        fishes[fish]?.let {
            when {
                it > amount -> fishes[fish] = it - amount
                it <= amount -> fishes.remove(fish)
                else -> println("Something went wrong while removing fish.")
            }
        } ?: println("The aquarium does not contain that fish.")
    }
}