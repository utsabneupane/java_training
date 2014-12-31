package dec29;

import java.util.Scanner;

/**
 * a program to ask user to input 5 digit number and check whether its
 * palindrome or not
 * 
 * @author utsabn34
 */
public class IntegerPalindrome {
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		String numberString = "";
		int len = 0;
		int count = 0;
		boolean status = true;
		boolean check = true;
		/* loop until the number entered is 5 digit */
		while (status) {
			/* getting input from user */
			do {
				System.out.println("enter five digit number:");
				numberString = input.next();

				/* checking whether number is int or not */
				check = isInt(numberString);

			} while (!check);
			numberString = Integer.toString((Math.abs(Integer
					.parseInt(numberString))));
			len = numberString.length();
			if (len == 5) {

				status = false;
			}

		}

		/* checking the number is palindrome or not */
		for (int i = 0; i < len / 2; i++) {

			if (numberString.charAt(i) == numberString.charAt(len - 1 - i)) {
				count++;
			}

		}
		if (count == 2) {
			System.out.println(numberString + " is palindrome");
		} else {
			System.out.println(numberString + " not palindrome");
		}
	}

	/**
	 * 
	 * checks whether this parameter is integer or not
	 * 
	 * @author utsabn34
	 * @param str
	 * @return <code>true</code> if the string can be parsed to {@link Integer}
	 *         otherwise returns <code>false</code>.
	 */

	public static boolean isInt(String str) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException ntInt) {
			System.out.println("Not a integer value");
			return false;
		}
		return true;
	}

}
