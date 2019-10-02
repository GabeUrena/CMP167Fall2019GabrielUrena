import java.util.Scanner;
public class week5pt2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
int num1;
int num2;

System.out.println("Enter two numbers to add together:");
	
	num1 = input.nextInt();
	num2 = input.nextInt();
int sum = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is : " + sum);
		

		
System.out.println("\nEnter a number to find what's between it and 1:");
int n = input.nextInt();
int number = 1;
		
			while (number < n - 1) {
				number++;
				System.out.println(number);
			}
		
			
			
System.out.println("Enter a number to find all the squares between it and 1");
	number = 1;
int square;
	n = input.nextInt();

	for (number=1; number<n; number++) {
		square= number * number;
		System.out.println(square);
	
	}

	
	
System.out.println("\nEnter the word \"Ready\" to \nprint all the even numbers from 1 to 100:");
	number = 2;
	String word = input.next();
	
	if(word.equalsIgnoreCase("Ready")) {
		while(number <=50) {
			System.out.println(number);
			number = number + 2;
		}
		
		for(int i = 1; i <= 10; ++i) {
			System.out.println(number);
			number = number + 2;
		}
		
		do {
			System.out.println(number);
			number = number + 2;
		}while(number < 102);
			
	}
			
			
			
			
			
			
			
			
}
}