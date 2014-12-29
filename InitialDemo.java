/*
 * a program that accepts full name as an input from user and display only its 
 * initial from that full name
 */

import java.util.Scanner;

public class InitialDemo{

	private static Scanner sc;			/*initialization of Scanner object for taking input */

	public static void main(String[] args) {

		/* variable to store initial name initialization*/
		StringBuilder initial=new StringBuilder();
		sc=new Scanner(System.in);
		
		/*input taken from user and stored in variable */
		System.out.println("Enter your full name: ");
		String fullName=sc.nextLine();
		int len=fullName.length();
		
		for (int i=0; i<len; i++){

				/* getting character before first dot or space in name*/
				if( (fullName.charAt(i)=='.') || (fullName.charAt(i)==' ') ){
					break;
				}else{

					/*each character before '.' or ' ' is stored as initial*/
					initial.append(fullName.charAt(i));
				}
		}
		
		System.out.println("Your initial is: "+initial);
				
	/* main function end here*/	
	}
/* InitialDemo class ends here*/ 
}

