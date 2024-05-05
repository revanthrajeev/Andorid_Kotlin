package com.example.kotlinbasics
//main function
fun main(){
    println("For whom to make cofee ?")
    val name= readln()
    println("how many pieces of sugar do you want ?")
    val sugar= readln().toInt()
    make_cofee(sugar,name)
}
//Define function and $ symbol works same for iteration for other values
//note in android development dont use same variable multiple files otherwise gives error
//first make function then use .. i mean not main other function where paramters used
fun make_cofee(sugarCount:Int,name:String) {
    if(sugarCount<=0){
        println("cofee with no spoons of sugar for $name")
    }
    else{
        println("cofee with $sugarCount of sugar for $name")

    }
}