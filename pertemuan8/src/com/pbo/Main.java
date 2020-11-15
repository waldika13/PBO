package com.pbo;
//Abstract


abstract  class hewan {
    //Abstract Method ( tidak memiliki body)

    public abstract void suarahewan();

    //Regular method
    public void tidur() {
        System.out.println("Zzz....");
    }
}

//Turunan dari kelas hewan
class Ayam extends hewan {
    public void suarahewan() {
        System.out.println("Kukuruyuk....");
    }
}

class kucing extends hewan {
    public void suarahewan() {
        System.out.println("Meow..Meow");
    }
}

public class Main {

    public static void main(String[] args) {
	Ayam ayamku = new Ayam();
	kucing kucingku = new kucing();
	ayamku.suarahewan();
	ayamku.tidur();
	kucingku.suarahewan();
	kucingku.tidur();
    }
}
