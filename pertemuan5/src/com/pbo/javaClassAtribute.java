package com.pbo;

public class javaClassAtribute {
    int x = 5;
    int y = 10;
    String fname = "John";
    String lname = "Dea";
    int age = 25;

    public static void main(String[] args) {
        javaClassAtribute myObj1 = new javaClassAtribute();
        javaClassAtribute myObj2 = new javaClassAtribute();
        myObj2.x = 40; //

        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

        System.out.println("===================");

        javaClassAtribute myObj3 = new javaClassAtribute();
        System.out.println("Name : " + myObj1.fname + " " + myObj1.lname);
        System.out.println("Age : " + myObj1.age);

    }
}
