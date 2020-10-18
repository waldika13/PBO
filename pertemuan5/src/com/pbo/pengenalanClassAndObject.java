package com.pbo;


// membuat class sebagai template
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}


public class pengenalanClassAndObject {
    public static void main(String[] args) throws Exception {

        // instansiasi / membuat object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "John";
        mahasiswa1.NIM = "13305041";
        mahasiswa1.jurusan = "teknik perteknakan";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 17;

        System.out.println("Nama : " + mahasiswa1.nama);
        System.out.println("NIM : " + mahasiswa1.NIM);
        System.out.println("Jurusan : " + mahasiswa1.jurusan);
        System.out.println("IPK : " + mahasiswa1.IPK);
        System.out.println("Umur : " + mahasiswa1.umur);

        System.out.println("=========================");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Anjay";
        mahasiswa2.NIM = "13305042";
        mahasiswa2.jurusan = "teknik perteknakan";
        mahasiswa2.IPK = 3.5;
        mahasiswa2.umur = 32;

        System.out.println("Nama : " + mahasiswa2.nama);
        System.out.println("NIM : " + mahasiswa2.NIM);
        System.out.println("Jurusan : " + mahasiswa2.jurusan);
        System.out.println("IPK : " + mahasiswa2.IPK);
        System.out.println("Umur : " + mahasiswa2.umur);
    }
}
