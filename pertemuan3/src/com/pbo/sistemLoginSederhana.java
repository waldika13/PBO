
package com.pbo;

import java.util.Scanner;

/**
 *
 * my github : https://github.com/waldika13
 * Login Admin Sederhana
 */

public class sistemLoginSederhana{
    static int count = 0;

    public static void main(String[] args){
        String username,password,input1,input2;

        awal:
        while (true) {
            username = "admin";
            password = "admin";
            Scanner inputtUser = new Scanner(System.in);

            System.out.println("=== HALAMAN LOGIN ADMIN ===");
            System.out.print("Username : ");
            input1 = inputtUser.next();
            System.out.print("Password : ");
            input2 = inputtUser.next();

            if ((input1.equals(username)) && (input2.equals(password))) {
                System.out.println("Hallo " + username);
                System.out.println("Selamat datang di Dashboard Admin");
                System.exit(1);
            }   else {
                System.out.println("Username atau Password anda salah!");
                System.out.print("\n");
                count++;
            }

            if (count == 3) {
                System.out.println("Kamu sudah gagal 3 kali, coba lagi nanti");
                break awal;
            }
        }

    }
}
