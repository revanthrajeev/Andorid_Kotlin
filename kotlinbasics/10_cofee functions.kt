package com.example.kotlinbasics
//main function
fun main(){
    makecoffee(1)
    makecoffee(2)
    makecoffee(30)
}
//Define function and $ symbol works same for iteration for other values
fun makecoffee(sugarCount:Int){
    println("Cofee with $sugarCount spoons of sugar")
}