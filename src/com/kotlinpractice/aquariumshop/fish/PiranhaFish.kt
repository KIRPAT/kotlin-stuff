package com.kotlinpractice.aquariumshop.fish

class PiranhaFish : IFish, IFishAction by HostileFishAction {
    override val friendly: Boolean
        get() = false
    override val size: Int
        get() = 5
}