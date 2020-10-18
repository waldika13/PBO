package com.pbo;

public class javaModifiers {

    abstract class person{
        public String fname = "John";
        public int age = 25;
        public abstract void study();
    }
    static class Student extends person {
        public int graduationYear = 2015;
        public void study(){
            System.out.println("Studying all day long");
        }
    }
    public static void main(String[] args) {
        Student myObj = new Student();

        System.out.println("Name : " + myObj.fname);
        System.out.println("Age : " + myObj.age);
        System.out.println("Graduation : " + myObj.graduationYear);
        myObj.study();
    }
}
