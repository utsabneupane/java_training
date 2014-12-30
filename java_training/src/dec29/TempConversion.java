package dec29;

/**
 * a program that display the celcius value from 0 to 100 with its respective
 * fahrenheit value
 * 
 * @author utsabn34
 */
public class TempConversion {

	public static void main(String[] args) {
		/* initialization of celcius and fahrenheit value */
		int celcius = 0;
		float fahrenheit = 0;
		int i;

		System.out.println("celcius" + "\t" + "fahrenheit");
		for (i = 0; i < 100; i++) {

			/* conversion from celcius to fahrenheit */
			fahrenheit = (float) celcius * 9 / 5 + 32;
			System.out.println(celcius + "\t" + fahrenheit);
			celcius++;
		}
	}

}
