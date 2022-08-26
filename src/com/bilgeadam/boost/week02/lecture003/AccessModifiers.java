package com.bilgeadam.boost.week02.lecture003;

public class AccessModifiers 
{
	public String publicVariable = "Public variable";
	protected String protectedVariable ="Protected variable";
	String defaultVariable = "Default variable";
	private String privateVariable = "Private variable";

	public static void main(String[] args) 
	{
		AccessModifiers testObject = new AccessModifiers();
		System.out.println("Variables that I can access :"
		+testObject.publicVariable+", "
		+testObject.privateVariable+", "
		+testObject.defaultVariable+", "
		+testObject.protectedVariable);
		
	}
		
		
		
		
	
}

