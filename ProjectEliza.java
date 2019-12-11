import java.util.Scanner;
import java.util.Random;
public class ProjectEliza {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	String goodbye = "yes";
	String name = "";

		//program will start from the beginning if user wants it to
while(!(goodbye.equalsIgnoreCase("No"))) { 
	
	String exit = "stay";
	
	
		//Greeting user
	System.out.println("Hello, my name is Eliza. What is your name?");
		name = input.nextLine();
		
		
		//Finding the first word, last word, and last character
	System.out.println("Hello, " + name + ". Tell me what is on your mind today in 1 sentence.");
	
	
	while(!(exit.equalsIgnoreCase("exit"))) {
		
		//Get users response and gets the first word, last word, and the punctuation 
	String response = input.nextLine();
	    String[] result = response.split(" ");
	    String firstWord = result[0];
	    String lastWord = result[result.length - 1];
	    lastWord = lastWord.substring(0, lastWord.length() - 1);
	    
	    if(firstWord.substring(0, firstWord.length() - 1).equals(lastWord)) {
			firstWord = lastWord;
		}
	    
	    String lastChar =  response.substring(response.length() - 1); 
	exit = firstWord;
	    
	Statement(firstWord, lastWord, lastChar,exit);
	exit = firstWord;
	
	}
	System.out.println("Do you want to run the session again?");
	goodbye = input.nextLine();
}
	System.out.println("Goodbye, until next time.");

}

public static void Statement(String firstWord, String lastWord, String lastChar, String exit) {

		//Getting random number to pick a random statement or question.
		Random randGen;
		int num;
		randGen = new Random();
		num = randGen.nextInt(3);
		
	
		//These are the questions and statements
		String[] statements = new String[3];
				statements[0] = firstWord + " seems important to you, so does " + lastWord + ". Please tell me more.";
				statements[1] = firstWord + " and " + lastWord + " seem to be on your mind. Let's talk about it.";
				statements[2] = "Talk more about " + firstWord + " and " + lastWord + ".";
		
		String[] questions = new String[3];
				questions[0] = "Does " + firstWord + " bother you? How about " + lastWord + "?";
				questions[1] = "Want to talk about " + firstWord + " and " + lastWord + "?";
				questions[2] =	"Is " + firstWord + " and " + lastWord + " important to you?";
	
		// printing responses
				if(!firstWord.equalsIgnoreCase("exit")) {
					
					}
				if(lastChar.equals("?")){
					System.out.println(questions[num]);
				
				} else if(lastChar.equals("!")) {
					System.out.print("WOW! Dramatic! ");
					
					System.out.println(statements[num]);
				
				}else {
					System.out.println(statements[num]);
				}
				}
}
