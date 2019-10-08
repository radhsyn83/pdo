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

        String gajipokok;
        double gp;
        double tunj;

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println("=========== PROGRAM TUNJANGAN ===========");
            System.out.print("Berapa gaji pokok anda perbulan?: Rp ");
            gajipokok = obj.readLine();
            System.out.print("Status anda?: (menikah/belum) : ");

            gp = Integer.parseInt(gajipokok);
            tunj = 0;


            if (obj.readLine().equals("menikah")) {
                tunj = 0.35*gp;
            }

            System.out.println("=========== HASIL PERHITUNGAN ===========");
            System.out.println("Gaji Pokok\t\t\t: Rp " + gp);
            System.out.println("Tunjangan\t\t\t: Rp " + gp);
            System.out.println("Total Gaji\t\t\t: Rp " + (gp+tunj));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
