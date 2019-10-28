import java.util.Scanner;
public class SmallestNumCheck {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double n1;
	double n2;
	
	System.out.println("Enter 2 numbers");
	n1 = input.nextDouble();
	n2 = input.nextDouble();
     	System.out.println(Smaller(n1,n2));
}
	

public static double Smaller(double n1, double n2) {
	

	if(n1 > n2) {
		return n2;
	} else if (n2 > n1) {
		return n1;
	} else {
		return n2;
	}
	
}
}