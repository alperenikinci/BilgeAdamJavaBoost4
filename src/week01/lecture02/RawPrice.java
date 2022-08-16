package week01.lecture02;

import java.util.Scanner;

public class RawPrice {

	public static void main(String[] args) 
	{
		float a;
		float b;
		float c;
		Scanner scan = new Scanner (System.in);
		System.out.print("Please enter final price: ");
		a = scan.nextFloat();
		
		System.out.print("Please enter VAT rate: ");
		b = scan.nextFloat();
		
		System.out.print("Please enter profit rate: ");
		c= scan.nextFloat();
		
		float FinalPrice = a;
		float NoVATPrice = (a*100)/(100+b);
		float rawPrice = (NoVATPrice*100)/(100+c);
		
		System.out.println("Final Price: "+ a +"\n"+ "NoVATprice: "+ NoVATPrice+ "\n"+"RawPrice: "+ rawPrice);
		
		

	}

}
