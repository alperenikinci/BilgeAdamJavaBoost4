package com.bilgeadam.boost.week01.lecture003;

import java.util.Scanner;

public class RegularPolygon {

	public static void main(String[] args) {
		//Number of sides
		int n;
		//Side length
		
		double s;
		double area;
		
		final double PI = 3.14;
		
		Scanner scan = new Scanner (System.in);
	
		System.out.print("Please enter number of sides: ");
		n = scan.nextInt();
		System.out.print("Please enter length of a side: ");
		s = scan.nextDouble();
		
		area = (n*(Math.pow(s, 2)))/(4*(Math.tan(PI/n)));
		System.out.println(n+" sided polygons area is: "+area);
	}

}
