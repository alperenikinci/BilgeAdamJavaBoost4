package com.bilgeadam.boost.homeworkproject.no001;



import java.util.Scanner;

public class Backtracking {

	public static void main(String[] args) 
	{
		Backtracking backtrack = new Backtracking();
		backtrack.execute();
	}

	private void execute() 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the word you wish to reverse : ");
		String word = input.nextLine();
		char[] normal = new char[word.length()];
		char[] reverse = new char[word.length()];
		
		for(int k = 0; k<word.length();k++)
		{
			normal[k] =word.charAt(k);
			
		}
		int i = 0;
		int j = word.length()-1;
		
		while(i<word.length()) 
		{
			reverse[i] = normal[j];
			i++;
			j--;
		}
		input.close();
		System.out.println("\nReverse of the word >>"+word+"<< is : ");
		System.out.print(reverse);
	}

}
