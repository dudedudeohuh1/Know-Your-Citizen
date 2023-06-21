import java.util.*;

public class KnowYourCitizen {

	public static void main(String[] args) {
		// Create Scanner for user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Know Your Citizen program!");
		
		// Get user input
		System.out.print("Enter your First Name: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter your Last Name: ");
		String lastName = input.nextLine();
		
		System.out.print("Enter your Date of Birth (MM/DD/YYYY): ");
		String dob = input.nextLine();
		
		System.out.print("Enter your Social Security Number (###-##-####): ");
		String ssn = input.nextLine();
		
		System.out.print("Enter your Street Address: ");
		String streetAddress = input.nextLine();
		
		System.out.print("Enter your City: ");
		String city = input.nextLine();
		
		System.out.print("Enter your State: ");
		String state = input.nextLine();
		
		System.out.print("Enter your Zip Code: ");
		String zipCode = input.nextLine();
		
		System.out.println("\nYou have entered the following information:");
		
		// Display user input
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Date of Birth: " + dob);
		System.out.println("Social Security Number: " + ssn);
		System.out.println("Address: " + streetAddress + " " + city + ", " + state + " " + zipCode);
		
		// Validate user input
		if(dob.length() != 10 || ssn.length() != 11) {
			System.out.println("Error! Please enter valid information.");
		}
		
		// Confirmation message
		System.out.println("\nThanks for submitting your information!");
		
		// Close Scanner
		input.close();
	}

}