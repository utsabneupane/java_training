package com.lftechnology.java_training.jan5;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Compare if two arrays have the same content (in the same order)
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class SerialContentInArrayComparator {

	public static void main(String[] args) {
		StoreArray arrayStore1 = new StoreArray();
		arrayStore1.setValueForArray("Enter value for array1");

		StoreArray arrayStore2 = new StoreArray();
		arrayStore2.setValueForArray("Enter value for array2");
		// compares two array by passing one array as argument through bject
		arrayStore1.compareArrayValues(arrayStore2);

	}

}

/**
 * this class stores value in array and compares two array if they both have serial content or not
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
class StoreArray {
	private String[] arrayOfValues = new String[10];
	private final static Logger LOGGER = Logger.getLogger(StoreArray.class.getName());
	private Scanner input = new Scanner(System.in);
	private int countValuesInArray = 0;
	private final String Y = "y";
	private final String YES = "yes";

	public String[] getValue() {
		return this.arrayOfValues;
	}

	/**
	 * stores value in array and prompt every time if user wants to add new data until the range exceed
	 * 
	 * @param arrayNumber
	 *            which is a string that indicate in which array user in inserting values
	 */
	public void setValueForArray(String arrayNumber) {
		LOGGER.info(arrayNumber);
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
	 * compares two arrays value whether each position value is equivalent to respective array values or not
	 * 
	 * @param arrayOfValues2
	 *            an object of {@link StoreArray} too cpmare between two array values
	 */
	public void compareArrayValues(StoreArray arrayOfValues2) {
		Boolean serialContentStatus = true;
		if (this.countValuesInArray == arrayOfValues2.countValuesInArray) {
			label: for (int i = 0; i < this.countValuesInArray; i++) {
				for (int j = 0; j < this.countValuesInArray; j++) {
					if (!this.arrayOfValues[j].equalsIgnoreCase(arrayOfValues2.getValue()[j])) {
						serialContentStatus = false;
						break label;

					}
				}
			}
		}
		if (serialContentStatus) {
			LOGGER.info("Congras!!both array have same content in respective position!!!");
		} else {
			LOGGER.info("OOps!!both array have different content in respective position!!!");
		}
	}

}
