package com.example.kotlinbasics

fun main() {
    var computerchoice = ""
    var playerchoice = ""
    println("Rock,paper or Scissors? Enter your choice!")
    playerchoice = readln()
    val randomNumber = (1..3).random()
    if (randomNumber == 1) {
        computerchoice = "Rock"
    } else if (randomNumber == 2) {
        computerchoice = "Paper"
    } else {
        computerchoice = "Scissor"
    }
    val winner = when {
        playerchoice == computerchoice -> "Tie"
        playerchoice == "Rock" && computerchoice == "Scissor" -> "Player"
        playerchoice == "Paper" && computerchoice == "Rock" -> "Player"
        playerchoice == "Scissor" && computerchoice == "Paper" -> "Player"
        else -> "Computer"
    }
    if (winner == "Tie") {
        println("it's tie")
    } else {
        println(computerchoice)
        println(winner + "won!")
    }
}