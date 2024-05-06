package com.example.kotlinbasics

fun main(){
    println("enter the number 1")
    val num1= readln().toInt()
    println("enter the number 2")
    val num2=readln().toInt()
    var myResult=add(num1,num2)
    println("the result of "+num1+"+"+num2+"="+myResult)
    var divresult=div(num1,num2)
    println("the result of "+num1+"/"+num2+"="+divresult)
}
fun add(num1:Int,num2:Int):Double{//her the Int used before { is for return datatype
    val result=num1+num2.toDouble()//making this double make return type float
    return result
}
fun div(num1:Int,num2:Int):Double{
    val divresult=num1/num2.toDouble()//making this double makes the return type floating
    return divresult
}