package com.bilgeadam.boost.week02.lecture003;

public class AccessTest {

	public static void main(String[] args) 
	{
		AccessModifiers testObject = new AccessModifiers();
		System.out.println("Variables that I can access: "
		+testObject.publicVariable+", "
		+testObject.defaultVariable+", "
		+testObject.protectedVariable+", "
			);	
	}

}
