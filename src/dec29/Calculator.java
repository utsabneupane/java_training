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
		String result = "";
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
				System.out.print("Enter second value: ");
				valString = input.next();
				check = isFloat(valString);

			} while (!check);
			val2 = Float.parseFloat(valString);
			valString = "";

			/* calculation operation */
			switch (symbol) {
			case "+":
				result = sumOfValues(val1, val2);
				break;
			case "-":
				result = substractOfValues(val1, val2);
				break;
			case "*":
				result = productOfValues(val1, val2);
				break;
			case "/":
				result = divisionOfValues(val1, val2);
				break;
			case "%":
				result = modOfValues(val1, val2);
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
		String[] listOfOperators = { "+", "-", "*", "/", "%" };
		Boolean status = false;
		int lengthOfOperator = listOfOperators.length;
		for (int i = 0; i < lengthOfOperator; i++) {

			if (str.equals(listOfOperators[i])) {
				status = true;
				break;
			} else {

				status = false;
			}
		}
		return status;
	}

	/**
	 * return sum of two values
	 * 
	 * @param val1
	 * @param val2
	 * @return result
	 */
	public static String sumOfValues(float val1, float val2) {

		/* sum of two values */
		return Float.toString(val1 + val2);
	}

	/**
	 * return difference of two values
	 * 
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static String substractOfValues(float val1, float val2) {

		/* difference of two values */

		return Float.toString(val1 - val2);

	}

	/**
	 * return product of two values
	 * 
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static String productOfValues(float val1, float val2) {
		/* product of two values */
		return Float.toString(val1 * val2);

	}

	/**
	 * return of division of two values
	 * 
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static String divisionOfValues(float val1, float val2) {

		/* division of two values */
		if (val2 == 0) {
			return ("val2 cannot be zero");
		} else {
			return Float.toString(val1 / val2);
		}

	}

	/**
	 * return modulus of two values
	 * 
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static String modOfValues(float val1, float val2) {

		/* modulus of two values */

		return Float.toString(val1 % val2);
	}
}
