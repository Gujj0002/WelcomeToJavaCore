package com.company;

public class Main {

    public static void main(String[] args) {

        String str = " Hello, everyone, welcome, to, java ";

      //  String val[] = str.split(" ");   // Splitting by Space

        String val[] = str.split(",");    // Splitting by coma


        for (String Words: val)      // Enhanced for loop
        {
            System.out.println(Words);
        }
    }
}
