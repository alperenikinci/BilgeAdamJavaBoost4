package com.bilgeadam.boost.week04.lecture003.exceptionhandling;

public class TestMaleCanNotEnter {

	public static void main(String[] args) {

		Person person = new Person();
		new Person("Alperen", 26, false);
		new Person("Ersan", 40, false);
		new Person("Madonna", 60, true);
		new Person("Maryl", 67, true);

		try {
			if(person.isWoman==false) {
				throw new MaleCanNotEnterException("Males can not enter!");
			}
			else {
				person.welcome();
			}
			
		} catch (MaleCanNotEnterException e) {
			
			System.out.println("Hata");
			
		}

	}

}
