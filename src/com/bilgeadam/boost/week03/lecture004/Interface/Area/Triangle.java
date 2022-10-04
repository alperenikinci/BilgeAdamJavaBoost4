package com.bilgeadam.boost.week03.lecture004.Interface.Area;

public class Triangle implements Shape
{
	int base;
	int height;
	
	@Override
	public double calculateArea() 
	{
		//Triangle area calculation implementation
		return (base*height)/2;
	}
	
}
