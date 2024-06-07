package com.example.my_app.kotlinexs

fun main(){
    println("Hello World");
    var myStudent: Student = Student("Aditya",20,"Lucknow");
    println(myStudent.name); // Getter

    // Setter
    myStudent.name = "Pandey";
    println(myStudent.name);
}