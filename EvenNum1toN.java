import java.util.Scanner;
public class EvenNum1toN {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number");
	
	int n = input.nextInt();
	int x = 2;
	double sum = 0;
	double average;
	int times = 0;
	
	while(x <= n) {
		sum = sum + x;
		x = x + 2;
		times = times + 1;
	}
	
	average = sum / times;
	
System.out.println("The average from 1 to your number is " + average);
	
	
	
}
}
