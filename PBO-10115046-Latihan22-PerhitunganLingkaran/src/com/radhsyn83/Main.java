package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int r = 0;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=========== PERHITUNGAN LINGKARAN ===========");

        do {
            try {
                System.out.print("Masukkan nilai diameter lingkaran : ");
                r = Integer.parseInt(obj.readLine());
                r = r / 2;
                break;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Nilai diameter tidak sesuai");
            }
        } while (r != 0);

        System.out.println("Jari-Jari lingkaran : " + r);
        System.out.println("Luas lingkaran : " + (3.14 * r * (r * r)));
        System.out.println("Keliling lingkaran : " + (3.14 *  2));


    }
}
