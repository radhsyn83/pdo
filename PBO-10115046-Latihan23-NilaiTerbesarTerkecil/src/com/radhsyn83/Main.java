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
        int jumlahMahasiswa;
        int mahasiswa[] = new int[0];

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        try {

            System.out.println("=========== PROGRAM NILAI TERBERSAR DAN TERKECIL MAHASISWA ===========");
            System.out.print("Masukkan banyak mahasiswa : ");
            jumlahMahasiswa = Integer.parseInt(obj.readLine());

            mahasiswa = new int[jumlahMahasiswa];

            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.print("Nilai mahasiswa ke-"+(i+1)+" : ");
                mahasiswa[i] = Integer.parseInt(obj.readLine());
            }

            int max = mahasiswa[0];
            for(int i = 1; i < mahasiswa.length;i++)
            {
                if(mahasiswa[i] > max)
                {
                    max = mahasiswa[i];
                }
            }

            int min = mahasiswa[0];
            for(int i = 1; i < mahasiswa.length;i++)
            {
                if(mahasiswa[i] < min)
                {
                    min = mahasiswa[i];
                }
            }

            System.out.println("Nilai Terbesar adalah : "+max);
            System.out.println("Nilai Terkecil adalah adalah : "+min);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
