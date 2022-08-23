package com.bilgeadam.boost.week01.lecture005;

import java.util.Scanner;

public class RegisterLogin {

	public static void main(String[] args) 
	{	
		String userName = "";
		String password = "";
		do {
			System.out.print("1- Register\n2- Login");
			Scanner scan = new Scanner(System.in);
			int key = scan.nextInt();
			scan.close();
			
			switch (key)
			{
			case 1:
				Scanner input = new Scanner(System.in);
				System.out.println("Welcome to register page!! Please enter a username : ");
				userName = input.nextLine();
				System.out.println("Please enter a password : ");
				password = input.nextLine();
				System.out.println("You are registered. ");
				break;
			case 2:
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter your username : ");
				String userNameEntry = scanner.nextLine();
				System.out.print("Enter your password : ");
				String passwordEntry = scanner.nextLine();
				
				if (userNameEntry.equals(userName) && passwordEntry.equals(password)) 
				{
					System.out.println("Welcome");
				}
				else 
				{
					System.out.println("Wrong username or password! ");
				}
				break;
			default:
				break;
			}	
		}while (true);
	}
}