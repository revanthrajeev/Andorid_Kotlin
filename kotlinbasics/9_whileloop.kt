package com.example.kotlinbasics

fun new(){
    var count=0
    while(count<3){
        println("count is $count")//dollar print updated print value like count changes again and again
        count++
    }
    println("loop done")
}
//here after using multiple function need to call them in fun main inside like new()
//and main function will be executed final
fun main(){
    new()
    println("Enter the value")
    var userinput= readln()
    while(userinput!="1"){
        println("Enter the value again")
        userinput= readln()
    }
    println("loop is done")
}