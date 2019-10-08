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
        int jumlahMahasiswa;
        double total = 0;
	// write your code here

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        try {


            System.out.print("Masukkan banyak mahasiswa : ");
            jumlahMahasiswa = Integer.parseInt(obj.readLine());

            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.print("Nilai mahasiswa ke-"+(i+1)+" : ");
                int t = Integer.parseInt(obj.readLine());
                total = t+total;
            }

            System.out.println("Maka, Rata-rata nilai adalah : "+total/jumlahMahasiswa);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
