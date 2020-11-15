package com.pbo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

//Absctrat
abstract class luasHitung {
    protected double s1;
    protected double s2;
    public luasHitung() {
        this.s1 = 0;
        this.s2 = 0;
    }
    public void setSisi(double s1) {
        this.s1 =s1;
    }
    public void setSisi(double s1, double s2) {
        this.s1 =s1;
        this.s2 =s2;
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }
    public abstract double getLuas();

}

class segitiga extends luasHitung{
    public double getLuas() {
        double luas = 0.5 * this.s1 * this.s2;
        return luas;
    }
}

class lingkaran extends luasHitung{
    public double getLuas() {
        double r = this.s1/2;
        double luas = 3.14 * r * r;
        return luas;
    }
}


public class latihan {
    public static void main(String[] args) {
        segitiga oSegitiga = new segitiga();
        oSegitiga.setSisi(5,2);
        System.out.println("=== Menghitung luas Segitiga ===");
        System.out.println("Luas segitiga = 0.5 x " + oSegitiga.getS1() + " x " + oSegitiga.getS2() + " = " + oSegitiga.getLuas());


        System.out.print("\n");
        lingkaran oLing = new lingkaran();
        oLing.setSisi(20);
        System.out.println("=== Menghitung luas Lingkaran ===");
        System.out.println("Luas Lingkaran = 3.14 x " + oLing.getS1()/2 + " x " + oLing.getS1()/2 + " = " + oLing.getLuas());
    }
}
