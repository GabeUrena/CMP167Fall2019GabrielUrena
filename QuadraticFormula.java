import java.util.Scanner;
public class QuadraticFormula {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a, b, and c");
	double x;
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	
	x = ((-1 * b) - (Math.sqrt(Math.pow(b, 2) - ((4  * a) * (c))))) / (2 * a) ;
	
	System.out.println("X is equal " + x);
	
	
}
}
