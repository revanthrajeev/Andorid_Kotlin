package com.example.kotlinbasics

//fun main(){
//    var age=19
//    if(age==19){
//        println("you can go to club")
//    }
//    else{
//        println("you are too young to go into club")
//    }
//    //the below line of codes is for taking the input from user for a string or a number
//    //and assign a number to a string
//    println("please enter a your age for a number")
//    var enteredValue=readln()
//    age=enteredValue.toInt()
//    //using 2 line of reading line and assigning in a single variable instead of using 2 variable
//    age= readln().toInt()
//}
fun main(){
    println("Enter the age")
    var ages= readln().toInt()//take a number input and convert to int
    if(ages>18 && ages<100){
        println("your are between 18 and 100 you can go to club")
    }else if(ages==18){
        println("you cant go to club")
    }else
    {
        println("the age is below 18 cant go to club")
    }
}