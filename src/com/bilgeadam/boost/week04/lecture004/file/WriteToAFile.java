package com.bilgeadam.boost.week04.lecture004.file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {

	public static void main(String[] args) throws IOException {
		
		String data = "Bu metin output.txt dosyasina yazilacak.";
				FileWriter output = null;
				try {
					output = new FileWriter("Output.txt");
					output.write(data);
					System.out.println("Data written to file");
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					output.close();
				}

	}

}
