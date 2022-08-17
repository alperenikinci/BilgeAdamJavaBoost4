package com.bilgeadam.boost.week01.lecture003;
import java.util.Scanner;
public class HMWGradeAndLetterNoteCalculation 

{
	public static void main(String[] args) 

	{
		double m1, m2, f, m1w, m2w, fw, total;
		String grade = "";
		
		Scanner scan = new Scanner (System.in);
			
			System.out.print("Please enter your first midterm score: ");
			m1 = scan.nextDouble();
			
			System.out.print("Please enter your first midterm weight: ");
			m1w = scan.nextDouble();
		
			System.out.print("Please enter your second midterm score: ");
			m2 = scan.nextDouble();
		
			System.out.print("Please enter your second midterm weight: ");
			m2w = scan.nextDouble();
			
			System.out.print("Please enter your final score: ");
			f = scan.nextDouble();
			
			System.out.print("Please enter your final weight: ");
			fw = scan.nextDouble();
		
		scan.close();
		
		total = (m1*m1w/100)+(m2*m2w/100)+(f*fw/100);
		
		if (total<50) 
			
				{	
					grade = "FF";
					System.out.println("\nYour total score is: " +total+"\nYour letter grade is: "+grade);
				}
		
			else if (total<60)
				{	
					grade = "DD";
					System.out.println("\nYour total score is: " +total+"\nYour letter grade is: "+grade);
				}
			
			else if (total<70) 
				{
					grade = "CC";
					System.out.println("\nYour total score is: " +total+"\nYour letter grade is: "+grade);
				}
		
			else if (total<80) 
				{	
					grade = "BB";
					System.out.println("\nYour total score is: " +total+"\nYour letter grade is: "+grade);
				}
			
		else	
				{
					grade = "AA";
					System.out.println("\nYour total score is: " +total+"\nYour letter grade is: "+grade);
				}		
	
		}
}