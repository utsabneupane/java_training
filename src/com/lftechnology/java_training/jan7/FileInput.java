package com.lftechnology.java_training.jan7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Write a program called FileInput to read an int, a double, and a String form a text file called "in.txt", and produce the following
 * output: (Hint use Scanner to read from file) a. The integer read is 12 b. The floating point number read is 33.44 c. The String read is
 * "Peter" d. Hi! Peter, the sum of 12 and 33.44 is 45.44
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class FileInput {
	private static int[] intReadValue = new int[10];
	private static double[] doubleReadValue = new double[10];
	private static String[] stringReadValue = new String[10];
	private static int intValueCounter = 0;
	private static int doubleValueCounter = 0;
	private static int stringValueCounter = 0;
	private static TrainingConstantsUtility constantValues = new TrainingConstantsUtility();

	public static void main(String[] args) {
		// read values from file
		readFromFile();
		// display values written in file to console
		displayValueFromFile();
	}

	/**
	 * read data from file and store it according to its type
	 */
	private static void readFromFile() {
		Scanner inputFile = null;

		try {
			inputFile = new Scanner(new BufferedReader(new FileReader("in.txt")));
			// loop until the value finishes
			while (inputFile.hasNext()) {
				// check if value is int
				if (inputFile.hasNextInt()) {
					intReadValue[intValueCounter++] = Integer.parseInt(inputFile.next());
					// check if value is double
				} else if (inputFile.hasNextDouble()) {
					doubleReadValue[doubleValueCounter++] = Double.parseDouble(inputFile.next());
				} else {
					stringReadValue[stringValueCounter++] = inputFile.next();

				}
			}

		} catch (Exception e) {
			constantValues.LOGGER.info("file not found" + e);

		} finally {
			inputFile.close();
		}

	}

	/**
	 * display value stored in different variable which are according to data types
	 */
	private static void displayValueFromFile() {
		constantValues.LOGGER.info("\na.The integer read is " + displayIntegerValue() + "\nb.The doubling point number read is "
				+ displayDoubleValue() + "\nc.the string read is " + displayStringValue() + "\nd.Hi! " + displayStringValue() + ","
				+ "The sum of " + displayIntegerValue() + " and " + displayDoubleValue() + " is " + displaySumOfNumbers());

	}

	/**
	 * display stored value in {@link Integer} array taken from file
	 */
	private static String displayIntegerValue() {
		int tempCounter = intValueCounter;
		StringBuilder tempIntValues = new StringBuilder();
		do {
			tempIntValues.append(intReadValue[--tempCounter]);
			if (tempCounter != 0) {
				tempIntValues.append(",");
			}
		} while (tempCounter != 0);
		// changed from StringBuilder to String
		return tempIntValues + "";
	}

	/**
	 * display stored value in {@link Double} array taken from file
	 */
	private static String displayDoubleValue() {
		int tempCounter = doubleValueCounter;
		StringBuilder tempDoubleValues = new StringBuilder();
		do {
			tempDoubleValues.append(doubleReadValue[--tempCounter]);
			if (tempCounter != 0) {
				tempDoubleValues.append(",");
			}
		} while (tempCounter != 0);
		// changed from StringBuilder to String
		return tempDoubleValues + "";
	}

	/**
	 * display stored value in {@link String} array taken from file
	 */
	private static String displayStringValue() {
		int tempCounter = stringValueCounter;
		StringBuilder tempStringValues = new StringBuilder();
		do {
			tempStringValues.append("\"" + stringReadValue[--tempCounter] + "\"");
			if (tempCounter != 0) {
				tempStringValues.append(",");
			}
		} while (tempCounter != 0);
		// changed from StringBuilder to String
		return tempStringValues + "";
	}

	/**
	 * display sum of values of {@link Integer} array and {@link Double} array
	 */
	private static String displaySumOfNumbers() {
		double sumOfValues = 0;
		do {
			sumOfValues += intReadValue[--intValueCounter] + doubleReadValue[--doubleValueCounter];
		} while (intValueCounter != 0 && doubleValueCounter != 0);
		// changed from Double to String
		return Double.toString(sumOfValues);
	}
}
