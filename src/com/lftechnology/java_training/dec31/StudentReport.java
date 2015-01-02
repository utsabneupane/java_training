package com.lftechnology.java_training.dec31;

import java.util.Scanner;

/**
 * a program that has student profile and calculates percentage and GPA of 5
 * students.
 * 
 * @author utsabn34
 * 
 */
public class StudentReport {

	public static void main(String[] args) {

		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		/* get data from user */
		student1.getData();
		/* user inserted data */
		student2.setData("Hari Sharma", "BE II/II", "95/BCT/067", new float[] {
				56, 67, 54, 78, 89 });
		student3.setData("Sita Paudel", "BE I/I", "34/BEX/066", new float[] {
				89, 67, 78, 89, 90 });
		student4.setData("Suresh Thapa", "BA I", "897/BA/065", new float[] {
				56, 54, 43, 56, 67 });
		student5.setData("Rita Shrestha", "BArch IV/II", "BArch/67/070",
				new float[] { 45, 44, 67, 78, 76 });
		/* display info and result of students */
		/* first student */
		student1.displayData();
		student1.calculatePercentGpa();
		/* second student */
		student2.displayData();
		student2.calculatePercentGpa();
		/* third student */
		student3.displayData();
		student3.calculatePercentGpa();
		/* fourth student */
		student4.displayData();
		student4.calculatePercentGpa();
		/* fifth student */
		student5.displayData();
		student5.calculatePercentGpa();

	}
}

/**
 * Student class has following attributes: name, class, rollnum, and marks
 * obtained in 5 subjects.
 * 
 * @author utsabn34
 * 
 */
class Student {
	/* Initialization of variables */
	private String name = "";
	private String className = "";
	private String rollNum = "";
	private float[] marks = new float[5];
	private Scanner input = new Scanner(System.in);

	/**
	 * sets value to instance variable of class
	 * 
	 * @param name
	 * @param className
	 * @param rollNum
	 * @param marks
	 */
	protected void setData(String name, String className, String rollNum,
			float[] marks) {
		this.name = name;
		this.className = className;
		this.rollNum = rollNum;
		this.marks = marks;
	}

	/**
	 * assign value to instance variable for class
	 */
	protected void getData() {
		Boolean status = true;
		System.out.print("Enter your Name: ");
		this.name = input.nextLine();
		System.out.print("enter your class: ");
		this.className = input.nextLine();
		System.out.print("enter your roll No: ");
		this.rollNum = input.nextLine();
		for (int i = 0; i < 5; i++) {
			/* for correct input from user */
			do {
				try {
					System.out.print("enter marks of subject" + (i + 1) + ": ");
					this.marks[i] = input.nextFloat();
					status = true;
				} catch (Exception e) {
					System.out.println("Enter number value");
					status = false;
					input.next();
				}

			} while (!status);

		}
		System.out.println("");

	}

	/**
	 * display information of student
	 */
	protected void displayData() {
		System.out.println("Name: " + name);
		System.out.println("ClassName: " + className);
		System.out.println("Roll no: " + rollNum);

	}

	/**
	 * calculate percentage and gpa from student obtained marks
	 */
	protected void calculatePercentGpa() {
		float totalMarks = 0;
		float percentage = 0;
		String gpa = "";
		float gpaValue = 0;
		for (int i = 0; i < 5; i++) {

			/* calculate total marks */
			totalMarks += this.marks[i];
		}
		/* calculate total percentage */
		percentage = (totalMarks / 5);
		/* calculate gpaValue */
		gpaValue = (percentage * 4) / 100;
		/* define range of gpa */
		if (gpaValue >= 3.5) {
			gpa = "A";
		} else if (gpaValue >= 3.2) {
			gpa = "B";
		} else if (gpaValue >= 3.0) {
			gpa = "C";
		} else if (gpaValue >= 2.5) {
			gpa = "D";
		} else if (gpaValue >= 2.0) {
			gpa = "E";
		} else {
			gpa = "F";
		}
		System.out.println("Your total percentage is: " + percentage
				+ " with gpa value:" + gpaValue);
		System.out.println("You got " + gpa + " Gpa");
		System.out.println("");
	}
}