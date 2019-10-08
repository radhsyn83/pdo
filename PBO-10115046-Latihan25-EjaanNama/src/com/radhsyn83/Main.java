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

        System.out.print("Masukkan nama untuk di eja : ");
        String nama[] = sc.nextLine().split("");

        for (int i = 0; i < nama.length; i++) {
            System.out.println("Huruf ke-"+(i+1)+" : " + nama[i]);
        }

    }
}
