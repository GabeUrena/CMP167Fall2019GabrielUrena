import java.util.Scanner;
public class week6 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
System.out.println("Enter three numbers to get their products:");
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();
int product = a * b * c; 

System.out.println("The product of " + a + ", " + b + " and " + c + " is " + product);
	

System.out.println("\nEnter two integers: ");
int n = input.nextInt();
int m = input.nextInt();
int sum = 0;
if (m > n) {
	while (m > n) {
		m = m - 1;
		sum = sum + m;
	}
	sum = sum - n;
}
	if(m < n) {
	while (m < n) {
		n = n - 1;
		sum = sum + n;
	}
	sum = sum - m;
	}
System.out.println("The sum of the range between the two numbers is " + sum);
	
System.out.println("\nEnter a number to get the average of its range to 1:");
	
	n = input.nextInt();
	int x = n;
	sum = 0;
	double average;
	
	for (int i = 1; i <= n; ++i) {
		sum = sum + x;
		x = x - 1;
	}
	
	average = sum / n;
	
System.out.println("The average from 1 to your number is " + average);
	
	
	
	
	
	
	
	
	
	
	
	
	
} }
