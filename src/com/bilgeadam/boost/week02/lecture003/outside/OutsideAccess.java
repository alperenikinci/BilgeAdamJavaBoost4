package com.bilgeadam.boost.week02.lecture003.outside;

import com.bilgeadam.boost.week02.lecture003.AccessModifiers;

public class OutsideAccess {

	public static void main(String[] args) 
	{
		AccessModifiers testObject = new AccessModifiers();
		System.out.println("Variables that i can access : " + testObject.publicVariable);
		

	}

}
