package com.example.kotlinbasics

import java.time.temporal.TemporalAmount

data class Data_Class_16(val sugarCount:Int
,val name: String,
val size:String
,val creamAmount:Int){
}
fun main(){
    val cofeeForDenis=CofeeDetails(sugarCount..0,name.."Denis",size.."xxl",creatmAmount:0)
}
fun askCofeeDetails(){
    println("Who is this cofee for ?")
    val name=readln()
    println("How many pieces of sugar do you want?")
    val sugarCount= readln()
    val sugarCount=sugarCount.toInt()

}