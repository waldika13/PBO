package com.pbo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class Mahasiswaa{
    // Data member
    String nama;
    String NIM;


    Mahasiswaa(String inputnNama, String inputNIM){
        this.nama = inputnNama;
        this.NIM = inputNIM;
    }

    //method tanpa return dan tanpa parameter

    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }
    //method tanpa return dan dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    //method dengan return tapi tidak ada parameter

    String getNama(){
        return this.nama;
    }
    String getNIM(){
        return  this.NIM;
    }
    //method dengan return dan parameter

    String sayHi(String message) {
        return message + " " + "juga, nama saya adalah" + " " + this.nama;
    }
}

public class method{
    public static void main(String[] args) {
        Mahasiswaa mahasiswa1 = new Mahasiswaa("ucup", "13305041");
        //method
        mahasiswa1.show();
        mahasiswa1.setNama("Waldika");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("Ganteng");
        System.out.println(data);


    }
}
