package com.pbo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class menghitungGaji {

    public static void main(String[] args) {
        //Atribut
        String nama = null;
        int golongan, jamKerja, jamLembur, gajiPokok, gajiLembur, tunjangan;
        double pajakGajiPokok = 0, pajakTunjangan = 0, pajakTotal, gajiBersih;

        Scanner userInput = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();


        //Input
        System.out.println("=== Program menghitung gaji karyawan ===");
        System.out.print("Masukan nama : ");
        nama = userInput.nextLine();
        System.out.print("Masukan jumlah jam kerja : ");
        jamKerja = userInput.nextInt();
        System.out.print("Masukan golongan (1 - 4) : ");
        golongan = userInput.nextInt();

        System.out.print("\n");
        System.out.println("=========================================");
        System.out.print("\n");

        switch (golongan) {
            case 1 :
                gajiPokok = 1486500;
                tunjangan = 250000;
                break;
            case 2 :
                gajiPokok = 1926000;
                tunjangan = 300000;
                break;
            case 3 :
                gajiPokok = 2456700;
                tunjangan = 350000;
                break;
            case 4 :
                gajiPokok = 2899500;
                tunjangan = 400000;
                break;
            default:
                gajiPokok = 0;
                tunjangan = 0;
        }

        if (jamKerja > 173){
            jamLembur = jamKerja - 173;
        } else {
            jamLembur = 0; //jika jam lembur lebih kecil atau sama dengan 173 maka jam lembur 0
        }


        //membuat format rupiah
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        gajiLembur = jamLembur * 20000; //menghitung gaji lembur
        pajakGajiPokok = gajiPokok * 0.5; //dikenakan pajak 0.5%
        pajakTunjangan = tunjangan * 0.5;
        pajakTotal = pajakGajiPokok + pajakTunjangan; //menghitung total pajak
        gajiBersih = ((gajiPokok + tunjangan + gajiLembur) - pajakTotal); //total gaji setelah dipotong pajak

        //output
        System.out.println("Nama                 : " + nama);
        System.out.println("Gaji Pokok           : " + kursIndonesia.format(gajiPokok));
        System.out.println("Tunjangan Pengabdian : " + kursIndonesia.format(tunjangan));
        System.out.println("Gaji Lembur          : " + kursIndonesia.format(gajiLembur));
        System.out.println("Pajak Gaji Pokok     : " + kursIndonesia.format(pajakGajiPokok));
        System.out.println("Pajak Tunjangan      : " + kursIndonesia.format(pajakTunjangan));
        System.out.println("Total Pajak          : " + kursIndonesia.format(pajakTotal));
        System.out.println("Gaji Bersih          : " + kursIndonesia.format(gajiBersih));
    }
}
