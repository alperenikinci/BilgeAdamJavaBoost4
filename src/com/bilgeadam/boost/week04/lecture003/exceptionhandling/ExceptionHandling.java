package com.bilgeadam.boost.week04.lecture003.exceptionhandling;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		try {
			int myInt = Integer.parseInt("5a");
			System.out.println(myInt);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Stop trying conver a text to a number.");
			
		}finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Code continues");
		
	}
	
}
