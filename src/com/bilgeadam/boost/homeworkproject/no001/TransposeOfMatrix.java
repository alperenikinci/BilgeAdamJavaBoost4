package com.bilgeadam.boost.homeworkproject.no001;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) 
	{	
		TransposeOfMatrix transposeMatrix = new TransposeOfMatrix();
		transposeMatrix.execute();
	}

	private void execute() 
	{	
		System.out.println("Welcome to the matrix transposer!!!\n");
		
		
		int rows = 0;
		int columns= 0;
		
		while(true)
		{	System.out.print("Please enter how many rows your matrix have : ");
			Scanner input = new Scanner (System.in);
			if(!input.hasNextInt()) 
			{
			System.err.println("Please enter an integer..! ");
			continue;
			}
			rows = input.nextInt();
			if(rows<1)
			{
			System.err.println("Please enter a positive number..!");
			continue;
			}
			break;	
		}
		while(true)
		{	System.out.print("Please enter how many columns your matrix have : ");
			Scanner input = new Scanner (System.in);
			if(!input.hasNextInt()) 
			{
			System.err.println("Please enter an integer..! ");
			continue;
			}
			columns = input.nextInt();
			if(columns<1)
			{
			System.err.println("Please enter a positive number..!");
			continue;
			}
			break;	
		}
		int[][] matrix = new int[rows][columns];
		int[][] transpose = new int [columns][rows];
		while(true)
		{	Scanner input = new Scanner (System.in);
			System.out.println("Please enter the rows of the Matrix : ");
			if(!input.hasNextInt()) 
			{
			System.err.println("Please enter an integer..! ");
			continue;
			}
			for (int i = 0; i < rows; i++)
	            for (int j = 0; j < columns; j++) 
	            {
	            	matrix[i][j] = input.nextInt();
	            	transpose[j][i] = matrix[i][j];
	            }
			input.close();
			break;
			}
		

		System.out.println("\nYour matrix is : \n");
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                System.out.print(matrix[i][j] + " 	 ");
            System.out.println();
		}
		
		System.out.println("\nTranspose of your matrix is : ");
		for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++)
                System.out.print(transpose[i][j] + " 	 ");
            System.out.println();
		}
		
		
	
		
	}

}
