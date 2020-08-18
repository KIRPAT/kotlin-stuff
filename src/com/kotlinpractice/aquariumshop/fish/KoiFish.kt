package com.kotlinpractice.aquariumshop.fish

class KoiFish : IFish, IFishAction by FriendlyFishAction(vegetable = "onion") {
    override val friendly: Boolean
        get() = true

    override val size: Int
        get() = 3
}