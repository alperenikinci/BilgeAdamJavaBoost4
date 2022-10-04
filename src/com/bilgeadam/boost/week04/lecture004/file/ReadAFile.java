package com.bilgeadam.boost.week04.lecture004.file;

import java.io.FileReader;
import java.util.Arrays;

public class ReadAFile {
	public static void main(String[] args) {

		char[] array = new char[100];
		
		try {
			FileReader input = new FileReader("newFile.txt");
			input.read(array);
			System.out.println("Data in the file : ");
			System.out.println(array);
			
			input.close();
			
		} catch (Exception e) {
			e.getStackTrace();
		}

	}
}
