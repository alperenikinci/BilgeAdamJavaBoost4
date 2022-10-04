package com.bilgeadam.boost.marathon02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HourlyWageEarningEmployee extends Employee implements HourlyWageable {
	private double netHourlyWage = netHourlyWageGenerator();
	private int hoursWorked = workHourGenerator();
	private final double vatRatio = 0.08;
	static List<HourlyWageEarningEmployee> hourlyList = new ArrayList<>();

	public HourlyWageEarningEmployee() {
		super();
		this.registrationId = generateRegistrationId();
		this.finalSalary = calculateMonthlySalary();
		Employee.employeeList.add(this);
		hourlyList.add(this);
	}

	public HourlyWageEarningEmployee(String name, String surname, String registrationId,
			LocalDate startingDateOfEmployee, LocalDate employmentEndDate, double monthlySalary, double finalSalary) {
		super(name, surname, registrationId, startingDateOfEmployee, employmentEndDate, monthlySalary, finalSalary);
		this.registrationId = generateRegistrationId();
		this.finalSalary = calculateMonthlySalary();
		Employee.employeeList.add(this);
		hourlyList.add(this);
	}

	public double getNetHourlyWage() {
		return netHourlyWage;
	}

	public void setNetHourlyWage(double netHourlyWage) {
		this.netHourlyWage = netHourlyWage;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getVatRatio() {
		return vatRatio;
	}

	@Override
	public String toString() {
		return "Hourly Wage Earning Employee	:	<< " + this.getStartingDateOfEmployee().getYear() + "/"
				+ getRegistrationId() + " - " + getName() + " " + getSurname() + " 		>>";
	}

	@Override
	public double calculateMonthlySalary() {
		double initialSalary = this.netHourlyWage * this.hoursWorked;
		this.finalSalary = initialSalary + initialSalary * this.vatRatio;
		return this.finalSalary;
	}

	@Override
	public String generateRegistrationId() {
		String tempId = null;
		tempId = String.format("%04d", ++employeeCount);
		if(employeeCount==9999) 
		{	
			employeeCount=0;
		}
		return tempId;
	
	}

	private int netHourlyWageGenerator() {
		Random random = new Random();
		int hourlyWageLowerBound = 50;
		int hourlyWageUpperBound = 150;
		int wage = random.nextInt(hourlyWageLowerBound, hourlyWageUpperBound);
		return wage;
	}

	private int workHourGenerator() {
		Random random = new Random();
		int hourlyLowerBound = 100;
		int hourlyUpperBound = 200;
		int workHours = random.nextInt(hourlyLowerBound, hourlyUpperBound);
		return workHours;
	}

}
