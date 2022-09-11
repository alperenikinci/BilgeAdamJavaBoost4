package com.bilgeadam.boost.homeworkproject.no001;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Palindrome palindrome = new Palindrome();
		palindrome.check();

	}

	private void check() 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the word: ");
		String word = input.nextLine();
		word = word.toLowerCase();
		char[] ch = new char[word.length()];
		for (int i = 0; i<word.length();i++) 
		{
			ch[i] = word.charAt(i);
		}
		int j = 0;
		int k = word.length()-1;
		
		while(j<word.length()/2)
		{
			if (ch[j] == ch[k]) 
			{
				j++;
				k--;
				continue;
			}
			else 
			{
				System.out.println(word+ " is not a palindrome word ");
				break;
			}
			
		}
		if(j==word.length()/2)
		{
			System.out.println(word+ " is a palindrome word ");
		}
		input.close();
}

}
