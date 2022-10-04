package com.bilgeadam.boost.week01.lecture004;

import java.util.Scanner;

public class PrimeNumberStock {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner (System.in);
        System.out.println("lütfen bir sayı giriniz : ");
        long sayi = scanner.nextLong();
        scanner.close();
        boolean Asalmi= true;
        long startTime = System.nanoTime();
        for (long i=2; i<sayi; i++) 
                {
            if((sayi%i)==0) Asalmi=false;

                }
        if(Asalmi==true) System.out.println("girilen sayı asaldır");
        else System.out.println("girilen sayı asal değildir.");
        
        long endTime = System.nanoTime();
    	long timeElapsed = endTime - startTime;
    	
    	System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);



	}
}


