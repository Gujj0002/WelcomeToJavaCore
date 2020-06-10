package com.company;

public class Main {

    public static void main(String[] args) {

        Objects Obj = new Objects();     // Constructor

    }
}
class Objects {

    public Objects(){

        System.out.println("This is constructor in Objects");
    }
    public Objects(int a){
                                                              // Overloading constructor
        System.out.println("This is int in constructor");   // pass int value in method
    }
    public Objects(double b){

        System.out.println("This is double in constructor");  // pass the double value in method
    }
}
