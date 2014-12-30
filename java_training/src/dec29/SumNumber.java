package dec29;

/**
 * a program that sum all the number greater than 100 and less than 200 that are
 * divisible by 7
 * 
 * @author utsabn34
 * 
 */
public class SumNumber {

	public static void main(String[] args) {
		int sum = 0;
		System.out
				.println("Number that are divisible by 7 and are greater than 100 and less than 200 are:");
		int i;
		for (i = 101; i < 200; i++) {
			/* checking whether number is divisible by 7 or not */
			if (i % 7 == 0) {
				System.out.print(i + "\t");

				/* sum of number divisible by 7 */
				sum += i;
			}

		}
		/* for new line */
		System.out.println("");
		System.out.println("total sum= " + sum);

	}

}
