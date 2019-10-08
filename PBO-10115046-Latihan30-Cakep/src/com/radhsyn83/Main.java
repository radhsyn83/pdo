package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.util.Scanner;

public class Main {

    static String[] warnaText = {"\033[0;31m", "\033[0;32m", "\033[0;33m", "\033[0;34m", "\033[0;35m", "\033[0;36m"};
    static String reset = "\033[0m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	// write your code here

        System.out.println(warnaText[0] + "Kamu" +
                warnaText[2] + " ngerjain" +
                warnaText[2] + " sendiri" +
                warnaText[3] + " tugas" +
                warnaText[3] + " 17" +
                warnaText[3] + " sampe" +
                warnaText[4] + " latihan" +
                warnaText[4] + " 30" +
                warnaText[4] + " ini?");

        System.out.print(warnaText[3] + "Jawab" +
                warnaText[0] + " (yoi/enggak) : " + reset);

        if (sc.nextLine().toLowerCase().equals("yoi")) {
            System.out.println(warnaText[0] + "Cakep Bener." +
                    warnaText[5] + " Good Job." );
        } else {
            System.out.println(warnaText[0] + "Tetep cakep sih" );
            System.out.println(warnaText[5] + "Sing penting paham konsepnya yee." );
            System.out.println(reset + "Keep the code work dude.");
        }

    }
}
