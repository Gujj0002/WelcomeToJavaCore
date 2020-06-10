package com.company;

public class MultiLevel {

    {

        Multi obj = new Multi();

        obj.num1 = 10;
        obj.num2 = 15;

        obj.sum();
        System.out.println("Sum is: " + obj.result);

        obj.sub();
        System.out.println("Sub is: " + obj.result);

        obj.Multi();
        System.out.println("Multi is: " + obj.result);
    }
}
class Add1 {
    int num1, num2,result;

    public void sum()
    {
        result = num1 + num2;
    }
}
class Sub extends Add
{
    public void sub()
    {
        result = num1 - num2;
    }
}
class Multi extends Sub
{

    public void Multi()
    {
        result = num1 * num2;
    }
}


