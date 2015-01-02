package com.lftechnology.java_training.dec31;

import java.util.Scanner;

/**
 * a program that contains a class called Distance that includes two private
 * data members feet (type int) and inches (type float). Use a method setData to
 * set values to instance variables. Provide a method display that displays the
 * feet and inches, a member function addDistance for adding two distances, and
 * a member function compareDistance for comparing two distances.
 * 
 * 
 * 
 */
class Distance {
	private int feet = 0;
	private float inches = 0;;
	private Scanner input = new Scanner(System.in);

	/**
	 * set values to instance of variable
	 */
	protected void setData(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}

	/**
	 * get values i.e feet and inches from user
	 */
	protected void assignValue() {
		Boolean status = false;
		/* takes only integer value for feet */
		do {
			try {
				System.out.println("enter feet value:");
				this.feet = input.nextInt();
				status = true;
			} catch (Exception e) {
				status = false;
				System.out.println("not a int value");
				input.next();
			}
		} while (!status);
		/* takes only float value for inches and should be less than 12 */
		do {
			try {
				do {
					System.out
							.println("enter inch value(should be less than 12):");
					this.inches = input.nextFloat();
					status = true;
				} while (this.inches >= 12);
			} catch (Exception e) {
				status = false;
				System.out.println("not a float value");
				input.next();
			}

		} while (!status);
	}

	/**
	 * displays values of feet and inch
	 */
	protected void display() {
		System.out.println("feet: " + this.feet);
		System.out.println("inches: " + this.inches);
	}

	/**
	 * add two distances inputted by user
	 */
	protected void addDistance(Distance distance1, Distance distance2) {
		this.inches += distance1.inches + distance2.inches;
		this.feet += distance1.feet + distance2.feet + this.inches / 12;
		this.inches %= 12;
		System.out.println("feet value: " + this.feet);
		System.out.println("inches value: " + this.inches);

	}

	/**
	 * compare distances entered by user
	 */
	protected void compareDistance(Distance distance) {
		float distance2 = distance.feet * 12 + distance.inches;
		float distance1 = this.feet * 12 + this.inches;
		if (distance2 > distance1) {
			System.out.println("distance2 is greater");
		} else if (distance1 > distance2) {
			System.out.println("distance1 is greater");
		} else {
			System.out.println("distance1 and distance 2 are equal");
		}

	}
}

/**
 * a program that takes two distance from user in the form of feet and inches
 * and add them and compare them
 * 
 * @author utsabn34
 * 
 */
public class DistanceCalculate {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Distance distance1 = new Distance();
		Distance distance2 = new Distance();
		Distance distanceResult = new Distance();
		int choiceForInput = 0;
		System.out.println("Distance Calculation");

		do {
			System.out.println("Enter 1.for assigning value to distance1"
					+ "\n 2. for assigning value to distance2"
					+ " \n 3.displaying value of distance1 "
					+ "\n 4.displaying value of distance2"
					+ "\n 5. for adding two distance \n "
					+ "6.for comparing two distance\n 9.for exit  ");
			choiceForInput = input.nextInt();
			switch (choiceForInput) {
			case 1:
				/* assign value to distance1 */
				distance1.assignValue();

				break;
			case 2:
				/* assign value to distance2 */
				distance2.assignValue();
				break;
			case 3:
				/* display value of distance1 */
				distance1.display();
				break;
			case 4:
				/* display value of distance2 */
				distance2.display();
				break;
			case 5:
				/* add value of distance1 and distance2 */
				distanceResult.addDistance(distance1, distance2);
				break;
			case 6:
				/* compare value of distance1 and distance2 */
				distance1.compareDistance(distance2);
				break;
			default:
				break;
			}

		} while (!(choiceForInput == 9));
	}

}
