package com.bilgeadam.boost.week04.lecture004.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamExample {

	public static void main(String[] args) {
		
//		byte[] array = new byte[100];
		try {
			InputStream input = new FileInputStream("output.txt");
			System.out.println("Available bytes in the file : "+input.available());
			byte[] array = new byte[input.available()];
			
			input.skip(5); //Ilk 5 karakteri cikariyor.
			
			input.read(array);
			String data = new String(array);
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
