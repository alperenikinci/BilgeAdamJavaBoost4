package com.bilgeadam.boost.week03.lecture005.lists;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class AnimalList 
{
	public static void main(String[] args) {
		AnimalList animalList = new AnimalList();
		animalList.showTasks();
	}

	private void showTasks() {
		List<String> animals = new ArrayList<String>();
		Collections.addAll(animals, "Cat","Dog","Lion","Tiger","Monkey","Owl","Eagle","Whale","Dolpin","Shark");
		System.out.println("\nTask 1: Animal list has been created! List contains 10 animals: " + animals );
		System.out.println("\nTask 2: 3rd animal is: " +animals.get(2) );
		System.out.println("\nTask 3: " + animals.get(4)+ " is removed from the list.");
		animals.remove(4);
		System.out.println("New list is : " + animals);
		System.out.println("\nTask 4: "+animals.get(5)+ " is changed to: Gorilla");
		animals.set(5, "Gorilla");
		System.out.println("\nTask 5: Foreach Looped list output: ");
		for (String index : animals) {
			
			System.out.println("Animal is: " + index);
			
		}
		System.out.println("\nTask 6: Method to find current size of the list is : animals.size()");
		System.out.println("\nTask 7: The size of the list is : " + animals.size());
		System.out.println("\nTask 8: Is list empty? : animals.isEmpty() ");
		System.out.println(animals.isEmpty());
		System.out.println("\nTask 9: Is there a Dog in the list? : animals.contains() ");
		System.out.println(animals.contains("Dog"));
		System.out.println("\nTask 10: Which index is Dog at? : animals.indexOf() ");
		System.out.println(animals.indexOf("Dog"));
		System.out.println("\nTask 11: "+animals.get(2)+" is changed to Giraffe");
		animals.set(2, "Giraffe");
		System.out.println("New list is : " + animals);
		System.out.println("\nTask 12: "+ animals.get(animals.indexOf("Dog")) + " is removed from the list : animals.get(animals.indexOf(\"Dog\")) ");
		animals.remove(animals.indexOf("Dog"));
		System.out.println("New list is : " + animals);
		System.out.println("\nTask 13: a new list from index 2 to index 7 : animals.subList(2, 7) ");
		animals.subList(2, 7);
		System.out.println("Sublist is : " + animals.subList(2, 7));
		System.out.println("\nTask 14: Reverse of the original list is : Collections.reverse(animals)");
		Collections.reverse(animals);
		System.out.println(animals);
		System.out.println("\nTask 15: Alphabetical order of the list is : Collections.sort(animals)");
		Collections.sort(animals);
		System.out.println(animals);
		System.out.println("\nTask 16: Reverse Alphabetical order of the list is : Collections.reverse(animals)");  // Animals,Collections.reverseOrder();
		Collections.reverse(animals);
		System.out.println(animals);
		System.out.println("\nTask 17: Empty the whole list : animals.removeAll(animals)");
		animals.removeAll(animals);
		System.out.println(animals);		
	}
	
}
