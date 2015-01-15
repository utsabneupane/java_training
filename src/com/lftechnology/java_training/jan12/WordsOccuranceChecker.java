package com.lftechnology.java_training.jan12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Suppose you want to know which words in the argument list occur only once and which occur more than once, but you do not want any
 * duplicates printed out repeatedly. This effect can be achieved by generating two sets one containing every word in the argument list and
 * the other containing only the duplicates. The words that occur only once are the set difference of these two sets
 * 
 * @author Utsab Neupane<utsabneupane@lftechnology.com>
 * 
 */
public class WordsOccuranceChecker {
	private static final String[] WORDS_LIST = { "hello", "world", "how", "are", "you", "hello", "what", "are", "you", "doing" };
	private static final Logger LOGGER = Logger.getLogger(WordsOccuranceChecker.class.getName());

	public static void main(String[] args) {
		List<String> listOfWords = new ArrayList<>(Arrays.asList(WORDS_LIST));
		LOGGER.log(Level.INFO, "list of words: {0}", listOfWords);
		// list no of occurance of words
		Map<String, Integer> wordList = countOccurance(listOfWords);
		LOGGER.log(Level.INFO, "list of occurance of words: {0}", wordList);
	}

	/**
	 * This method count no of occurance of words in a {@link List}
	 * 
	 * @param list
	 *            an object of {@link List}
	 * @return {@link Map} that contains words with no of occurance
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private static Map<String, Integer> countOccurance(List<String> list) {
		Map<String, Integer> wordList = new HashMap<String, Integer>();
		for (String words : list) {
			wordList.put(words, Collections.frequency(list, words));
		}
		return wordList;
	}
}
