package com.pbo;

import javax.xml.bind.SchemaOutputResolver;

interface tugasMahasiswa {
    void kuliah();
    void belajarMandiri();
    void mengembangkanDiri();
}

class mahasiswa implements tugasMahasiswa {
    public mahasiswa() {
        System.out.println("Tugas mahasiswa adalah : ");
    }

    @Override
    public void kuliah() {
        System.out.println("1. kuliah tepat waktu");
    }

    @Override
    public void belajarMandiri() {
        System.out.println("2. belajar mandiri, rajin membaca");
    }

    @Override
    public void mengembangkanDiri() {
        System.out.println("3. mengembangkan diri melalui pelatihan dan komunitas");
    }
}

public class javaInterface {

    public static void main(String[] args) {
        mahasiswa waldika = new mahasiswa();

        waldika.kuliah();
        waldika.belajarMandiri();
        waldika.mengembangkanDiri();
    }
}
