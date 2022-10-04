package com.bilgeadam.boost.homeworkproject.no001.KidsAndPie;

import java.util.ArrayList;
import java.util.List;

public class KidsAndPie 
{						
	public static void main(String[] args) 
	{
		List<String> kid1 = new ArrayList<String>();
		kid1.add("a");
		kid1.add("b");
		kid1.add("c");
		kid1.add("d");
		kid1.add("e");
		
		
		List<String> kid2 = new ArrayList<String>();
		kid2.add("a");
		kid2.add("b");
		kid2.add("c");
		kid2.add("d");
		kid2.add("e");
	
		
		List<String> kid3 = new ArrayList<String>();
		kid3.add("a");
		kid3.add("b");
		kid3.add("c");
		kid3.add("d");
		kid3.add("e");
	
		int size = kid1.size();
		
		int count = 1;
		
		for(int i = 0;i<size;i++) 
		{
			for (int j = i;j<size;j++) 
			{
				for(int k = j;k<size;k++) 
				{	
					System.out.println("iteration no: "+count+" "+kid1.get(i)+kid2.get(j)+kid3.get(k));
					count++;
				}
			}
		}
	}
}
