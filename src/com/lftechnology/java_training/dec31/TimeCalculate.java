package com.lftechnology.java_training.dec31;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a class called Time with three attributes hours, minutes, and seconds.
 * Use appropriate constructor (s) to initialize instance variables. Also, use a
 * display method to display the time in hh:mm:ss format. Modify the class to
 * add two time objects that correctly results in addition of times.
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class TimeCalculate {

	public static void main(String[] args) {
		TimeUtility presentTime = new TimeUtility();
		TimeUtility newTime = new TimeUtility();
		presentTime.assignValue();
		presentTime.displayTime("present time");

		newTime.displayTime("default entered new time");
		presentTime.addTime(newTime);
		presentTime
				.displayTime("adding present time and new time to final time");
	}

}

/**
 * a Time class that set values to instance variables ask user to input values
 * add two time values and display them
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
class TimeUtility {
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
		Boolean inputFormat = true;
		/* for correct input from user */
		do {
			try {
				System.out.println("Enter hour");
				this.hour = input.nextInt();
				if (this.hour < 0) {
					throw new Exception("hour cannot be less than 0");
				}
				if (this.hour > 24) {
					throw new Exception("hour cannot be greater than 24");
				}
				inputFormat = true;
			} catch (InputMismatchException e) {
				System.out.println("Enter integer value");
				inputFormat = false;
				input.next();
			} catch (Exception e) {
				System.out.println(e);
				inputFormat = false;

			}

		} while (!inputFormat);
		/* for correct input from user */
		do {
			try {
				System.out.println("Enter minutes");
				this.minutes = input.nextInt();
				if (this.minutes < 0) {
					throw new Exception("minutes cannot be less than 0");
				}
				if (this.minutes > 60) {
					throw new Exception("minutes cannot be greater than 60");
				}
				inputFormat = true;
			} catch (InputMismatchException e) {
				System.out.println("Enter integer value");
				inputFormat = false;
				input.next();
			} catch (Exception e) {
				System.out.println(e);
				inputFormat = false;

			}

		} while (!inputFormat);
		/* for correct input from user */
		do {
			try {
				System.out.println("Enter seconds");
				this.seconds = input.nextInt();
				if (this.seconds < 0) {
					throw new Exception("second cannot be less than 0");
				}
				if (this.seconds > 60) {
					throw new Exception("seconds cannot be greater than 60");
				}
				inputFormat = true;
			} catch (InputMismatchException e) {
				System.out.println("Enter integer value");
				inputFormat = false;
				input.next();
			} catch (Exception e) {
				System.out.println(e);
				inputFormat = false;

			}

		} while (!inputFormat);

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
	protected void addTime(TimeUtility time) {
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