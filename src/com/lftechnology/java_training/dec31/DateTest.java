package com.lftechnology.java_training.dec31;

import java.util.Scanner;

/**
 * Write a test application named DateTest that demonstrates class Date's
 * capabilities.
 * 
 * @author utsabn34
 * 
 */
public class DateTest {

	public static void main(String[] args) {
		Date date1 = new Date();
		Date date2 = new Date();
		date1.assignValue();
		date2.setDay(12);
		date2.setMonth(01);
		date2.setYear(2013);
		System.out.println("User inputted  is: " + date1.getDay() + "/"
				+ date1.getMonth() + "/" + date1.getYear());
		date2.displayDate();
	}

}

/**
 * a class called Date that includes three pieces of information as instance
 * variables a month (type int), a day (type int) and a year (type int). Your
 * class should have a constructor that initializes the three instance variables
 * and assumes that the values provided are correct. Provide a set and a get
 * method for each instance variable. Provide a method displayDate that displays
 * the month, day and year separated by forward slashes (/).
 * 
 * @author utsabn34
 * 
 */
class Date {
	private int month = 0;
	private int day = 0;
	private int year = 0;
	private Scanner input = new Scanner(System.in);

	/**
	 * set value to instance variable month
	 */
	protected void setMonth(int month) {
		this.month = month;

	}

	/**
	 * set value to instance variable day
	 */
	protected void setDay(int day) {
		this.day = day;

	}

	/**
	 * set value to instance variable year
	 */
	protected void setYear(int year) {
		this.year = year;

	}

	/**
	 * get value from instance variable month
	 * 
	 * @return month
	 * 
	 */
	protected int getMonth() {
		return this.month;
	}

	/**
	 * get value from instance variable day
	 * 
	 * @return day
	 */
	protected int getDay() {
		return this.day;
	}

	/**
	 * get value from instance variable year
	 * 
	 * @return year
	 */
	protected int getYear() {
		return this.year;
	}

	protected void assignValue() {
		Boolean status = true;
		/* for correct input from user */
		do {
			try {
				System.out.println("Enter day : ");
				this.day = input.nextInt();
				status = true;
			} catch (Exception e) {
				System.out.println("Enter integer value");
				status = false;
				input.next();
			}

		} while (!status);
		/* for correct input from user */
		do {
			try {
				System.out.println("Enter month : ");
				this.month = input.nextInt();
				status = true;
			} catch (Exception e) {
				System.out.println("Enter integer value");
				status = false;
				input.next();
			}

		} while (!status);
		/* for correct input from user */
		do {
			try {
				System.out.println("Enter year : ");
				this.year = input.nextInt();
				status = true;
			} catch (Exception e) {
				System.out.println("Enter integer value");
				status = false;
				input.next();
			}

		} while (!status);

	}

	/**
	 * displays date as values provided by user
	 */
	protected void displayDate() {
		System.out.println("Date inputted from from Set() is: " + this.day
				+ "/" + this.month + "/" + this.year);
	}
}