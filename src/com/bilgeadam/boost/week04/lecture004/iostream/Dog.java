package com.bilgeadam.boost.week04.lecture004.iostream;

import java.io.Serializable;

public class Dog implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2381476602475781846L;
	String name;
	String breed;
	
	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

}
