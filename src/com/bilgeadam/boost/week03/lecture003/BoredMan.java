package com.bilgeadam.boost.week03.lecture003;

public class BoredMan {

	public static void main(String[] args) 
	{
		Boolean[] spints = new Boolean[10];
		int i =0;
		for(int tour = 1; tour<spints.length; tour++) 
		{
			for(i++;i<spints.length;) 
			{
				spints[i] = false;
				System.out.println(spints[i]);
			}
			for(int j = 1;j<spints.length;j=i+1) 
			{
				spints[i]=!spints[i];
			}
		}
	
	}

}
