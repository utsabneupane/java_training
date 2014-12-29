/*
 * a program that accepts name of cities separated by white space along with character sequence to search city as an input
 * from user and display the city that falls under that character sequence 
 * 
 */

import java.util.Scanner;

public class PatternDemo {

	private static Scanner sc;			/*initialization of Scanner object for taking input */

	public static void main(String[] args) {

		/*variable initialization for cities,pattern, start point, end point*/		
		String cities;
		String pattern;
		int srt=0,end=0;
		sc=new Scanner(System.in);

		/*takes input from user and store city in cities and character sequence in pattern variable */
		System.out.println("enter cities name separated with white space ");
		//kathmandu lalitpur bhaktpur pokhara
		cities=sc.nextLine();

		System.out.println("enter pattern: ");
		pattern=sc.next();
		cities=cities.concat(" ");

		/* pattern finding using loop detecting whitespace*/		
		for (int i=0;i<cities.length();i++){

			/* if case for separating each city and matching pattern*/
			if (cities.charAt(i)==' '){
				end=i;
				String city=cities.substring(srt,end);
				srt=i;

				/* pattern matching*/
				if (city.contains(pattern)){
					System.out.println("city of pattern "+pattern+" is: "+city);	
				}

			/*outer if ends here*/
			}
		/*for loop ends here*/
		}
		
				
	/* main function end here*/	
	}
/* PatternDemo class ends here*/ 
}
