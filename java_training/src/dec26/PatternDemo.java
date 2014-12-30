package dec26;

import java.util.Scanner;

/**
 * a program that accepts name of cities separated by white space along with
 * character sequence to search city as an input from user and display the city
 * that falls under that character sequence
 * 
 * @author utsabn34
 * 
 */
public class PatternDemo {
	/* initialization of Scanner object for taking input */
	private static Scanner input;

	public static void main(String[] args) {

		/* variable initialization for cities,pattern, start point, end point */
		String cities = "";
		String pattern = "";
		int srt = 0;
		int end = 0;
		input = new Scanner(System.in);

		/* takes input from user and store city in cities */
		System.out.println("enter cities name separated with white space ");

		cities = input.nextLine();
		/* takes input character sequence in pattern variable */
		System.out.println("enter pattern: ");
		pattern = input.next();
		cities = cities.concat(" ");
		int citiesLength = cities.length();
		int i;
		/* pattern finding using loop detecting whitespace */
		for (i = 0; i < citiesLength; i++) {

			/* if case for separating each city and matching pattern */
			if (cities.charAt(i) == ' ') {
				end = i;
				String city = cities.substring(srt, end);
				srt = i;

				/* pattern matching */
				if (city.contains(pattern)) {
					System.out.println("city of pattern " + pattern + " is: "
							+ city);
				}

			}

		}

	}

}
