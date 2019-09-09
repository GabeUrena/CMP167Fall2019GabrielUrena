import java.util.Scanner;
public class Week3CalculatingSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Get the sum of two values//
		
System.out.println("Enter two int values to add.");
int num1 = input.nextInt();
int num2 = input.nextInt();
int result = num1 + num2;

System.out.println(result);;



		//Get the sum of three values//

System.out.println("Enter three int values to add.");
    num1 = input.nextInt();
    num2 = input.nextInt();
int num3 = input.nextInt();
    result = num1 + num2 + num3;

System.out.println(result);;



		//Get the product of four values//

System.out.println("Enter four int values to multiply.");
    num1 = input.nextInt();
    num2 = input.nextInt();
    num3 = input.nextInt();
int num4 = input.nextInt();
    result = num1 * num2 * num3 * num4;

System.out.println(result);;
	}
}


