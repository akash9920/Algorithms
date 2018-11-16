import java.util.HashSet;
import java.util.Scanner;

public class GuessWord {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuessWord g = new GuessWord();

        // you can enter the word here to guess
        // the game building is under progress
        // next step will be to write an set of words and this program will 
        // take the any random words to ask from the user
		g.StartGame("testing");
	}

	public void StartGame(String gameinput) {
		
		int lives = 5;
		
		int counter = gameinput.length();

		System.out.print(" the Game has started");

		char[] temp = new char[gameinput.length()];

		char[] newtemp = gameinput.toCharArray();
		
		boolean found = false;
		

		for (int i = 0; i < temp.length; i++) {

			temp[i] = '_';
		}

		
		
		
		while (lives != 0 && counter!=0) {

			Scanner guessinput = new Scanner(System.in);

			char input = guessinput.nextLine().charAt(0);

			
			
			for (int i = 0; i < gameinput.length(); i++) {

				if (newtemp[i] == input) {

					temp[i] = input;
					found = true;
					counter--;
				}
				
			}
			
			if(found==false) {
				
				lives--;
				
			}
			
			found = false;
			
			

			if(counter!=0) {
			for (int i = 0; i < temp.length; i++) {

				System.out.print(temp[i]);
			}
			
			System.out.println("   ");
			
			System.out.println(" no of lives you have left :   " + lives );
			}
			else {
				
				System.out.println(" you have won the game ");
				break;
			}
			
			
		}
		
		
		if(counter!=0 && lives==0) {
			
			
			System.out.println(" you are out of lives ang the GAME is Over");
		}
		
		
		
		
		
		
		System.out.println(" the game is done");

	}

}
