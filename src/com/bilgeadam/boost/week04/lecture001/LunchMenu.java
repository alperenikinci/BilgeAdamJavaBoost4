package com.bilgeadam.boost.week04.lecture001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class LunchMenu {

	
	public static void main(String[] args) 
	{
		List<String> mainCourses = new ArrayList<String>();		
		List<String> soups = new ArrayList<String>();
		
		Collections.addAll(mainCourses, "Kuru fasulye","Nohut","Tavuk haslama","Et haslama","Patates yemegi","Manti","Karniyarik","Et sote","Tavuk Sote","Balik");
//		System.out.println(mainCourses.size());
		Collections.addAll(soups,"Yayla corbasi","Tarhana corbasi","Yesil mercimek corbasi","Kirmizi mercimek corbasi","Brokoli corbasi","Ezogelin corbasi","Sebze corbasi","Domates corbasi","Mantar corbasi","Tavuk corbasi");
//		System.out.println(soups.size());
		
		LunchMenu obj = new LunchMenu();
		HashMap<String, String> courseMix = new HashMap<String, String>();
		courseMix.put(obj.getRandomElement(mainCourses),obj.getRandomElement(soups));
		HashMap<String, String> courseMix1 = new HashMap<String, String>();
		courseMix1.put(obj.getRandomElement(mainCourses),obj.getRandomElement(soups));
		HashMap<String, String> courseMix2 = new HashMap<String, String>();
		courseMix2.put(obj.getRandomElement(mainCourses),obj.getRandomElement(soups));
		HashMap<String, String> courseMix3 = new HashMap<String, String>();
		courseMix3.put(obj.getRandomElement(mainCourses),obj.getRandomElement(soups));
		HashMap<String, String> courseMix4 = new HashMap<String, String>();
		courseMix4.put(obj.getRandomElement(mainCourses),obj.getRandomElement(soups));
		
		HashMap<String, HashMap> daysAndCourses  = new HashMap<String, HashMap>();
		daysAndCourses.put("1- Pazartesi", courseMix);
		daysAndCourses.put("2- Sali", courseMix1);
		daysAndCourses.put("3- Carsamba",courseMix2);
		daysAndCourses.put("4- Persembe",courseMix3);
		daysAndCourses.put("5- Cuma", courseMix4);
	
//		System.out.println(Arrays.asList(daysAndCourses));
//		System.out.println(daysAndCourses);
		for (String name: daysAndCourses.keySet()) {
		    String key = name.toString();
		    String value = daysAndCourses.get(name).toString();
		    System.out.println(key + " " + value);
		}
	}

	String getRandomElement(List<String> List) 
	{
		Random rand = new Random();
		return List.get(rand.nextInt(List.size()));
	}
	
	
	
}
