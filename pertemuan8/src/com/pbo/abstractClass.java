package com.pbo;

abstract class shape {
    private String color;

    public abstract double getArea();

    public String toString(){
        return "Ini adalah Abstract";
    }
}

class Rectangle extends shape{
    private int lenght, widht;

    public Rectangle(int lenght, int widht) {
        this.lenght = lenght;
        this.widht = widht;
    }

    @Override
    public double getArea() {
        return lenght*widht;
    }
    public String toString(){
        return "Rectangle";
    }
}

class Triangle extends shape {
    private int base, height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    public String toString() {
        return "Triangle";
    }
}
public class abstractClass {
    public static void main(String[] args) {
        Triangle a = new Triangle(10,20);
        System.out.println(a.getArea());

    }
}
