package com.pbo;

public class javaMethod {

    public static class MyClass {
        static void myMethod() {
            System.out.println("I just got executed!");
        }



        public static void main (String[] args) {
            myMethod();
            myMethod();
            myMethod();

        }
    }

}
