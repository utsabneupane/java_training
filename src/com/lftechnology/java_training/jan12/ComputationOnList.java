package com.lftechnology.java_training.jan12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Create an array list with 49 Integer objects containing the numbers 1 through 49. It then randomly shuffles the list and selects the
 * first 6 values from the shuffled list. Finally, it sorts the selected values and prints them out. Hint: Use ArrayList,
 * Collections.shuffle(), ArrayList.subList(), and Collection.sort().
 * 
 * @author Utsab Neupane<utsabneupane@lftechnology.com>
 * 
 */
public class ComputationOnList {
	private static final Logger LOGGER = Logger.getLogger(ComputationOnList.class.getName());
	private static final int EXTRACT_VALUE = 6;

	public static void main(String[] args) {
		// add value from 1 to 49 in a list
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 49; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		LOGGER.log(Level.INFO, "shuffled value of list: {0}", list);
		// this method takes first user wanted values from list sort them and display those values
		List<Integer> sortedList = list.subList(0, EXTRACT_VALUE);
		Collections.sort(sortedList);
		LOGGER.log(Level.INFO, "sorted order of extracted value: {0}", sortedList);
	}
}
