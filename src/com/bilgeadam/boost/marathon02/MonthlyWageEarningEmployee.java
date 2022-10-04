package com.bilgeadam.boost.marathon02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonthlyWageEarningEmployee extends Employee implements MonthlyWageable {
	private final double payrollTax = 0.25;
	static List<MonthlyWageEarningEmployee> monthlyList = new ArrayList<>();

	private int monthlySalaryGenerator() {
		Random random = new Random();
		int hourlyWageLowerBound = 5000;
		int hourlyWageUpperBound = 15000;
		int monthlySalary = random.nextInt(hourlyWageLowerBound, hourlyWageUpperBound);
		return monthlySalary;
	}

	@Override
	public double calculateMonthlySalary() {
		double initialSalary = this.getMonthlySalary();
		this.finalSalary = initialSalary + initialSalary * this.payrollTax;
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

	public MonthlyWageEarningEmployee() {
		super();
		this.monthlySalary = monthlySalaryGenerator();
		this.registrationId = generateRegistrationId();
		this.finalSalary = calculateMonthlySalary();
		Employee.employeeList.add(this);
		monthlyList.add(this);

	}

	public MonthlyWageEarningEmployee(String name, String surname, String registrationId,
			LocalDate startingDateOfEmployee, LocalDate employmentEndDate, double monthlySalary, double finalSalary) {
		super(name, surname, registrationId, startingDateOfEmployee, employmentEndDate, monthlySalary, finalSalary);
		this.registrationId = generateRegistrationId();
		this.finalSalary = calculateMonthlySalary();
		Employee.employeeList.add(this);
		monthlyList.add(this);

	}

	public double getPayrollTax() {
		return payrollTax;
	}

	@Override
	public String toString() {
		return "Monthly Wage Earning Employee	:	<< " + this.getStartingDateOfEmployee().getYear() + "/"
				+ getRegistrationId() + " - " + getName() + " " + getSurname() + " 		>>";
	}

}
