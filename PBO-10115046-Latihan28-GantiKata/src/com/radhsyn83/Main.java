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
	// write your code here
        String kata, ganti, menjadi;

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program ganti kata ===");
        System.out.print("Masukkan kata : ");
        kata = sc.nextLine();
        System.out.print("Ganti kata : ");
        ganti = sc.nextLine();
        System.out.print("Menjadi kata : ");
        menjadi = sc.nextLine();

        System.out.println();
        System.out.println("=== Hasil Formating ===");
        System.out.println("Kata Awal : " + kata);
        System.out.println("Kata Baru : " + kata.replace(ganti, menjadi));



    }
}
