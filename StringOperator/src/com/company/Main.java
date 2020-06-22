package com.company;

import java.util.Scanner;



public class Main {

     // String operator ...

    public static void main(String[] args) {

        String s1, s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s string :");

        s1 = sc.nextLine();     // Getting string value
        s2 = sc.nextLine();

        System.out.println("Length of first string is :" + s1.length());   // Getting length
        System.out.println("Length of second string is :" + s2.length());

       String l1 = s1.concat(s2);

        System.out.println("Concatenation of strings is :" + l1);  // Concatenation method

        s1 = s1.toUpperCase();   // Convert in uppercase
        s2 = s2.toLowerCase();   // Convert in Lowercase

        System.out.println("string in uppercase :" + s1);
        System.out.println("String in Lowercase :" + s2);


    }
}
