package com.bilgeadam.boost.week04.lecture002.streamapi;

public class User 
{
	int id;
	private String name;
	
	void talk() {
		System.out.println("Hi! My name is : "+ name);
	}
	

		
	
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}





	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
