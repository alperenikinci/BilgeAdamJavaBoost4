package com.bilgeadam.boost.week04.lecture004.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutPutStreamExample {

	public static void main(String[] args) throws IOException {

		String data = "Bu metni dosyaya yazmak istiyorum";
		try {
			OutputStream output = new FileOutputStream("output.txt");
			byte[] dataBytes = data.getBytes();
			output.write(dataBytes);
			System.out.println("Data is written to the file. ");
			
			output.flush();
			output.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
