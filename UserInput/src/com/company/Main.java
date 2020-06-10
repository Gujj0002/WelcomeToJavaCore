package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  throws IOException
    {
           String Name = " ";


      /*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // BufferedReader method
        Name = br.readLine();       // get input from user*/

        Scanner sc = new Scanner(System.in);
        Name = sc.nextLine();       // get input from user using Scanner method 

        System.out.println("Your name is : " + Name);
    }
}
