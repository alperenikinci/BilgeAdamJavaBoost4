package com.bilgeadam.boost.week04.lecture003.exceptionhandling;

public class DivideByZero {

	public static void main(String[] args) {
		try {
			int divideByZero = 5 / 0;
			System.out.println(divideByZero);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Denominator can not be '0'");

		} finally {
			System.out.println("finally block");
		}

		System.out.println("Code continues");

	}

}
