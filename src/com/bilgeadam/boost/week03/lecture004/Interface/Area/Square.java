package com.bilgeadam.boost.week03.lecture004.Interface.Area;

public class Square implements Shape
{
	int a;

	@Override
	public double calculateArea() 
	{
		return a^2;
	}

}
