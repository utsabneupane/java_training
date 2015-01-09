package com.lftechnology.java_training.jan5;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Compare if two arrays have the same content (doesn't matter if they aren't in order)
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class ContentInArraysComparator {

	public static void main(String[] args) {
		ArrayStore arrayStore1 = new ArrayStore();
		arrayStore1.setValueForArray("Enter value for array1");

		ArrayStore arrayStore2 = new ArrayStore();
		arrayStore2.setValueForArray("Enter value for array2");

		arrayStore1.compareArrayValues(arrayStore2);
	}

}

/**
 * this class stores value in array and compares two array if they both have same content or not despite of random order
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
class ArrayStore {
	private String[] arrayOfValues = new String[10];
	private final static Logger LOGGER = Logger.getLogger(ArrayStore.class.getName());
	private Scanner input = new Scanner(System.in);
	private int countValuesInArray = 0;

	/**
	 * return array
	 * 
	 * @return <code> arrayOfValue<code> an array that stores values that user enters
	 */
	public String[] getValue() {
		return this.arrayOfValues;
	}

	/**
	 * ask user to insert value in array and prompt every time to add new value or not until it reaches its limit
	 * 
	 * @param arrayNumber
	 *            is a string which indicates in which array user is adding values
	 */
	public void setValueForArray(String arrayNumber) {
		LOGGER.info(arrayNumber);
		String addDataStatus = "";

		// loop until user added new values to array
		do {
			// checks if the limit of array exceeds
			try {
				LOGGER.info("enter Value  to store in array");
				this.arrayOfValues[this.countValuesInArray++] = input.next();

			} catch (ArrayIndexOutOfBoundsException | NoSuchElementException e) {
				LOGGER.log(Level.SEVERE, "cant add more data {0}", e);
				this.countValuesInArray--;
				break;
			}
			LOGGER.info("Do you want to add more[y/n]: ");
			addDataStatus = input.next();
		} while (((addDataStatus.equals(ConstantValuesContainer.Y)) || (addDataStatus.equals(ConstantValuesContainer.YES))));

	}

	/**
	 * compares value of two array passed through two object of {@link ArrayStore}
	 * 
	 * @param arrayOfValues2
	 *            an object of {@link ArrayStore}
	 */
	public void compareArrayValues(ArrayStore arrayOfValues2) {
		int contentSameCounter = 0;
		if (this.countValuesInArray == arrayOfValues2.countValuesInArray) {
			for (int i = 0; i < this.countValuesInArray; i++) {
				for (int j = 0; j < this.countValuesInArray; j++) {
					if (this.arrayOfValues[i].equalsIgnoreCase(arrayOfValues2.getValue()[j])) {
						contentSameCounter++;
						break;

					}
				}

			}
		}

		if (contentSameCounter == this.countValuesInArray) {
			LOGGER.info("both array have content same !!!");
		} else {
			LOGGER.info("both array have different content !!!");
		}
	}

}