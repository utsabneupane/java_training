package com.lftechnology.java_training.dec31;

import java.util.Scanner;

/**
 * Write a test application named EmployeeTest that demonstrates class
 * Employee's capabilities. Create two Employee objects and display each
 * object's full name and yearly salary. Then give each Employee a 10% raise and
 * display each Employee's full name and yearly salary again.
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		employee1.assignData("employee1");
		employee2.assignData("employee2");
		employee1.displayData();
		employee2.displayData();
		System.out.println("After 10% rise in Salary:");
		employee1.setData(employee1.getFirstName(), employee1.getLastName(),
				employee1.getIncSalary());
		employee2.setData(employee2.getFirstName(), employee2.getLastName(),
				employee2.getIncSalary());
		employee1.displayData();
		employee2.displayData();
	}

}

/**
 * * Create a class called Employee that includes three pieces of information as
 * instance variables a first name (type String), a last name (type String) and
 * a monthly salary (double). Your class should have a constructor that
 * initializes the three instance variables. Provide a set and a get method for
 * each instance variable.
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
class Employee {
	private String firstName = "";
	private String lastName = "";
	private double salary = 0;
	private Scanner input = new Scanner(System.in);

	/**
	 * set value to instance variable
	 * 
	 * @param firstName
	 *            first name of employee
	 * @param lastName
	 *            last name of employee
	 * @param salary
	 */
	protected void setData(String fName, String lName, double salary) {
		this.firstName = fName;
		this.lastName = lName;
		this.salary = salary;
	}

	/**
	 * get first name
	 * 
	 * @return first Name Of employee
	 */
	protected String getFirstName() {
		return this.firstName;
	}

	/**
	 * get last name
	 * 
	 * @return last Name of employee
	 */
	protected String getLastName() {
		return this.lastName;
	}

	/**
	 * get increased salary
	 * 
	 * @return increased salary
	 */
	protected double getIncSalary() {
		return (this.salary + this.salary * 0.1);
	}

	/**
	 * takes input from user about information of employee
	 */
	protected void assignData(String nameEmployee) {
		Boolean inputFormat = true;
		System.out.println("hello " + nameEmployee);
		System.out.println("Enter your First Name:");
		this.firstName = input.next();
		System.out.println("enter your last Name: ");
		this.lastName = input.next();
		/* for correct input from user */
		do {
			try {
				do {
					System.out.println("enter your salary: ");
					this.salary = input.nextDouble();
					if (this.salary < 0) {
						System.out.println("cant be negative salary");
					}
				} while (this.salary < 0);
				inputFormat = true;
			} catch (Exception e) {
				System.out.println("Enter number value");
				inputFormat = false;
				input.next();
			}

		} while (!inputFormat);

	}

	/**
	 * display information about employee
	 */
	protected void displayData() {
		System.out.println("Hello. " + this.firstName + " " + this.lastName);
		System.out.println("Your Present Salary is= " + this.salary);
	}
}
