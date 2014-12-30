package dec29;

import java.util.Scanner;

/**
 * a program using switch statement to develop a simple calculator for +, -, *,
 * /, and % operators.
 * 
 * @author utsabn34
 * 
 */

public class Calculator {
	private static Scanner input;

	public static void main(String[] args) {
		/* variable intialization */
		input = new Scanner(System.in);
		float val1 = 0;
		float val2 = 0;
		float result = 0;
		String valString = "";
		String symbol = "";
		Boolean status = true;
		Boolean check = true;

		System.out.println("A simple Calculator");
		System.out.println("symbol osed for calculation are: +, -,*, /, % ");
		while (status) {
			/* check whether entered value is float or not */
			do {
				System.out.print("enter 1st value: ");
				valString = input.next();
				check = isFloat(valString);
			} while (!check);
			val1 = Float.parseFloat(valString);
			valString = "";

			/*
			 * check whether entered operator falls under the specified symbol
			 * or not
			 */
			do {
				System.out.print("Enter operator symbol to proceed on values:");
				symbol = input.next();
				check = isOperator(symbol);
			} while (!check);

			/* check whether entered value is float or not */
			do {
				System.out.print("Enter seond value: ");
				valString = input.next();
				check = isFloat(valString);

			} while (!check);
			val2 = Float.parseFloat(valString);
			valString = "";

			/* calculation operation */
			switch (symbol) {
			case "+":
				result = val1 + val2;
				break;
			case "-":
				result = val1 - val2;
				break;
			case "*":
				result = val1 * val2;
				break;
			case "/":
				result = val1 / val2;
				break;
			case "%":
				result = val1 % val2;
				break;
			default:
				System.out.println("enter valid symbol");
				break;

			}
			System.out.println("output: " + result);
			System.out.print("Do you want to continue[y/n]");
			String option = input.next();
			if (option.equals("y") || option.equals("yes")) {
				status = true;
			} else {
				status = false;
			}
		}

	}

	/**
	 * 
	 * checks whether this parameter is float or not
	 * 
	 * @author utsabn34
	 * @param str
	 * @return <code>true</code> if the string can be parsed to {@link Float}
	 *         otherwise returns <code>false</code>.
	 */

	public static boolean isFloat(String str) {
		try {
			Float.parseFloat(str);
		} catch (NumberFormatException nfe) {
			System.out.println("not a float value ");
			return false;
		}
		return true;
	}

	/**
	 * 
	 * checks whether this parameter is valid symbol or not
	 * 
	 * @author utsabn34
	 * @param str
	 * @return <code>true</code> if the entered symbol falls under symbol
	 *         specified otherwise returns <code>false</code>.
	 */
	public static boolean isOperator(String str) {
		if ((str.equals("+")) || (str.equals("-")) || (str.equals("*"))
				|| (str.equals("/")) || (str.equals("%"))) {
			return true;
		} else {
			System.out.println("not a specified symbol");
			return false;
		}
	}

}
