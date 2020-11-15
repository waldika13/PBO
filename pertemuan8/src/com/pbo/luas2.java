package com.pbo;

abstract class HitungLuas2{
    protected double s1;
    protected double s2;
    public HitungLuas2(double s1){
        this.s1 = 0;
        this.s2 = 0;
    }

    public HitungLuas2(double s1, double s2) {
    }

    public void setSisi(double s1){
        this.s1 = s1;
    }
    public void setSisi(double s1, double s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    public abstract double getLuas();

    public double getS1() {
        return s1;
    }
    public double getS2() {
        return s2;
    }
}

class SegiTiga2 extends HitungLuas2{
    public SegiTiga2(double s1, double s2){
        super(s1,s2);
    }
    public double getLuas(){
        double luas = 0.5 * this.s1 * this.s2;
        return luas;
    }
}
class LingKaran2 extends HitungLuas2{
    public LingKaran2(double s1){
        super(s1);
    }
    public double getLuas(){
        double r = this.s1/2;
        double luas = 3.14 * r * r;
        return luas;
    }
}

public class luas2 {
    public static void main(String[] args){
        SegiTiga2 oSegi = new SegiTiga2(5,2);
        System.out.println("Luas Segitiga = 0.5 x " + oSegi.getS1() + " x " + oSegi.getS2() + " = " + oSegi.getLuas());

        LingKaran2 oLing = new LingKaran2(10);
        System.out.println("Luas Lingkaran = " + oLing.getLuas());
    }
}
