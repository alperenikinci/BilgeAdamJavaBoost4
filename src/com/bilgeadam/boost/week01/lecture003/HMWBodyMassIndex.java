package com.bilgeadam.boost.week01.lecture003;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class HMWBodyMassIndex 

{
	public static void main(String[] args) 
	
	{	
		double height, weight, bmi;
		String gender;
	
		Scanner scan = new Scanner(System.in);
		
			System.out.print("Please enter your height in centimeters: ");
			height = scan.nextDouble();
			
			System.out.print("Please enter your weight in kilograms: ");
			weight = scan.nextDouble();
			
			System.out.print("Please enter your gender in form of: \"Male\" or \"M\" \"Female\" or \"F\": ");
			gender = scan.next();
			
			bmi = weight * 10000 / (Math.pow(height, 2));
		
		scan.close();
				
		if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("M") && bmi < 20)
		{	
			System.out.println("\nYour BMI is: "+ bmi+"\nYou are considered: Underweight");
		}
				
		else if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("M") && bmi < 26)
		{
			System.out.println("\nYour BMI is: "+ bmi+"\nYou are considered: Normal weight");
		}
			
		else if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("M") && bmi < 30)
		{
			System.out.println("\nYour BMI is: "+ bmi+"\nYou are considered: Overweight");
		}
			
		else if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("M")) 
		{
			System.out.println("\nYour BMI is: "+ bmi+"\nYou are considered: Obese");
		}
	
		else if (gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("F") && bmi < 19 )
		{
			System.out.println("\nYour BMI is: "+ bmi+"\nYou are considered: Underweight");
		}
			
		else if (gender.equalsIgnoreCase("Female")|| gender.equalsIgnoreCase("F") && bmi < 25)
		{
			System.out.println("\nYour BMI is: "+ bmi+"\nYou are considered: Normal weight");
		}
			
		else if (gender.equalsIgnoreCase("Female")|| gender.equalsIgnoreCase("F") && bmi < 30)
		{
			System.out.println("\nYour BMI is: "+ bmi+"\nYou are considered: Overweight");
		}
			
		else if (gender.equalsIgnoreCase("Female")|| gender.equalsIgnoreCase("F") && bmi > 30)
		{
			System.out.println("\nYour BMI is: "+ bmi+"\nYou are considered: Obese");
		}
			
		else 
		{
			System.err.println("\nERROR! \n" + "To enter your gender you must use; \n" + "\"Male\" or \"M\" for male. \n"+"\"Female\" or \"F\" for female.");
			System.err.println("Please restart the program and try again!");
			JOptionPane.showMessageDialog(null,"Oops! Something went wrong.","System Error",JOptionPane.ERROR_MESSAGE);
		}		
	}		
}
		
		
	


