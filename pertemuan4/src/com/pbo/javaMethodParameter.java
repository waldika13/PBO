package com.pbo;

public class javaMethodParameter {

    static void Mykelas(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void Mykelas2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    static int myMethod1(int x) {
        return 5 + x;
    }

    static int myMethod2(int x, int y) {
        return x + y;
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - you are not old enough!");
        } else {
            System.out.println("Access granted - you are old enough");
        }
    }


    public static void main (String[] args) {
        Mykelas("Liam");
        Mykelas("Jenny");
        Mykelas("Anjay");

        System.out.println("===================");

        Mykelas2("Liam", 5);
        Mykelas2("Jenny", 15);
        Mykelas2("Anjay", 44);

        System.out.println("===================");

        System.out.println(myMethod1(3));

        System.out.println("===================");

        System.out.println(myMethod2(5,3));

        System.out.println("===================");

        checkAge(20);

        System.out.println("===================");



    }



}
