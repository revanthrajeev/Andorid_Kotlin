package com.example.kotlinbasics
fun main(){
    print("Enter your age as a whole number: ")
    var age= readln().toInt()
    if(age>=18 && age<=100){
        print("You can enter the club")
    }else if(age<18){
        print("You cant enter the club")
    }else{
        print("age not verified. please contact support")
    }
}