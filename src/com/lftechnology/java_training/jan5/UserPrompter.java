package com.lftechnology.java_training.jan5;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * a program that constantly prompts the user to enter something (using the
 * Scanner class) until the user enters a specific word (such as quit for
 * example)
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class UserPrompter {
	private static final Logger LOGGER = Logger.getLogger(UserPrompter.class
			.getName());
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		valueCheck();
	}

	/**
	 * it takes values from user and checks to specified value and prompt until
	 * user enter specified that value
	 */
	private static void valueCheck() {
		try {
			// loop until user enter specified word
			do {
				LOGGER.info("Input any value(type \"quit\" to quit) ");
			} while (!input.next().equalsIgnoreCase("quit"));
		} finally {
			input.close();
		}
	}
}
