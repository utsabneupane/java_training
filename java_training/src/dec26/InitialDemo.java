package dec26;

import java.util.Scanner;

/**
 * 
 * a program that accepts full name as an input from user and display only its
 * initialStringBuilder from that full name
 * 
 * @author utsabn34
 * 
 */
public class InitialDemo {

	/* initialStringBuilderization of Scanner object for taking input */
	private static Scanner input;

	public static void main(String[] args) {

		/* variable to store initialStringBuilder name */
		StringBuilder initialStringBuilder = new StringBuilder();
		input = new Scanner(System.in);

		/* input taken from user and stored in variable */
		System.out.println("Enter your full name: ");
		String fullName = input.nextLine();
		int len = fullName.length();
		int i;
		for (i = 0; i < len; i++) {

			/* getting character before first dot or space in name */
			if ((fullName.charAt(i) == '.') || (fullName.charAt(i) == ' ')) {
				break;
			} else {

				/*
				 * each character before '.' or ' ' is stored as
				 * initialStringBuilder
				 */
				initialStringBuilder.append(fullName.charAt(i));
			}
		}

		System.out.println("Your initial is: " + initialStringBuilder);

	}

}
