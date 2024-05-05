package com.example.kotlinbasics

fun main(){
    val constantNumber=10
    var mutableString="Hello world"
    println(constantNumber)//here int is data type
    println(mutableString)
    mutableString="changed string"
    println(mutableString)
    //if i use byte in the code then data type is byte data type
    var constantNumbers:Byte=10
    println(constantNumbers)
    var constant_long:Long=10002090100
    println(constant_long) //this prints long because long number
    //also their are keywords like short
    var float_var=3.14f
    println(float_var)//float value
    var unsigned_short_age:UShort=35u
    println(unsigned_short_age)// unsigned 8 bit data type
}