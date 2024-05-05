package com.example.kotlinbasics
//main function
fun main(){
    makecoffees(1)
    makecoffees(2)
    makecoffees(30)
}
//Define function and $ symbol works same for iteration for other values
fun makecoffees(sugarCount:Int) {
    if (sugarCount == 1) {
        println("1 spoon of sugar for one spoon")
    } else {
        println("cofee with $sugarCount spoons of sugar")

    }
}