package com.bilgeadam.boost.week02.lecture002;

public class WrapperObjectsToPrimitiveTypes {

	public static void main(String[] args) 
	{
	Integer aObj = Integer.valueOf(23);
	int a = aObj.intValue(); //converts into primitive types

	System.out.println("The value of a : "+a);
	
	//Unboxing
	Integer a1Obj = Integer.valueOf(23);
	int a1 = a1Obj;
	
	System.out.println("The value of a1: " +a1);
	}

}
