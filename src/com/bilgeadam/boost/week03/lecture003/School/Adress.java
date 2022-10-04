package com.bilgeadam.boost.week03.lecture003.School;

public class Adress 
{
	private String city;
	private String street;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public Adress(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}
	
	public Adress() {
		super();
	}
	
	@Override
	public String toString() {
		return "Adress [city=" + city + ", street=" + street + "]";
	}
	
	
}
