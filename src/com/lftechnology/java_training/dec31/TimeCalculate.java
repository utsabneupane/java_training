package com.lftechnology.java_training.dec31;

import java.util.Scanner;

/**
 * Create a class called Time with three attributes hours, minutes, and seconds.
 * Use appropriate constructor (s) to initialize instance variables. Also, use a
 * display method to display the time in hh:mm:ss format. Modify the class to
 * add two time objects that correctly results in addition of times.
 * 
 * @author utsabn34
 * 
 */
public class TimeCalculate {

	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time();
		time1.assignValue();
		time1.displayTime("time1");
		time2.setData(6, 22, 55);
		time2.displayTime("default entered time2");
		time1.addTime(time2);
		time1.displayTime("adding time1 and time2 final time");
	}

}

/**
 * a Time class that set values to instance variables ask user to input values
 * add two time values and display them
 * 
 * @author utsabn34
 * 
 */
class Time {
	private int hour = 0;
	private int minutes = 0;
	private int seconds = 0;
	private Scanner input = new Scanner(System.in);

	/**
	 * set values to instance variables
	 * 
	 * @param hour
	 * @param minutes
	 * @param seconds
	 */
	protected void setData(int hour, int minutes, int seconds) {
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;

	}

	/**
	 * ask user to enter values and assign them to instance variables
	 */
	protected void assignValue() {
		Boolean status = true;
		/* for correct input from user */
		do {
			try {
				System.out.println("Enter hour");
				this.hour = input.nextInt();
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
				System.out.println("Enter minutes");
				this.minutes = input.nextInt();
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
				System.out.println("Enter seconds");
				this.seconds = input.nextInt();
				status = true;
			} catch (Exception e) {
				System.out.println("Enter integer value");
				status = false;
				input.next();
			}

		} while (!status);

	}

	/**
	 * display the time value stored in instance variable
	 * 
	 * @param timeString
	 *            which indicate which time value it is going to print
	 */
	protected void displayTime(String timeString) {
		System.out.println(timeString + " : " + this.hour + ":" + this.minutes
				+ ":" + this.seconds);
	}

	/**
	 * adds two time value among which one is entered by user manually and
	 * another is set as parameter from object of Time
	 * 
	 * @param time
	 */
	protected void addTime(Time time) {
		this.seconds += time.seconds;
		this.minutes += time.minutes + this.seconds / 60;
		this.seconds %= 60;
		this.hour += time.hour + this.minutes / 60;
		this.minutes %= 60;
		if (this.hour > 24) {
			this.hour -= 24;
		}
	}
}