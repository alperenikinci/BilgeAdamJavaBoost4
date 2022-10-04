package com.bilgeadam.boost.marathon02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Scanner;

public class SalaryRoll {
	static Scanner input = new Scanner(System.in);
	static int counter = 0;

	public void execute() {
		generateEmployees();
		menu();
	}

	public void menu() {

		System.out.println("\n--------------------------------------");
		System.out.println("----Welcome to Personnel Management---");
		System.out.println("--------------------------------------");
		System.out.println("1- Create New Employee");
		System.out.println("2- Show Employees");
		System.out.println("3- Monthly Payment List");
		System.out.println("4- Important Information");
		System.out.println("0- Exit");
		System.out.print("What would you like to do? : ");
		int selection = input.nextInt();
		input.nextLine();

		switch (selection) {
		case 1:
			createNewEmployee();
			break;
		case 2:
			listEmployees();
			break;
		case 3:
			monthlyPaymentList();
			break;
		case 4:
			importantInformation();
			break;
		case 0:
			exit();
			break;
		}
	}

	private void importantInformation() {
		System.out.println("\n-------------------------------------------------------------------------------------");
		System.err.println("Salaries are designed to be randomized every single time of execution of the program."
				+ "\nThis is due to receive some different parameters each time. Also it was easier to initilize :)");
		System.out.println("-------------------------------------------------------------------------------------");
		mainMenuQuestion();

	}

	private void mainMenuQuestion() {
		System.out.print("Would you like to return to the main menu? (Y/N) : ");
		String selection = input.nextLine();
		if (selection.equalsIgnoreCase("n")) {
			System.out.println("Bye....");
			System.exit(1);
		} else {
			menu();
		}
	}

	private void monthlyPaymentList() {
		System.out.print("Please Enter a Date (yyyy-MM-dd) : ");
		LocalDate date = setDate();
		System.out.println("\n-----------------------------------------------------------------");
		System.out.println("Employees who were active during the time period of : " + date);
		System.out.println("-----------------------------------------------------------------");
		Employee.employeeList.stream()
				.filter(employee -> employee.getStartingDateOfEmployee().isBefore(date)
						&& employee.getEmploymentEndDate().isAfter(date))
				.forEach(employee -> System.out.println(employee + " " + "Salary : "
						+ String.format("%.2f", employee.getFinalSalary()) + " Turkish Liras"));
		menu();
	}

	private void exit() {
		System.out.print("\nAre You Sure? (Y/N) : ");
		String selection = input.nextLine();
		if (selection.equalsIgnoreCase("y")) {
			System.out.println("Bye....");
			System.exit(1);
		} else {
			menu();
		}
	}

	private void listEmployees() {
		System.out.println("\n---------------------------------------");
		System.out.println("---Which List Would You Like To See?---");
		System.out.println("---------------------------------------");
		System.out.println("1- All Employees");
		System.out.println("2- Hourly Waged Employees");
		System.out.println("3- Monthly Waged Employees");
		System.out.println("0- Return to Main Menu");
		System.out.print("Selection : ");
		int selection = input.nextInt();

		switch (selection) {
		case 1:
			showAllEmployees();
			listEmployees();
			break;
		case 2:
			showHourlyWagedEmployees();
			listEmployees();
			break;
		case 3:
			showMonthlyWagedEmployees();
			listEmployees();
			break;
		case 0:
			menu();
			break;
		}

	}

	private void sortMenu() {
		System.out.println("\n---------------------------------------");
		System.out.println("------How Would You Like to Sort?------");
		System.out.println("---------------------------------------");
		System.out.println("1- By Registration ID");
		System.out.println("2- By Name");
		System.out.println("3- By Employment Date");
		System.out.print("Selection : ");
	}

	private void showMonthlyWagedEmployees() {
		sortMenu();
		int selection = input.nextInt();
		switch (selection) {
		case 1:
			sortMonthlyWagedEmployeesByRegistrationId();
			break;
		case 2:
			sortMonthlyWagedEmployeesByName();
			break;
		case 3:
			sortMonthlyWagedEmployeesByEmploymentDate();
			break;
		}
	}

	private void showHourlyWagedEmployees() {
		sortMenu();
		int selection = input.nextInt();
		switch (selection) {
		case 1:
			sortHourlyWagedEmployeesByRegistrationId();
			break;
		case 2:
			sortHourlyWagedEmployeesByName();
			break;
		case 3:
			sortHourlyWagedEmployeesByEmploymentDate();
			break;
		}
	}

