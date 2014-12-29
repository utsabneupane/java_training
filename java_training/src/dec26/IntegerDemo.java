package dec26;

/*
 * a program that accepts integer value from user and check its integer range 
 * limit if accepted its displays value entered by user else its throws the 
 * exception  
 */

import java.util.Scanner;

/**
 * 
 * @author utsabn34
 * 
 */
public class IntegerDemo {

	/* initialization of Scanner object for taking input */
	private static Scanner sc;

	public static void main(String[] args) {
		/* integer variable to store value entered by user */
		int intValue;
		sc = new Scanner(System.in);

		try {
			System.out.println("Enter integer value: ");
			intValue = sc.nextInt();
			System.out
					.println("Your value is within range of -2147483648 to 2147483647 which is: "
							+ intValue);

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("the limit of -2147483648 to 2147483647 exceed");
		}

	}

}
