package com.bilgeadam.boost.week04.lecture001;

import java.util.HashMap;
import java.util.Map;

public class CitiesAndFood {

	public static void main(String[] args) {
		
		
		Map<Integer,String> plateNoCity = new HashMap<Integer,String>();
		plateNoCity.put(34, "Istanbul");
		plateNoCity.put(06, "Ankara");
		plateNoCity.put(07, "Antalya");
		plateNoCity.put(35, "Izmir");
		
		Map<String, String> cityFood = new HashMap<String, String>();
		cityFood.put(plateNoCity.get(cityFood),"Herhangi bir yemek");
		cityFood.put("Ankara","Herhangi bir yemek");
		cityFood.put("Erzurum","Herhangi bir yemek");
		cityFood.put("Trabzon","Herhangi bir yemek");
		cityFood.put("Konya","Herhangi bir yemek");
		
		
		System.out.println(cityFood);
		
	}

}
