package com.company;

public class Main{

    public static void main(String[] args) {



        Iphone obj = new Samsung();     
        obj.Ring();
        obj.Call();
        obj.Click();
        obj.Move();
    }
}
abstract class Iphone {                  // Abstract class

     public void Ring()
    {
        System.out.println("Ringing....");
    }
    public abstract void Call();
    public abstract void Move();
    public abstract void Click();
}                                              // Abstract method
abstract class Bell extends Iphone {

    public void Call()
    {
        System.out.println("Calling....");
    }
}
class Samsung extends Bell {                // Concrete class

    public void Click() {
        System.out.println("Clicking....");
    }

    public void Move() {
        System.out.println("Moving....");
    }
}
