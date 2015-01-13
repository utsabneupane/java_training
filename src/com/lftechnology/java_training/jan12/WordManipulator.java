package com.lftechnology.java_training.jan12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Takes the words in its argument list and prints out any duplicate words, the number of distinct words, and a list of the words with
 * duplicates eliminated. Hint: Try with HashSet and List implementation.
 * 
 * @author Utsab Neupane<utsabneupane@lftechnology.com>
 * 
 */
public class WordManipulator {
	private static final String[] WORDS_LIST = { "hello", "world", "how", "are", "you", "hello", "what", "are", "you", "doing" };
	private static final Logger LOGGER = Logger.getLogger(WordManipulator.class.getName());

	public static void main(String[] args) {
		List<String> listOfWords = new ArrayList<>(Arrays.asList(WORDS_LIST));
		LOGGER.log(Level.INFO, "list of words: {0}", listOfWords);
		Set<String> dupEliminatedWords = new HashSet<String>(listOfWords);
		Set<String> dupWords = new HashSet<>();
		Set<String> distinctWords = new HashSet<>();
		// get duplicate words
		dupWords = getDupWords(listOfWords);
		// get distinctWords
		distinctWords = getDistinctWords(listOfWords);
		LOGGER.log(Level.INFO, "duplicate eliminated words: {0}", dupEliminatedWords);
		LOGGER.log(Level.INFO, "duplicate words:{0}", dupWords);
		LOGGER.log(Level.INFO, "no of distinct words:{0} \n distinct words:{1}", new Object[] { distinctWords.size(), distinctWords });
	}

	/**
	 * This method returns {@link Set} of duplicate words from the list of words
	 * 
	 * @param list
	 *            an object of {@link List} from which duplicate words are extracted
	 * @return {@link Set} that contains duplicate words
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private static Set<String> getDupWords(List<String> list) {
		Set<String> dupWords = new HashSet<>();
		Set<String> tempWords = new HashSet<>();
		for (String words : list) {
			if (!tempWords.add(words)) {
				dupWords.add(words);
			}
		}
		return dupWords;
	}

	/**
	 * This method returns the {@link Set} of words that are distinct
	 * 
	 * @param list
	 *            an object of {@link List} from which distinct words are extracted
	 * @return distinct words
	 * @author Utsab Neupane<utsabneupane@lftechnology.com>
	 */
	private static Set<String> getDistinctWords(List<String> list) {
		Set<String> dupEliminatedWords = new HashSet<>(Arrays.asList(WORDS_LIST));
		dupEliminatedWords.removeAll(getDupWords(list));
		return dupEliminatedWords;
	}
}
