package com.example.kotlinbasics

fun main(){
    var computerchoice=""
    var playerchoice=""
    println("Rock,paper or Scissors? Enter your choice!")
    playerchoice= readln()
    val randomNumber=(1..3).random()//for using the <= symbol use .. like 1..3 will automatically give <= symbol
    var a="None"
    if(randomNumber==1){
        println("Rock")
        a="Rock"
    }else if(randomNumber==2){
        println("Paper")
        a="paper"
    }else {
        println("Scissor")
        a="Scissor"
    }
    var score=0
    if(playerchoice==a){
        println("tie")
    }
    else if(playerchoice=="Rock" && a=="paper"){
        println("you lost")
    }
    else if(playerchoice=="Rock" && a=="Scissor"){
        score+=1
        print("you won")
    }
    else if(playerchoice=="Paper" &&a=="Rock") {
        score += 1
    }
    println(score)

}