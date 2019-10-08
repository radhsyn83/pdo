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
        String kalimat;
        String ganti;
        String menjadi;


        Scanner sc = new Scanner(System.in);

        System.out.println("===== Program Ganti kata =====");
        System.out.print("Masukkan kalimat : ");
        kalimat = sc.nextLine();
        System.out.print("Ganti kata : ");
        ganti = sc.nextLine();
        System.out.print("Menjadi kata : ");
        menjadi = sc.nextLine();

        System.out.println("===== Hasil formating =====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat ganti : " + kalimat.replace(ganti, menjadi));

    }
}
