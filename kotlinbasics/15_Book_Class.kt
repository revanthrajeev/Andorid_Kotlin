package com.example.kotlinbasics
fun main(){
    var mybook=Book_Class_15("Rangoli","Revanth Rajeev", yearPublished = 2020)
    println("${mybook.title} is written by ${mybook.author} published on ${mybook.yearPublished}")
}
//for the purpose of the security that no one changes their are val and var
class Book_Class_15 (var title:String,var author:String,var yearPublished:Int){

    init{
        book_class_15()
    }
    fun book_class_15(){
    }
}