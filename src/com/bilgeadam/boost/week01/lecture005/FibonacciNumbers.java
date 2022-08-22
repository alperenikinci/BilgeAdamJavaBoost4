package com.bilgeadam.boost.week01.lecture005;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		int	n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		
		n = scan.nextInt();
		scan.close();
				System.out.print(n1 +" "+n2+" ");
		for (int i = 2; i < n; i++) 
			{
				n3 = n1+n2;
				System.out.print(" " +n3);
				n1 = n2;
				n2 = n3;
			}
			
			

	}

}
