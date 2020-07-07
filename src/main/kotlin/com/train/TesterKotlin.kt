package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var ticket = -2
    while (ticket != -1) {
        println("Please enter number of ticket:")
        ticket = scanner.nextInt()
        if (ticket == -1) {
            println("work done!!")
            break;
        } else {
            println(("How many roundtripp tickets:"))
            var round = scanner.nextInt()
            println("Total tickets:" + ticket)
            println("Round trip:" + round)
            println("Total:" + ((ticket - round) * 1000 + (round * 1800)))
        }
    }
}