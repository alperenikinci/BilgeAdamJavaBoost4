package com.bilgeadam.boost.week03.lecture003.School;

public class Teacher extends Person
{
	private String branch;
	private Adress adress;

	public Teacher() {
		super();
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Teacher [branch=" + branch + ", adress=" + adress + ", getId()=" + getId() + ", getName()=" + getName()
				+ "]";
	}

}
