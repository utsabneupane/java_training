package com.lftechnology.java_training.dec31;

import java.util.Scanner;

/**
 * a Guessing a number game application: User will select the guessing value
 * from the keyboard and application will generate a random no between 1 and
 * 100. Check if the guess value matched with random no. or not, if matched show
 * the guessing value, random value and the no. of attempts.
 * 
 * @author UtsabNeupane<utsabneupane@lftechnology.com>
 * 
 */
public class GuessNumber {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int randomNum = 0;
		int guessNum = 0;
		int countAttempt = 0;
		String continuePlay = "";
		do {
			do {
				/* only generates new random number if user guessed it right */
				if (randomNum == guessNum) {
					randomNum = randomNumGen(1, 100);

				}
				System.out.println(randomNum);
				System.out.println("Enter your Guessing number from 1-100");
				guessNum = isInt(input.next());

				/* giving hint to user */
				if (guessNum < randomNum) {
					System.out.println("random num is greater than ur guess");
				} else if (guessNum > randomNum) {
					System.out.println("random num is less than your guess");
				} else {
					System.out.println("");
				}

				/* count no of attempt user tried */
				countAttempt++;
			} while (!(guessNum == randomNum));

			System.out.println("no of attempt: " + countAttempt);
			countAttempt = 0;
			System.out.println("Do you want to play again[y/n]:");
			continuePlay = input.next();

		} while ((continuePlay.equals("y")) || (continuePlay.equals("yes")));
	}

	/**
	 * generates random number between 1 and 100
	 * 
	 * @return randomNum
	 */
	private static int randomNumGen(int downLimit, int upLimit) {
		int randomNum = 0;
		do {
			randomNum = (int) (Math.random() * upLimit);
		} while (randomNum == downLimit || randomNum == downLimit);
		return randomNum;
	}

	/**
	 * checks whether inputted number is or not and checks the user inputted
	 * values falls between 1 and 100 or not
	 * 
	 * @param inputVal
	 *            that carries input value entered by user
	 * @return if inputVal can be parsed to {@link Integer}
	 */
	private static int isInt(String inputVal) {
		int tempVal = 0;
		try {
			tempVal = Integer.parseInt(inputVal);
			/* checks if inputted value falls between 1 and 100 or not */
			if (tempVal >= 100 || tempVal <= 1) {
				throw new Exception("range should be in between 1 and 100");
			}

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("enter Integer value");
			inputVal = input.next();
		}
		return Integer.parseInt(inputVal);
	}
}
