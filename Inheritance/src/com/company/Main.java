package com.company;

public class Main {

    //  How to do Single Level Inheritance //

    public static void main(String[] args) {

        AddSub obj = new AddSub();

        obj.num1 = 10;
        obj.num2 = 15;

        obj.sum();
        System.out.println("Sum is: " + obj.result);

        obj.sub();
        System.out.println("Sub is: " + obj.result);
    }
}
    class Add
    {
      int num1, num2,result;

      public void sum()

      {
        result = num1 + num2;
      }
    }
    class AddSub extends Add
    {
      public void sub()

      {
        result = num1 - num2;
      }
    }
