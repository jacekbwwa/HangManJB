/**
 * 
 * Develop a game of Hangman that randomly chooses one word from a list
of 40 words stored in an array of words. The player must guess the word.
Prompt the player to enter a letter. A player cannot enter the same letter
twice. If the letter is not part of the word the player loses one life. If the
letter is correct show the letter in its position/positions in the word. Keep
asking for letters until the player runs out of lives or the player has guessed
the word. At the start of a game the player is given 8 lives. At the end of a
game ask the player if he/she would like to play another game.
The following words should be part of your 40 word list: "programming",
"violoncello", "selection", "repetition", "serendipity", "performance", "computing".

Hangman.java is a main class of application 
The class Hangman initialize arrow words, creates object of type HangmanGame, and prints out statistics

 * @author Jacek Byzdra, email: jacekbwwa@gmail.com
 * created 04/17/2016 6:50 PM
 */
public class Hangman {

	public static void main(String args[]) {
		
		
		String anArrayWords[];  // an array named anArrayWords is declared below  to store String elements. 
		                        // An anArrayWords is main input in object of type Hangman
		
		//The array anArrayWords is initialized below with list of 40 String words
		anArrayWords = new String[]{"programming","violoncello", "selection", "repetition", 
				"serendipity","performance", "computing","America", "Africa", "adjective", 
				"although", "another", "croquet", "commitment", "duplex", "azure", "exodus", 
				"curriculum", "hyphen", "ivory", "addressee", "jigsaw", "jockey", "joyful", 
				"kilobyte", "luxury", "microwave", "nowadays", "oxygen", "quorum", "sphinx", 
				"subway", "swivel", "walkway", "wizard", "neutral", "ivy", "unknown", "Europe", 
				"college"};
		
		                                      
		HangmanGame hg = new HangmanGame();   // An object of type HangmanGame named hg is here declared and created 
		hg.setTable(anArrayWords);            //A setter method setTable is invoked below to store an array anArrayWords 
		                                      //with 40 String words and save it in the array anArrayWords  
				
		hg.Game();                               //  A Game method is invoked here in object of type HangmanGame
		int gamesCounter = hg.getGamesCounter();     // here a getter method named  getGamesCounter is invoked in object of type HangmanGame 
		                                             // and it retrieves the integer number which is the number of the games
		int wonGamesCounter = hg.getWonGamesCounter(); // here  a getter method named getWonGamesCounter is invoked  
		                                               // in object of type HangmanGame and it retrieves the integer number 
		                                               // which is the number of wan games
		System.out.println("Game Statistics:");      // here a println method is invoked to display information "Game Statistics:"
		System.out.println("Game played: " + gamesCounter ); // here a println method is invoked to display information and number of the games
		System.out.println("Game won: " + wonGamesCounter);  // here a println method is invoked to display information and number of wan games
		System.out.println("Game lost: " + (gamesCounter - wonGamesCounter ));  //here  a println method is invoked to display information 
		                                                                         // about number of games lost. 
/**
 * @author Jacek Byzdra, email: jacekbwwa@gmail.com
 * created 04/17/2016 6:50 PM
 */

	}
}