import java.util.Scanner;
public class AverageFrom1ToN {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number");
	
	int n = input.nextInt();
	int x = n;
	double sum = 0;
	double average;
	
	for (int i = 1; i <= n; ++i) {
		sum = sum + x;
		x = x - 1;
	}
	
	average = sum / n;
	
System.out.println("The average from 1 to your number is " + average);
	
}



}