	private void showAllEmployees() {
		sortMenu();
		int selection = input.nextInt();
		switch (selection) {
		case 1:
			sortAllEmployeesByRegistrationId();
			break;
		case 2:
			sortAllEmployeesByName();
			break;
		case 3:
			sortAllEmployeesByEmploymentDate();
			break;
		}
	}

	private void createNewEmployee() {

		System.out.println("\n---------------------------------------");
		System.out.println("--------Create New Employee Menu--------");
		System.out.println("----------------------------------------");
		System.out.println("-------What is the Employee Type?-------");
		System.out.println("----------------------------------------");
		System.out.println("1 - Hourly Waged Employee ");
		System.out.println("2 - Monthly Waged Employee ");
		System.out.println("0 - Return to Main Menu ");
		System.out.print("Selection : ");
		int selection = input.nextInt();
		input.nextLine();

		switch (selection) {
		case 1:
			createHourlyWageEarningEmployee();
			break;
		case 2:
			createMonthlyWageEarningEmployee();
			break;
		case 0:
			menu();
		}

	}

	private void createMonthlyWageEarningEmployee() {
		MonthlyWageEarningEmployee monthly = new MonthlyWageEarningEmployee();
		System.out.print("Name : ");
		monthly.setName(input.nextLine());
		System.out.print("Surname : ");
		monthly.setSurname(input.nextLine());
		System.out.print("Job Start Date (yyyy-MM-dd) : ");
		monthly.setStartingDateOfEmployer(setDate());
		System.out.print("Employment End Date (yyyy-MM-dd) (Leave it blank if employee is still active) : ");
		monthly.setEmploymentEndDate(setEndDate());
		createNewEmployee();
	}

	private void createHourlyWageEarningEmployee() {
		HourlyWageEarningEmployee hourly = new HourlyWageEarningEmployee();
		System.out.print("Name : ");
		hourly.setName(input.nextLine());
		System.out.print("Surname : ");
		hourly.setSurname(input.nextLine());
		System.out.print("Job Start Date (yyyy-MM-dd) : ");
		hourly.setStartingDateOfEmployer(setDate());
		System.out.print("Employment End Date (yyyy-MM-dd) (Leave it blank if employee is still active) : ");
		hourly.setEmploymentEndDate(setEndDate());
		createNewEmployee();

	}

	private LocalDate setEndDate() {
		LocalDate d1 = null;
		String selection = input.nextLine();
		if (selection.isBlank()) {
			d1 = LocalDate.now();
		} else {
			d1 = LocalDate.parse(selection, DateTimeFormatter.ISO_LOCAL_DATE);
		}
		return d1;
	}

	private LocalDate setDate() {
		LocalDate d1 = null;
		String selection = input.nextLine();
		if (!selection.isBlank()) {
			d1 = LocalDate.parse(selection, DateTimeFormatter.ISO_LOCAL_DATE);
		}
		return d1;
	}

