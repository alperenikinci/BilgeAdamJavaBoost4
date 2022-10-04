package com.bilgeadam.boost.week03.lecture003.School;

public class Student extends Person
{
	private Course course;
	private	Adress adress;
	

	public Course getCourse() {
		return course;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	

	@Override
	public String toString() {
		return "Student [course=" + course + ", adress=" + adress + ", getId()=" + getId() + ", getName()=" + getName()
				+ "]";
	}

	public Student() {
		super();
	}
	
	
}
