package com.example.funcandobjects

fun main() {
    val account = BankAccount("123456789")

    account.deposit(100.0)
    account.deposit(50.0)

    account.withdraw(30.0)
    account.withdraw(150.0)

    account.printAccountDetails()

    println("Final Balance: $${account.getBalance()}")
}