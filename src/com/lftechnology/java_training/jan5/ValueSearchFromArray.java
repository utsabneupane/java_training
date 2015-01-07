package com.lftechnology.java_training.jan5;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Search for a specific value in an array.
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class ValueSearchFromArray {
	private static final Logger LOGGER = Logger.getLogger(ValueSearchFromArray.class.getName());
	private static Scanner input = new Scanner(System.in);
	private static final int EXIT_KEY = 3;

	public static void main(String[] args) {
		// creates new object to search value from array
		SearchValue searchValue = new SearchValue();
		int choice = 0;
		try {
			do {
				LOGGER.info("Enter your choice:\n 1. store value in array" + "\n 2. enter value to search from array ");
				choice = input.nextInt();

				switch (choice) {
				case 1:
					searchValue.getArray();
					break;
				case 2:
					searchValue.searchValueInArray();
					break;

				default:
					break;
				}
			} while (!(choice == EXIT_KEY));
		} finally {
			input.close();
		}

	}
}

/**
 * This class ask user to enter value to store in array when they finished adding then asked user to enter value to be searched in array and
 * display whether the value is in array or not
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
class SearchValue {
	private String valueToSearch = "";
	private String[] arrayOfValues = new String[10];
	private int countValuesInArray = 0;
	private Scanner input = new Scanner(System.in);
	private final static Logger LOGGER = Logger.getLogger(SearchValue.class.getName());
	private final String Y = "y";
	private final String YES = "yes";

	/**
	 * get value from user to store in array
	 * 
	 */
	public void getArray() {
		String exitStatus = "";

		// loop until user added new values to array
		do {
			// checks if the limit of array exceeds
			try {
				LOGGER.info("enter Value to to store in array");
				this.arrayOfValues[this.countValuesInArray++] = this.input.next();

			} catch (Exception e) {
				this.countValuesInArray--;
				LOGGER.info("cant add more data");
				break;
			}

			LOGGER.info("Do you want to add more[y/n]: ");
			exitStatus = this.input.next();
		} while (((exitStatus.equals(Y)) || (exitStatus.equals(YES))));

	}

	/**
	 * search if the value entered by user is in array or not
	 * 
	 */
	public void searchValueInArray() {
		String resultOfSearch = "";
		// get input to be searched in array from user

		LOGGER.info("Enter value to search from array");
		this.valueToSearch = this.input.next();

		for (int i = 0; i < this.countValuesInArray; i++) {
			if (this.arrayOfValues[i].equals(this.valueToSearch)) {
				resultOfSearch = "Congratss!!! searched value is in array !!";
				break;

			} else {
				resultOfSearch = "Sorry,not found in array!!!";
			}
		}
		LOGGER.info(resultOfSearch);
	}
}
