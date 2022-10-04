package com.bilgeadam.boost.week04.lecture002.streamapiHMW;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;



public class StreamAPIHomework {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Whittaker","Godleman","Male",32));
		persons.add(new Person("Merola","Wrout","Female",32));
		persons.add(new Person("Melosa","Courage","Female",14));
		persons.add(new Person("Sydney","Cullington","Female",74));
		persons.add(new Person("Sherwin","Ogley","Male",14));
		persons.add(new Person("Dukie","Malpass","Male",30));
		persons.add(new Person("Jarrett","Fearick","Male",77));
		persons.add(new Person("Willie","Childerhouse","Male",31));
		persons.add(new Person("Berky","Tollmache","Male",73));
		persons.add(new Person("Nanete","Blundsen","Female",81));
		
//		persons.stream()
//		.forEach(person -> 
//		{System.out.println(person); person.speak();});
//		System.out.println();
		
		//Nasıl map yapılacak???
			//		List<Person> filteredList = persons.stream()
			//				.filter(person -> person.getAge()<50)
			//				.collect(Collectors.toList());
			//		filteredList.stream().
			//		forEach(person -> System.out.println(
			//				person.getName()+" "+
			//				person.getLastName()+" "+
			//				person.getAge()));
			//		System.out.println();	
		
		Map<Object, Object> filteredMap = persons.stream()
				.filter(person -> person.getAge()<50)
				.collect(Collectors.toMap(person -> person.name, person -> person.age));
		
		filteredMap.forEach((key,value) -> System.out.println(key+" - "+ value));
		System.out.println();
	
		List<Person> underAgeMale = persons.stream()
				.filter(person -> person.getAge()<35 && person.getGender() == "Male")
				.collect(Collectors.toList());
		underAgeMale.stream().forEach(person -> person.speak());
		System.out.println();
		
		Set<Integer> ageUpdate = persons.stream()
				.filter(person -> person.getGender() == "Male").map(person -> person.getAge()+15)
				.collect(Collectors.toSet());
		
		ageUpdate.stream()
				.forEach(person -> System.out.println(person));
		
	
//		underAgeMale.stream()
//		.forEach(person -> {System.out.println(person); person.speak();});
		
		
		
		

	
	}

}
