package com.bilgeadam.boost.marathon02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee 
{
	private String name;
	private String surname;
	protected String registrationId;
	private LocalDate startingDateOfEmployee;
	private LocalDate employmentEndDate;
	protected double monthlySalary;
	protected double finalSalary;
	protected static int employeeCount;
	static List<Employee> employeeList = new ArrayList<>();
		
	public Employee() {
		super();
	}


	public Employee(String name, String surname, String registrationId, LocalDate startingDateOfEmployer,
			LocalDate employmentEndDate, double monthlySalary, double finalSalary) {
		super();
		this.name = name;
		this.surname = surname;
		this.registrationId = registrationId;
		this.startingDateOfEmployee = startingDateOfEmployer;
		this.employmentEndDate = employmentEndDate;
		this.monthlySalary = monthlySalary;
		this.finalSalary = finalSalary;
	}




	public String generateRegistrationId()
	{	String tempId = null;
		
		if(employeeCount<1000) 
		{	
			tempId = String.format("%04d", ++employeeCount);
		}
		return tempId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getRegistrationId() {
		return registrationId;
	}

	public LocalDate getStartingDateOfEmployee() {
		return startingDateOfEmployee;
	}

	public void setStartingDateOfEmployer(LocalDate startingDateOfEmployee) {
		this.startingDateOfEmployee = startingDateOfEmployee;
	}

	public LocalDate getEmploymentEndDate() {
		return employmentEndDate;
	}

	public void setEmploymentEndDate(LocalDate employmentEndDate) {
		this.employmentEndDate = employmentEndDate;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public double getFinalSalary() {
		return finalSalary;
	}

	public void setFinalSalary(double finalSalary) {
		this.finalSalary = finalSalary;
	}


	public int getEmployeeCount() {
		return employeeCount;
	}


	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}


	public void setStartingDateOfEmployee(LocalDate startingDateOfEmployee) {
		this.startingDateOfEmployee = startingDateOfEmployee;
	}


	
}
