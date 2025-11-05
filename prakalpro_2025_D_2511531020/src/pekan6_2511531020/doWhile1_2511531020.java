package pekan6_2511531020;

import java.util.Scanner;

public class doWhile1_2511531020 {
	public static void main(String [] args) {
		Scanner console = new Scanner(System.in);
		String phrase;
		do {
			System.out.print("Input passswaord: ");
			phrase = console.next();
		} while (!phrase.equals("abad"));
	}
 
}
