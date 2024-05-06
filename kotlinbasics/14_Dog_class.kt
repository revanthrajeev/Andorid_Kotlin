package com.example.kotlinbasics
fun main(){
    //creating an object/instance of the class dog
    var daisy=Dog_class_14("Shishimaru ","Sward poodle",1)
    //in the above daisy code if you update the value of string the the below code
    //also gets updates
    println("${daisy.name} is a ${daisy.breed} and age is ${daisy.age}")
}
class Dog_class_14(val name:String,val breed:String,var age:Int=0) {//we can acess data using this ()inside element itself
    //above we need to define val also othewiser println of fun main gives error
    init{
        bark(name)
    }
    fun bark(name:String){
        println("$name says kabadi!, kabadi!")
    }
}