package com.bilgeadam.boost.week02.lecture002;

import java.util.Scanner;

public class Atm 
{
	static boolean endProgram = true;
	static boolean endMenu = true;
	static final String username = "user"; // Static yazdık ki main metot içerisinde ulaşabilelim.
	static final String password = "123"; // final yazdık ki hiçbir zaman değiştirilemez olsun.
	static int count = 3;
	static double balance = 1500;
	static double amount;
	static Scanner scan = new Scanner(System.in);

	public static void depositCash() 
	{
		System.out.print("Please enter the amount of cash you want to deposit: ");
		amount = scan.nextDouble();
		//balance = balance + amount;
		balance += amount;
		System.out.println(amount + " is deposited to your balance. Your final balance is: " +balance);
	}
	public static void withdrawCash() 
	{
		System.out.println("Please enter the amount of cash you want to withdraw: ");
		amount = scan.nextDouble();
		if (amount>balance) 
		{
				System.out.println("You do not have enough money.");
		}
		else
		{
			//balance = balance-amount;
			balance -=amount;
		System.out.println(amount + " is withdrawed from your balance. Your final balance is: " +balance);	
		}
	}
	public static void showBalance() 
	{
		System.out.println("Your balance is : " +balance);
	}
	

	public static void main(String[] args) 
	{
		while(endProgram)
		{
		System.out.print("Please enter your username: ");
		String usernameEntry = scan.nextLine();
		System.out.print("Please enter your password: ");
		String passwordEntry = scan.nextLine();
		
		if(!usernameEntry.equals(username) || !passwordEntry.equals(password))
			//yanlış girerse
		{
			System.out.println("Wrong username or password! ");
			count--;
			
			if(count==0) 
			{
				System.out.println("Your card has been blocked. Please contact your bank for further information.");
				//endProgram=false;
				break;
			}
			else
			{
				System.out.println("Remaining attempt : "+ count);
			}
		}
		else
			//doğru girerse
			{
			count = 3;
			while(endMenu) {
			System.out.println("Welcome! " + username);
			System.out.print("1- Deposit cash\n2- Withdraw cash\n3- Balance information\n4- Exit ");
			int selection = scan.nextInt();
			
			switch (selection) 
				{
			case 1:
				depositCash();
				break;
			case 2:
				withdrawCash();
				break;
			case 3:
				showBalance();
				break;
				
			case 4:
				endMenu = false;
				endProgram = false;
				break;
				

			default:
				System.out.println("Invalid input! ");
				break;
				}
			}
			}
		}
	}
}
