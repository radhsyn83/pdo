package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */


public class Main {

    int jumlahKambing = 10;

    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }

    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing stlah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) {
        Main main = new Main();

        //Menampilakan jumlah kambing yang ada saatprogram berjalan
        main.getJumlahKambing();

        //Menambah kambing
        main.tambahKambing();

        //Menampilakan jumlah kambing yang ada
        main.getJumlahKambing();

    }
}
