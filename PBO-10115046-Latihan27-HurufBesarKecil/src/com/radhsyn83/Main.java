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
        Scanner sc = new Scanner(System.in);

        String input;
        System.out.print("Masukkan kalimat : ");
        input = sc.nextLine();

        System.out.println("===== Hasil kalimat =====");
        System.out.println("Huruf Besar : " + input.toUpperCase());
        System.out.println("Huruf Kecil : " + input.toLowerCase());

    }
}