	private void generateEmployees() {

		HourlyWageEarningEmployee hourly1 = new HourlyWageEarningEmployee();
		hourly1.setName("BobMarley");
		hourly1.setSurname("Faruk");
		hourly1.setStartingDateOfEmployer(LocalDate.of(1989, 10, 06));
		hourly1.setEmploymentEndDate(LocalDate.now());

		HourlyWageEarningEmployee hourly2 = new HourlyWageEarningEmployee();
		hourly2.setName("Arif");
		hourly2.setSurname("Isik");
		hourly2.setStartingDateOfEmployer(LocalDate.of(1989, 10, 07));
		hourly2.setEmploymentEndDate(LocalDate.now());

		MonthlyWageEarningEmployee monthly3 = new MonthlyWageEarningEmployee();
		monthly3.setName("Komutan");
		monthly3.setSurname("Logar");
		monthly3.setStartingDateOfEmployer(LocalDate.of(1990, 01, 06));
		monthly3.setEmploymentEndDate(LocalDate.now());

		HourlyWageEarningEmployee hourly = new HourlyWageEarningEmployee();
		hourly.setName("Ersan");
		hourly.setSurname("Kuneri");
		hourly.setStartingDateOfEmployer(LocalDate.of(1990, 05, 06));
		hourly.setEmploymentEndDate(LocalDate.now());

		MonthlyWageEarningEmployee monthly2 = new MonthlyWageEarningEmployee();
		monthly2.setName("Cagri");
		monthly2.setSurname("Turkmen");
		monthly2.setStartingDateOfEmployer(LocalDate.of(2015, 01, 01));
		monthly2.setEmploymentEndDate(LocalDate.now());

		MonthlyWageEarningEmployee monthly1 = new MonthlyWageEarningEmployee();
		monthly1.setName("Hilal");
		monthly1.setSurname("Er");
		monthly1.setStartingDateOfEmployer(LocalDate.of(2018, 01, 01));
		monthly1.setEmploymentEndDate(LocalDate.of(2020, 12, 05));

		HourlyWageEarningEmployee hourly3 = new HourlyWageEarningEmployee();
		hourly3.setName("Babur");
		hourly3.setSurname("Somer");
		hourly3.setStartingDateOfEmployer(LocalDate.of(2015, 06, 06));
		hourly3.setEmploymentEndDate(LocalDate.of(2019, 03, 07));

		MonthlyWageEarningEmployee monthly = new MonthlyWageEarningEmployee();
		monthly.setName("Alperen");
		monthly.setSurname("Ikinci");
		monthly.setStartingDateOfEmployer(LocalDate.of(2020, 01, 01));
		monthly.setEmploymentEndDate(LocalDate.of(2021, 01, 01));
		monthly.setEmploymentEndDate(LocalDate.now());

	}

	private void sortMonthlyWagedEmployeesByEmploymentDate() {
		System.out.println("\n---Employee List Sorted By Employment Date---\n");
		MonthlyWageEarningEmployee.monthlyList.stream()
				.sorted(Comparator.comparing(Employee::getStartingDateOfEmployee).thenComparing(Employee::getName))
				.forEach(employee -> System.out.println(employee));
	}

	private void sortMonthlyWagedEmployeesByName() {
		System.out.println("\n---Employee List Sorted By Name---\n");
		MonthlyWageEarningEmployee.monthlyList.stream()
				.sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getRegistrationId))
				.forEach(employee -> System.out.println(employee));
	}

	private void sortMonthlyWagedEmployeesByRegistrationId() {
		System.out.println("\n---Employee List Sorted By Registration ID---\n");
		MonthlyWageEarningEmployee.monthlyList.stream().sorted(Comparator.comparing(Employee::getRegistrationId))
				.forEach(employee -> System.out.println(employee));
	}

	private void sortHourlyWagedEmployeesByEmploymentDate() {
		System.out.println("\n---Employee List Sorted By Employment Date---\n");
		HourlyWageEarningEmployee.hourlyList.stream()
				.sorted(Comparator.comparing(Employee::getStartingDateOfEmployee).thenComparing(Employee::getName))
				.forEach(employee -> System.out.println(employee));
	}

	private void sortHourlyWagedEmployeesByName() {
		System.out.println("\n---Employee List Sorted By Name---\n");
		HourlyWageEarningEmployee.hourlyList.stream()
				.sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getRegistrationId))
				.forEach(employee -> System.out.println(employee));
	}

	private void sortHourlyWagedEmployeesByRegistrationId() {
		System.out.println("\n---Employee List Sorted By Registration ID---\n");
		HourlyWageEarningEmployee.hourlyList.stream().sorted(Comparator.comparing(Employee::getRegistrationId))
				.forEach(employee -> System.out.println(employee));
	}

	private void sortAllEmployeesByEmploymentDate() {
		System.out.println("\n---Employee List Sorted By Employment Date---\n");
		Employee.employeeList.stream()
				.sorted(Comparator.comparing(Employee::getStartingDateOfEmployee).thenComparing(Employee::getName))
				.forEach(employee -> System.out.println(employee));
	}

	private void sortAllEmployeesByName() {
		System.out.println("\n---Employee List Sorted By Name---\n");
		Employee.employeeList.stream()
				.sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getRegistrationId))
				.forEach(employee -> System.out.println(employee));
	}

	private void sortAllEmployeesByRegistrationId() {
		System.out.println("\n---Employee List Sorted By Registration ID---\n");
		Employee.employeeList.stream().sorted(Comparator.comparing(Employee::getRegistrationId))
				.forEach(employee -> System.out.println(employee));
	}
}
