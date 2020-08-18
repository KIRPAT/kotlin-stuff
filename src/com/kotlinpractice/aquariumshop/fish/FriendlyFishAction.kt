package com.kotlinpractice.aquariumshop.fish

class FriendlyFishAction(private val vegetable: String) : IFishAction {
    override fun eat() = println("I eat vegetable. Namely, ${this.vegetable}.")
}