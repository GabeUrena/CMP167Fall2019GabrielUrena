import java.util.Scanner;
public class SMSAbbreviations1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter The SMS Abbreviation: ");
		String abbreviation = scnr.nextLine();
		
		String translation = "";
		
		
			if (abbreviation.equalsIgnoreCase("LOL")) {
				translation = "Laughing Out Loud";
			} else if (abbreviation.equalsIgnoreCase("TMI")) {
				translation = "Too Muck Information";
			} else if (abbreviation.equalsIgnoreCase("SMH")) {
				translation = "Shaking My Head";
			} else{
				translation = "Unknown Abbreviation";
			}
		
		
			
		System.out.println(abbreviation + " means " + translation);
		return;
}
}