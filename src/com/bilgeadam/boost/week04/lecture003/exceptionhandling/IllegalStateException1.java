package com.bilgeadam.boost.week04.lecture003.exceptionhandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IllegalStateException1 {

	public static void main(String[] args) {

		processArray();

	}

	public static void processArray() {

		List<String> names = new ArrayList<>();
		names.add("Cagri");
		names.add("Babur");

		Iterator iter = names.iterator();
		{
			try {
				while (iter.hasNext()) {
					iter.next();
					iter.remove();
				}
				// catch (IllegalStateException | NullPointerException e)
				// da olur. Birden fazla hata veya diye yakalanabilir.

			} catch (IllegalStateException e) {
				e.printStackTrace();
			}

			System.out.println(names);
		}

	}
}
