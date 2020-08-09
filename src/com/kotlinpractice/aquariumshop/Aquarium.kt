package com.kotlinpractice.aquariumshop

class Aquarium(var name: String = "Aquarium", var height: Int = 10, var width: Int = 15, var length: Int = 20) {
    val volume: Int
        get() = this.height * this.width * this.length / 1000
}