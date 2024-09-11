package com.example.basics

fun main() {
    var computerChoice = ""
    var computerPoint = 0
    var playerChoice = ""
    var playerPoint = 0
    var winner = ""
    println("rock paper scissors")

    while (playerPoint < 3 && computerPoint < 3) {
        playerChoice = readln().lowercase()
        if (playerChoice !in listOf("rock", "paper", "scissors")) {
            println("invalid choice")
            continue
        }

        computerChoice = when ((1..3).random()) {
            1 -> "rock"
            2 -> "paper"
            3 -> "scissors"
            else -> throw IllegalStateException("Unexpected value")
        }
        println("computer: $computerChoice")

        winner = when {
            playerChoice == computerChoice -> "tie"
            (playerChoice == "rock" && computerChoice == "scissors") ||
                    (playerChoice == "paper" && computerChoice == "rock") ||
                    (playerChoice == "scissors" && computerChoice == "paper") -> "player"

            else -> "computer"
        }

        when (winner) {
            "player" -> playerPoint += 1
            "computer" -> computerPoint += 1
        }

        println("$playerPoint - $computerPoint")
    }

    println(winner)
}