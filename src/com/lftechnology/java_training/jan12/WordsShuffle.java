package com.lftechnology.java_training.jan12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a program that uses Shuffle algorithm to print the words in its argument list in random order. Hint: Use List and Collection
 * 
 * @author Utsab Neupane<utsabneupane@lftechnology.com>
 * 
 */
public class WordsShuffle {
	private static final String[] WORDS_LIST = { "one", "two", "three", "four", "five", "six", "seven", "eight", "one" };
	private static final Logger LOGGER = Logger.getLogger(WordsShuffle.class.getName());

	public static void main(String[] args) {
		List<String> listOfWords = new ArrayList<>(Arrays.asList(WORDS_LIST));
		LOGGER.log(Level.INFO, "list of words: {0}", listOfWords);
		// shuffle list of words in random order
		Collections.shuffle(listOfWords);
		LOGGER.log(Level.INFO, "random order of words:{0}", listOfWords);
	}
}
