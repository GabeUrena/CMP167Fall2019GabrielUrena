import java.util.Scanner;
import java.util.Random;
public class project {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	
	// for loop for exit code
	
	
	
}


public String RandStatement(String response) {
	Scanner input = new Scanner(System.in);
	
	// getting random number
	Random randGen;
	int num;
	randGen = new Random();
	num = randGen.nextInt(3);
	System.out.println(num);
	
	// finding the first and last words
	response = input.next();
	String firstWord = ""; // get the first word from the user's sentence use split statement
	String lastWord = ""; // get last word from the user's sentence 
	
	//both arrays
	String[] statements = new String[3];
			statements[0] = firstWord + " seems important to you, so does " + lastWord + ". Please tell me more.";
			statements[1] = firstWord + " and " + lastWord + " seem to be on your mind. Let's talk about it.";
			statements[2] = "Talk more about " + firstWord + " and " + lastWord + ".";
	
	String[] questions = new String[3];
			questions[0] = "Does " + firstWord + " bother you? How about " + lastWord + "?";
			questions[1] = "Want to talk about " + firstWord + " and " + lastWord + "?";
			questions[2] =	"Why is " + firstWord + " and " + lastWord + " so important to you?";
	
	// printing responses
	if(response.substring((response.length() - 1)).equals("?")){
		System.out.println(questions[num]);
	
	} else if(response.substring((response.length() - 1)).equals("!")) {
		System.out.print("WOW! Dramatic! ");
		System.out.println(statements[num]);
	
	}else {
		System.out.println(statements[num]);
	}
	
}


}
