import java.util.*;
public class SplitMethod {
	//System.out.println(reverseString());
	
	public static String reverseString() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str = input.next();
		str = str.toLowerCase();
		String[] array1 = str.split(" ");
		String finishedSent = "";
		
		for (int i = array1.length - 1; i >= 0; i--) {
			finishedSent += array1[i] + " ";
		}
		return finishedSent;
	}
}
