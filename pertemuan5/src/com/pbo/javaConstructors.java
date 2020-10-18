package com.pbo;


public class javaConstructors {
    int x = 5;
    int modelYear;
    String modelName;

    public javaConstructors(int y) {
        int x = y;
    }

    public javaConstructors(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        javaConstructors myobj1 = new javaConstructors(5);
        System.out.println(myobj1.x);

        javaConstructors car = new javaConstructors(1969, "Ford");
        System.out.println(car.modelYear + " " + car.modelName);
    }
}
