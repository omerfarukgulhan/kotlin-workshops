package com.example.lists

fun main() {
    val contacts = mutableListOf<Contact>()

    while (true) {
        println("1. Add Contact")
        println("2. View Contacts")
        println("3. Remove Contact")
        println("4. Exit")
        print("Choose an option: ")
        when (readLine()?.toInt()) {
            1 -> addContact(contacts)
            2 -> viewContacts(contacts)
            3 -> removeContact(contacts)
            4 -> break
            else -> println("Invalid option")
        }
    }
}

fun addContact(contacts: MutableList<Contact>) {
    print("Enter contact name: ")
    val name = readLine().orEmpty()

    print("Enter contact phone: ")
    val phone = readLine().orEmpty()

    contacts.add(Contact(name, phone))
    println("Contact added!")
}

fun viewContacts(contacts: List<Contact>) {
    if (contacts.isEmpty()) {
        println("No contacts found.")
    } else {
        contacts.forEachIndexed { index, contact ->
            println("${index + 1}. ${contact.name}: ${contact.phone}")
        }
    }
}

fun removeContact(contacts: MutableList<Contact>) {
    print("Enter contact name to remove: ")
    val name = readLine().orEmpty()
    val contactToRemove = contacts.find { it.name == name }
    if (contactToRemove != null) {
        contacts.remove(contactToRemove)
        println("Contact removed!")
    } else {
        println("Contact not found.")
    }
}
