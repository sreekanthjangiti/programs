package programs;

import java.util.Scanner;

public class StringJoiner {

	private static String fullName;
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter your first name :");
String firstName = scan.nextLine();
System.out.println("Enter your last name :");
String lastName = scan.nextLine();
String fullname = stringJoiner(firstName, lastName);
System.out.println("Your full name = " + fullName);
	}
static String stringJoiner(String firstName, String lastName) {
	 return firstName + " " + lastName;
	}
}
