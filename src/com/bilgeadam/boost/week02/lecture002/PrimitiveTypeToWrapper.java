package com.bilgeadam.boost.week02.lecture002;

public class PrimitiveTypeToWrapper {

	public static void main(String[] args) 
	{
		int a = 5;
		double b = 5.65;
		
		Integer aObj = Integer.valueOf(a); //converts into wrapper class
		Double bObj = Double.valueOf(b);
		
		//(If a comes from an Integer)
		if(aObj instanceof Integer) 
		{
			System.out.println("Interger object is created : " + aObj);
		}
		else 
		{
		System.out.println(aObj+ " is not an Integer");	
		}
		
		//(If b comes from an Double)
		if(bObj instanceof Double) 
		{
			System.out.println("Double object is created : " + aObj);
		}
		else 
		{
		System.out.println(aObj+ " is not an Double");	
		}
		
		//Auto boxing
		int a1 = 5;
		//converts into wrapper class
		Integer a1Obj = a1;
		double b1 = 6.5;
		Double b1Obj = b1;

		
	}

}
