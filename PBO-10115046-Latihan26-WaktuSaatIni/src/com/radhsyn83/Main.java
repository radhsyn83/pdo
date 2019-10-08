package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SimpleDateFormat formatter= new SimpleDateFormat("EEEEE, dd MMMMM yyyy HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String dateNow = formatter.format(date);
        System.out.println("Hari ini adalah hari : "+dateNow);
    }
}
