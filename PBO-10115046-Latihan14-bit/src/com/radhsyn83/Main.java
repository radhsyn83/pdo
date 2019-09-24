package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

public class Main {

    public static void main(String[] args) {
        int a = 60; /* = 0011 1100 */
        int b = 13; /* = 0000 1101 */
        int c = 0;
        c = a & b;
        /* 12 = 0000 1100*/
        System.out.println("a & b = " + c);
        c = a | b;
        /* 61 = 0011 1101*/
        System.out.println("a | b = " + c);
        c = a ^ b;
        /* 49 = 0011 0001*/
        System.out.println("a ^ b = " + c);
        c = ~a;
        /* -61 = 1100 0011*/
        System.out.println("~a = " + c);
        c = a | b;
    }
}
