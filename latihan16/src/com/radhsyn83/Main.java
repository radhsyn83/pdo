package com.radhsyn83;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;

        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c + "\n");


        c = a + b;
        System.out.println("c = a + b " + c );
        c += a;
        System.out.println("c += a " + c );
        c -= a;
        System.out.println("c -= a " + c );
        c *= a;
        System.out.println("c -= a " + c );
        c /= a;
        System.out.println("c /= a " + c );
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a " + c );


    }
}
