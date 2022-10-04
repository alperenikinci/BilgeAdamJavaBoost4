package com.bilgeadam.boost.week04.lecture003.exceptionhandling;

public class StringNullPoint {

	public static void main(String[] args) {

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("You cant use .length() on a String");
			
		}finally {
			System.out.println("Finally block");
		}
		System.out.println("Code continues");
		
	}

}
