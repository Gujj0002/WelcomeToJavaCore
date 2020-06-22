package com.company;

public class Main {

    public static void main(String[] args) {

        Student obj = new Student(12, "Alpesh");
        System.out.println(obj);

    }
}
class Student{

    int rollNumber;
    String studentName;

    public Student(int rollNumber, String studentName)
    {
         this.rollNumber = rollNumber;      // super keywords
         this.studentName = studentName;
    }
    public String toString()      // toString method
    {
        return "Students: " + " rollNumber = " + rollNumber + " studentName = " + studentName + "";
    }
}
