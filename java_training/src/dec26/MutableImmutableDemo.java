package dec26;

/*
 * a program that contains greeting object Of String class and welcome object 
 * of StringBuilder class 
 * Now after concatinating few string on both the object it should display the updated 
 * value of both the object 
 */

import java.util.Scanner;

/**
 * 
 * @author utsabn34
 * 
 */
public class MutableImmutableDemo {

	/* initialization of Scanner object for taking input */
	private static Scanner sc;

	public static void main(String[] args) {

		/* greeting object creation of String class */
		String greeting = new String("hello world ");

		/* welcome object creation of StringBuilder class */
		StringBuilder welcome = new StringBuilder("new world ");

		System.out.println("initial value of greeting: " + greeting);
		System.out.println("initial value of welcome: " + welcome);

		sc = new Scanner(System.in);
		System.out.println("enter new string to add in greeting suffix: ");
		String inputGreeting = sc.nextLine();

		System.out.println("enter new string to add in welcome suffix: ");
		String inputWelcome = sc.nextLine();

		/* process of adding string on a suffix */
		greeting.concat(inputGreeting);
		// greeting= greeting.concat(inputGreeting); /*done in this way*/

		welcome.append(inputWelcome);

		System.out.println("After adding String in greeting: " + greeting);
		System.out.println("after adding String in welcome: " + welcome);

	}

}
