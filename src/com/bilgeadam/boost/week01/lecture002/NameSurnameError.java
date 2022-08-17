package com.bilgeadam.boost.week01.lecture002;

import javax.swing.JOptionPane;

public class NameSurnameError {

	public static void main(String[] args) 
	{
		String name = "Alperen";
		String surname = "Ikinci";
		System.out.println(name+" "+surname);
		System.out.println();
		System.out.println(name);
		System.out.println(surname);
		
		JOptionPane.showMessageDialog(null,"Oops! Something went wrong.","System Error",JOptionPane.ERROR_MESSAGE);	
	}
}
