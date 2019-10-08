package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        double saldo;
        double tabungan;

        tabungan = 2500000;

        for (int i = 0; i < 6; i++) {
            tabungan = tabungan+(tabungan*0.15);
            System.out.println("Saldo di bulan ke-"+(i+1)+" Rp "+(tabungan));

        }
    }
}
