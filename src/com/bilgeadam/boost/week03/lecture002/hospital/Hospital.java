package com.bilgeadam.boost.week03.lecture002.hospital;

public class Hospital 
{
	public static void main(String[] args) 
	{
		
		Adult adult = new Adult("isim",true,15);
		Child child = new Child("Cagri",true,30);
		
//		child.checkIfHealty();
//		adult.checkIfHealty();
//		child.getVaccinated();
		System.out.println(child.toString());
	}
	
	
}
