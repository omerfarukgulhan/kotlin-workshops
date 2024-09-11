package com.example.funcandobjects

class BankAccount(var accountNumber: String) {
    private var balance: Double = 0.0

    init {
        printAccountDetails()
    }

    fun getBalance(): Double {
        return balance
    }

    fun printAccountDetails() {
        println("Account Number: ${getBalance()}")
        println("Current Balance: $$balance")
    }

    fun withdraw(amount: Double) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount
                println("withdrew: $$amount")
            } else {
                println("insufficient funds.")
            }
        } else {
            println("withdrawal amount must be positive.")
        }
    }

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("deposited: $$amount")
        } else {
            println("deposit amount must be positive.")
        }
    }
}