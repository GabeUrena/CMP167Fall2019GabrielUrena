

import java.util.Scanner;
public class NameGetter {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
System.out.println("Enter your first name and last name");

	String Fname = input.next();
	String Lname = input.next();

System.out.println("Thank you, " + Fname);
System.out.println("Oh your last name is " + Lname + "!!");
	}
}
