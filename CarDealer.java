package w4p2;
import java.util.Scanner;
public class CarDealer {
	public static void main(String[] args) {
		int ceditScore, age;
		
	Scanner input = new Scanner(System.in);
	
		System.out.println("Hello I'm a car dealer,\ndo you want to buy a car?");
	
	String answer = input.next();
	
	if(answer.equalsIgnoreCase("Yes")) {    //.equals is == but for strings, .equalsIgnoreCase ignores uppercase and lowercase letters//
		System.out.println("OK,let me show you what I have...");
		System.out.println("Wait, what's your age?");
		age = input.nextInt();
		if(age>=25) {
			System.out.println("OK, good");
			System.out.println("What model do you want");
			String answer1 = input.nextLine();
			checkModel(answer1);
		}else {
			System.out.println("Sorry, I cannot sell you the car");
		}
	}else {
		System.out.println("OK, come back when you are ready");
	}
	}
	public static void checkModel(String model) {
		switch(model) {
		case "Ferrari_488GTB":
			System.out.println("that's $262,647.00");
			break;
		case "2018_Ferrari_California":
			System.out.println("that's $202,723.00");
			break;
		case "Lambo_Urus":
			System.out.println("that's $200,000,00");
			break;
			default:
				System.out.println("Please come back later, they're out of stock");
		}
	
	
	
	
	
	
	
	
	
	
}
}