package com.kotlinpractice.examples

/*
* This file contains example classes
* and functions for various example classes.
*
* No order.
* */

class RegularConstructorExample {
    private val classMemberValueA: Int?
    private var classMemVariableB: String?

    constructor(primaryConstructorValueA: Int, primaryConstructorVariableB: String = "Hello World"){
        this.classMemberValueA = primaryConstructorValueA
        this.classMemVariableB = primaryConstructorVariableB
        println(
                "${::classMemberValueA.name} -> $classMemberValueA" +
                "\n ${::classMemVariableB.name} -> $classMemVariableB"
        )
    }

    init {
        println("RegularConstructorExample")
        println("Init blocks work before the constructor. Thus, the non initialized variables can not be accessed.")
    }
}

class PrimaryConstructorExample(primaryConstructorValueA: Int, val primaryConstructorVariableB: String = "Hello World") {
    private val classMemberValueA: Int = primaryConstructorValueA

    init {
        println("PrimaryConstructorExample ")
        println("First \"init\"")
    }

    init {
        println("Second \"init\"")
        println(
                "${::primaryConstructorVariableB.name} -> $primaryConstructorVariableB" +
                "\n ${::classMemberValueA.name} -> $classMemberValueA"
        )
    }
}