package com.bilgeadam.boost.week03.lecture004;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<>();
		list.add("Elma");
		list.add("1");
		list.add("true");
		list.add("Armut");
		
		
		//Listede var mı?
		if(list.contains("Elma"))
			System.out.println("Listede elma var");
		else if (list.contains("Masa"))
			System.out.println("listede masa var");
		if(!list.contains("Masa"))							
			System.out.println("Listede masa yok");
		
		// Bütün listeyi yazdırabiliriz.
		for (String string : list) 
		{
			System.out.println(string);
		}
		
		list.add(2, "Uzum"); //list index 2'ye üzüm ekleme
		list.add(5, "Uzum"); //list.add ile aynı üründen 2 kere ekleyebiliriz, bir sıkıntı yaşamayız.
		
		System.out.println();//list outputlarını ayırmak için
		
		
		// Bütün listeyi yazdırmaya alternatif metot. 
		// Arraylerde array.length kullanırken, Listlerde list.size kullanıyoruz.
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
	}

}
