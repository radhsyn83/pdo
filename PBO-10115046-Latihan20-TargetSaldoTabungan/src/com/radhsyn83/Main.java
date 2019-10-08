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

        double saldoAwal;
        double bunga;
        double target;

	// write your code here
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.print("Saldo Awal: Rp ");
            saldoAwal = Integer.parseInt(obj.readLine());
            System.out.print("Bunga/Bulan (%): ");
            bunga = Integer.parseInt(obj.readLine());
            bunga = bunga / 100;
            System.out.print("Target Saldo: ");
            target = Integer.parseInt(obj.readLine());

            int i = 1;
            while (saldoAwal <= target) {
                saldoAwal = saldoAwal+(saldoAwal*bunga);
                System.out.println("Saldo di bulan ke-"+i+" Rp " + saldoAwal);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
