package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of ticket:")
    var ticket =scanner.nextInt()
    print(("How many roundtripp tickets:"))
    var round =scanner.nextInt()
    print("Total tickets:"+ticket)
    print("Round trip:"+round)
    print("Total:"+((ticket-round)*1000+(round*1800)))



}