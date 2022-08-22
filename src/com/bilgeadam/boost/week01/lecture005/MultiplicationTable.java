package com.bilgeadam.boost.week01.lecture005;

import java.util.Scanner;

public class MultiplicationTable 
{

	public static void main(String[] args) 
	{
		int n;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter how many numbers you want: ");
		n = scan.nextInt();
		scan.close();
	
		for (int i = 1; i <= n; i++) 
		{	System.out.println("  ");
			for (int j = 1; j <= n ; j++) 
			{
				int m = i*j;
				System.out.print(i+"*"+j+" = "+ m +" 	 ");
			}		
		}
		
	}

}
