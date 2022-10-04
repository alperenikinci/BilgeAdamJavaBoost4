package com.bilgeadam.boost.week04.lecture004.iostream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws IOException {

		try {
			FileInputStream file = new FileInputStream("Output.txt");
			BufferedInputStream input = new BufferedInputStream(file);
			int i = input.read();
			
			while(i !=-1) {
				System.out.print((char) i);
				i = input.read();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
