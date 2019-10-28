import java.util.Scanner;
public class PracTestQ4 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	String name; 
	String petName;
	
	System.out.println("Enter your name and your pet's name");
	name = input.next();
	petName = input.next();
	
	System.out.println(name + ", " + petName + " has " + petName.length() + " characters");
	
}
}
