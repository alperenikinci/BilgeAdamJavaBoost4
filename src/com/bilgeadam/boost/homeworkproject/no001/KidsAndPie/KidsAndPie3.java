package com.bilgeadam.boost.homeworkproject.no001.KidsAndPie;

public class KidsAndPie3 {

	public static void main(String[] args) 
	{
		String[] kid1 = {"b","c"};
		String[] kid2 = {"b","c"};
		String[] kid3 = {"a","c"};
		int count = 1;
		for(int i = 0;i<kid1.length;i++) 
		{
			for (int j = i;j<kid2.length;j++) 
			{
				for(int k = j;k<kid3.length;k++) 
				{
					System.out.println("iteration no: "+count+" "+kid1[i]+kid2[j]+kid3[k]);
					count++;
					
					
				}
			}
		}
	}

}
