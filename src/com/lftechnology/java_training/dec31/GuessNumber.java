package com.lftechnology.java_training.dec31;

import java.util.Scanner;

/**
 * a Guessing a number game application: User will select the guessing value
 * from the keyboard and application will generate a random no between 1 and
 * 100. Check if the guess value matched with random no. or not, if matched show
 * the guessing value, random value and the no. of attempts.
 * 
 * @author utsabn34
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
					randomNum = randomNumGen();
				}
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
			System.out.println("Do you want to play again[y/n]:");
			continuePlay = input.next();

		} while ((continuePlay.equals("y")) || (continuePlay.equals("yes")));
	}

	/**
	 * generates random number between 1 and 100
	 * 
	 * @return randomNum
	 */
	private static int randomNumGen() {
		int randomNum = 0;
		/* generated random number */
		randomNum = (int) (Math.random() * 100);
		if (randomNum == 1 || randomNum == 100) {
			randomNumGen();
		}
		return randomNum;
	}

	/**
	 * checks whether inputted number is or not and checks the user inputted
	 * values falls between 1 and 100 or not
	 * 
	 * @param inputVal
	 * @return if inputVal can be parsed to {@link Integer}
	 */
	private static int isInt(String inputVal) {
		int temp = 0;
		try {
			temp = Integer.parseInt(inputVal);
			/* checks if inputted value falls between 1 and 100 or not */
			if (temp >= 100 || temp <= 1) {
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
