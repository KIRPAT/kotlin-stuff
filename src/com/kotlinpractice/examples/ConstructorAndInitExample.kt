package com.kotlinpractice.examples

class ConstructorAndInitExample : IPracticeExample {
    override val exampleTitle: String? = null

    override val exampleExplanation: String? = null

    override fun executeExample(): String {
        println("- ConstructorInitExample -")
        println("Tests priorities of class constructor and initializer.")
        println("Result:")
        val regularConstructorExample = RegularConstructorExample(25)
        val primaryConstructorExampleObject = PrimaryConstructorExample(12)
        return ""
    }
}

class RegularConstructorExample {
    private val classMemberValueA: Int?
    private var classMemVariableB: String?

    constructor(primaryConstructorValueA: Int, primaryConstructorVariableB: String = "Hello World") {
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

class PrimaryConstructorExample(
    primaryConstructorValueA: Int,
    val primaryConstructorVariableB: String = "Hello World"
) {
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