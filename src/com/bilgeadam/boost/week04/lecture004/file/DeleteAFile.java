package com.bilgeadam.boost.week04.lecture004.file;

import java.io.File;

public class DeleteAFile {

	public static void main(String[] args) {
		File file = new File("newFile.txt");
		boolean value = file.delete();
		if (value) {
			System.out.println("File is deleted");
		} else {
			System.out.println("File is not deleted");
		}
	}

}
