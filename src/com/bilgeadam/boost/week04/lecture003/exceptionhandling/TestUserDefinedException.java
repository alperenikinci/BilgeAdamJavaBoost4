package com.bilgeadam.boost.week04.lecture003.exceptionhandling;

public class TestUserDefinedException {

	public static void main(String[] args) throws UserDefinedException {
			
		try {
			
			throw new UserDefinedException("This is a user defined exception");
			
		} finally {
			
			System.out.println("Finally block");
		}
	}

}
