package dec26;

/*
 * a program that accepts initial, first name, middle name, last name from user and display it as a full name  
 */

import java.util.Scanner;

/**
 * 
 * @author utsabn34
 * 
 */
public class FullNaming {

	/* initialization of Scanner object for taking input */
	private static Scanner sc;

	public static void main(String[] args) {

		/* welcome object creation of StringBuilder class to store full name */
		StringBuilder fullName = new StringBuilder();

		/*
		 * initialization of variable for initial, first name, middle name, last
		 * name and space
		 */
		String space = " ";
		String dot = ".";
		String initial, fName, mName, lName;

		/* getting input from user */
		sc = new Scanner(System.in);
		System.out.println("enter initial");
		initial = sc.nextLine();
		System.out.println("enter firstname");
		fName = sc.nextLine();
		System.out.println("enter middlename");
		mName = sc.nextLine();
		System.out.println("enter last name");
		lName = sc.nextLine();

		/* append all tags of name using white spaces */
		fullName.append(initial + dot + fName + space + mName + space + lName);
		System.out.println("Your name is " + fullName);

	}

}
