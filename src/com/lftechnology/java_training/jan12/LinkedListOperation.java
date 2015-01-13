package com.lftechnology.java_training.jan12;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <ul>
 * <li>a. Create a linked list named one and two.</li>
 * <li>b. Add some elements to both one (one, two, three, four, five) and two (six, seven, eight, nine, and ten).</li>
 * <li>c. Merge the words from two into one.</li>
 * <li>d. Remove every second word from two.</li>
 * <li>e. Remove all words in two from one.</li>
 * <li>f. Print the value after each operation.</li>
 * </ul>
 * 
 * @author Utsab Neupane<utsabneupane@lftechnology.com>
 * 
 */
public class LinkedListOperation {
	private static final Logger LOGGER = Logger.getLogger(LinkedListOperation.class.getName());
	private static final String[] WORDS_LIST_FIRST = { "one", "two", "three", "four", "five" };
	private static final String[] WORDS_LIST_SECOND = { "six", "seven", "eight", "nine", "ten" };

	public static void main(String[] args) {
		List<String> one = new LinkedList<String>();
		List<String> two = new LinkedList<String>();
		insertValuesToList(one, WORDS_LIST_FIRST);
		LOGGER.log(Level.INFO, "list of one:{0}", one);
		insertValuesToList(two, WORDS_LIST_SECOND);
		LOGGER.log(Level.INFO, "list of two:{0}", two);
		one.addAll(two);
		LOGGER.log(Level.INFO, "After mergin two to one :\n list of one:{0}", one);
		removeEverySecondWord(two);
		LOGGER.log(Level.INFO, "list of two:{0}", two);
		one.removeAll(two);
		LOGGER.log(Level.INFO, "list of one:{0}", one);

	}

	/**
	 * add list of words in list according to Word list they pass on as a parameter
	 * 
	 * @param list
	 *            an object of {@link List} where list of values to be inserted
	 * @param wordsList
	 *            an object of {@link String} that contains list of values to be inserted
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private static void insertValuesToList(List<String> list, String[] wordsList) {
		for (String words : wordsList) {
			list.add(words);
		}
	}

	/**
	 * remove every second word from the list
	 * 
	 * @param list
	 *            an object of {@link List}
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private static void removeEverySecondWord(List<String> list) {
		int size = list.size();
		for (int i = 1; i <= size / 2; i++) {
			list.remove(i);
		}
	}
}
