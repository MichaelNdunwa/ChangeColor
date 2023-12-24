package com.michael.changecolor

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
   /* CustomColor.values().forEach {
        println(it.rgb)
    }*/

    val colours = CustomColor.values()
    val random = Random.nextInt(colours.indices)
    println(random)
    val n = Random.nextInt(3)
    println(colours[n].rgb)
}