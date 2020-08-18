package com.kotlinpractice.aquariumshop.fish

interface IFish {
    val size: Int
    val friendly: Boolean
    val volumeNeeded: Int
        get() = if (friendly) size else size * 2
}