package com.lftechnology.java_training.dec31;

import java.util.Scanner;

/**
 * Write a test application named EmployeeTest that demonstrates class
 * Employee's capabilities. Create two Employee objects and display each
 * object's full name and yearly salary. Then give each Employee a 10% raise and
 * display each Employee's full name and yearly salary again.
 * 
 * @author utsabn34
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
 * @author utsabn34
 * 
 */
class Employee {
	private String fName = "";
	private String lname = "";
	private double salary = 0;
	private Scanner input = new Scanner(System.in);

	/**
	 * set value to instance variable
	 * 
	 * @param fName
	 * @param lName
	 * @param salary
	 */
	protected void setData(String fName, String lName, double salary) {
		this.fName = fName;
		this.lname = lName;
		this.salary = salary;
	}

	/**
	 * get first name
	 * 
	 * @return first Name Of employee
	 */
	protected String getFirstName() {
		return this.fName;
	}

	/**
	 * get last name
	 * 
	 * @return last Name of employee
	 */
	protected String getLastName() {
		return this.lname;
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
		Boolean status = true;
		System.out.println("hello " + nameEmployee);
		System.out.println("Enter your First Name:");
		this.fName = input.next();
		System.out.println("enter your last Name: ");
		this.lname = input.next();
		/* for correct input from user */
		do {
			try {
				System.out.println("enter your salary: ");
				this.salary = input.nextDouble();
				status = true;
			} catch (Exception e) {
				System.out.println("Enter number value");
				status = false;
				input.next();
			}

		} while (!status);

	}

	/**
	 * display information about employee
	 */
	protected void displayData() {
		System.out.println("Hello. " + this.fName + " " + this.lname);
		System.out.println("Your Present Salary is= " + this.salary);
	}
}
