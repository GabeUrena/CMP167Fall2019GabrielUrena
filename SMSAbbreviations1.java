import java.util.Scanner;
public class SMSAbbreviations1 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter The SMS Abbreviation: ");
		String abbreviation = scnr.nextLine();
		
		String translation = "";
		
		while (!(abbreviation == translation)) {
			if (abbreviation.equalsIgnoreCase("LOL")) {
				System.out.println("Laughing Out Loud");
			} else if (abbreviation.equalsIgnoreCase("TMI")) {
				System.out.println("Too Muck Information");
			} else if (abbreviation.equalsIgnoreCase("SMH")) {
				System.out.println("Shaking My Head");
			} else{
				System.out.println("Unknown Abbreviation");
			}
			abbreviation = scnr.nextLine();
		}
			

}
}