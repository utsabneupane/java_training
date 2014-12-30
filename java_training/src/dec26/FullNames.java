package dec26;

import java.util.Scanner;

/**
 * a program that accepts initial, first name, middle name, last name from user
 * and display it as a full name
 * 
 * @author utsabn34
 * 
 */
public class FullNames {

	/* initialization of Scanner object for taking input */
	private static Scanner input;

	public static void main(String[] args) {

		/* welcome object creation of StringBuilder class to store full name */
		StringBuilder fullNameStringBuilder = new StringBuilder();

		/*
		 * initialization of variable for initial, first name, middle name, last
		 * name and space
		 */
		String space = " ";
		String dot = ".";
		String initial = "";
		String fName = "";
		String mName = "";
		String lName = "";

		/* getting input from user */
		input = new Scanner(System.in);
		System.out.println("enter initial");
		initial = (input.nextLine()).trim();
		if (!(initial.equals(""))) {
			fullNameStringBuilder.append(initial);
			fullNameStringBuilder.append(dot);

		}

		System.out.println("enter firstname");
		fName = input.nextLine().trim();
		if (!(fName.equals(""))) {
			fullNameStringBuilder.append(fName);
		}
		System.out.println("enter middlename");
		mName = input.nextLine().trim();
		if (!(mName.equals(""))) {
			fullNameStringBuilder.append(space);
			fullNameStringBuilder.append(mName);
		}
		System.out.println("enter last name");
		lName = input.nextLine().trim();
		if (!(lName.equals(""))) {
			fullNameStringBuilder.append(space);
			fullNameStringBuilder.append(lName);

		}
		System.out.println("Your name is " + fullNameStringBuilder);

	}

}
