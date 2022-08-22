package com.bilgeadam.boost.week01.lecture005;

import java.util.Scanner;

public class HcfLcm 
{

	public static void main(String[] args) 
	{	int a,b,i,hcf,lcf;
		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter 2 numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();
		
		if (a>b) 	
			i=b;
		else
			i=a;
		
		for (; i <= a || i <= b; i--) 
		if (a%i==0 && b%i==0) 
		{
			hcf = i;
			System.out.println("Highest common factor: "+hcf);
			lcf = a*b/hcf;
			System.out.println("Lowest common multiple: "+lcf);
			break;
		}				
	}						
}
		