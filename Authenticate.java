import java.util.Scanner;

/**
 * The class Authenticate prompts for and reads user input strings
 * and compares them to the correct strings using the .equals() String method.
 * If the strings match, regardless of case for username and case-sensitive 
 * for password, then a welcome message is printed. 
 * If either string does not match then an incorrect message is printed and 
 * the application exits.
 * @author Sapper
 * email: email
 * Created 09OCT2017
 * @version 1.0
 */

public class Authenticate {

	/**
	 * The main() method initializes login String variables that can be 
	 * compared to user-entered Strings and be verified as matching.
	 * The main() method is the entry point of the application.
	 * the main() method is a void method so it performs some other action
	 * than to return a value.
	 * @param args command line arguments passed to the application.
	 */

	public static void main(String[] args) {

		//Initialize correct login strings
		String correctUserName = "csc200";
		String correctPassword = "password";

		//Create Scanner object to read keyboard input
		Scanner keyboard = new Scanner(System.in);

		//Prompt for username string
		System.out.println("Enter your username:");
		//read username string
		String userName = keyboard.next();

		//compare strings for equality regardless of case
		if (userName.equalsIgnoreCase(correctUserName)) {
			System.out.println("Username is correct");
			System.out.println("Enter your password:");
			String password = keyboard.next();

			//compare string equality case-sensitive
			if (password.equals(correctPassword)) {
				System.out.println("Welcome csc200!");
			} else {
				System.out.println("Wrong Password!");
				System.exit(0);
			}
		} else {
			System.out.println("Wrong Username!");
			System.exit(0);
		}

	}
}
