package com.example.kotlinbasics
fun main() {
    var name = "Revanth"
    println(name)
    name="Rajeev"
    println(name)//print as it is string and strings can be modified
    println(name.lowercase())//will print lower case
    println(name.uppercase())//print upper case
    println(name+"M")
    var last_name="Rajeev"
    print(name+"\t"+last_name)
}