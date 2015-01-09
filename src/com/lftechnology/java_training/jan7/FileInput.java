package com.lftechnology.java_training.jan7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a program called FileInput to read an int, a double, and a String form a text file called "in.txt", and produce the following
 * output: (Hint use Scanner to read from file)
 * <ol>
 * <li>The integer read is 12</li>
 * <li>The floating point number read is 33.44</li>
 * <li>The String read is"Peter"</li>
 * <li>Hi! Peter, the sum of 12 and 33.44 is 45.44</li>
 * </ol>
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
	private static final Logger LOGGER = Logger.getLogger(FileInput.class.getName());
	private static final String fileName = "in.txt";

	public static void main(String[] args) {
		// read values from file
		boolean readStatus = readFromFile();
		if (readStatus) {
			// display values written in file to console
			displayValueFromFile();
		}
	}

	/**
	 * read data from file and store it according to its type
	 */
	private static boolean readFromFile() {
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(new BufferedReader(new FileReader(fileName)));
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
			return true;
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "file not found {0}", e);
			return false;

		} finally {
			inputFile.close();
		}

	}

	/**
	 * display value stored in different variable which are according to data types
	 */
	private static void displayValueFromFile() {
		String intValue = displayIntegerValue();
		String doubleValue = displayDoubleValue();
		String stringValue = displayStringValue();
		String displaySum = displaySumOfNumbers();

		LOGGER.log(
				Level.INFO,
				"\na.The integer read is {0} \nb.The doubling point number read is {1} \nc.the string read is {2} \nd.Hi! {2} The sum of {0}  and {1}  is {3} ",
				new Object[] { intValue, doubleValue, stringValue, displaySum });

	}

	/**
	 * return stored value from {@link Integer} array taken from file
	 * 
	 * @return all values from {@link Integer} concatinated in a {@link String} separated by comma
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
	 * return stored value from {@link Double} array taken from file
	 * 
	 * @return all values from {@link Double} concatinated in a {@link String} separated by comma
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
	 * return stored value from {@link String} array taken from file
	 * 
	 * @return all values from {@link String} concatinated in a {@link String} separated by comma
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
