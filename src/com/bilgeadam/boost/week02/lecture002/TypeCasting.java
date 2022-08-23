package com.bilgeadam.boost.week02.lecture002;

public class TypeCasting 
{
	public static void main(String[] args) 
	{
	//widening
	int myInt = 9;
	double myDouble = myInt; //Automatic casting : integer to double
	
//	System.out.println(myInt);
//	System.out.println(myDouble);
	
	//narrowing - DANGEROUS; Might cause data loss
	double myDouble2 = 9.70d;
	int myInt2 = (int) myDouble2; //Manual casting : double to integer
	
//	System.out.println(myDouble2);
//	System.out.println(myInt2);
//	
	
	/////////////////////////
	//Type conversion from integer to String
	int num = 10;
	System.out.println("The integer value is : " + num);
	
	String data = String.valueOf(num); //converts integer to String
	System.out.println("The string value is : " + data);
	
	//int result = data + 5;
	//code above will not work and warn you that data is a string.
	
	
	//Type conversion from String to int
	String data2 = "15";
	System.out.println("The string value is : " + data2);
	
	int num2 = Integer.parseInt(data2); // converts String to integer
	System.out.println("The integer value is : " +num2);
	}
	
}
