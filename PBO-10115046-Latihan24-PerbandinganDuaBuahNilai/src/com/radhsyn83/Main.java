package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nilai1 = 0;
        int nilai2 = 0;
        String lanjut = "ya";

        Scanner obj = new Scanner(System.in);


        do {
            System.out.println("=========== PROGRAM PERBANDINGAN NILAI ===========");
            System.out.print("Masukkan nilai pertama: ");
            nilai1 = obj.nextInt();
            System.out.print("Masukkan nilai kedua: ");
            nilai2 = obj.nextInt();

            if (nilai1 > nilai2)
                System.out.println(nilai1 + " Lebih besar dari " + nilai2);
            else
                System.out.println(nilai1 + " Lebih kecil dari " + nilai2);


            System.out.print("Ulangi aktifitas ? (ya/tidak) : ");
            lanjut = obj.next();

        } while (lanjut.equals("tidak"));
    }
}
