package com.company;

public class Main {

    public static void main(String[] args) {

        int i = 10;
        try{
            if(i < 15){

                throw new MyException("This is an error!!");     // Throw Exception with class and method
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class MyException extends Exception {

    public MyException( String msg)
    {
        super(msg);
    }
}
