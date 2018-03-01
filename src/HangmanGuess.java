/**
 * HangmanGuess is instantiable class to guess single words
 * @author Jacek Byzdra, email: jacekbwwa@gmail.com
 * created 04/17/2016 6:50 PM
 */

import java.util.Scanner;         //import type of object Scanner

public class HangmanGuess {
	int nLives = 8;      // an integer variable nLives is declared with initial value 8. 
	                     // It stores the number of player's life
	char t = '_';          //  a variable character t is declared  with initial value underscore.
	String word;          // a String variable word  is declared. It will store the received word. 
	                      //It is main input (output is on display) 
	char[] wordToGuess;      // an arrow  of characters  named wordToGuessis declared to store word to guess
	StringBuffer lettersUsed = new StringBuffer();      // a new instance object StringBuffer is declared to store letters used
	Scanner sc = new Scanner(System.in);    // an object of type Scanner is below created to allow reading from the keyboard
	boolean wonGame;         // a boolean variable wonGame is declared. It stores the boolean expression 
	                         // whether game is wan (true) or not (false)
	
	public HangmanGuess() {      //here a constructor named HangmanGuess without any parameters  
		                         //is declared to create objects  type of object HangmanGuess
	}
	
/*
 *  here a public method cleanLivesAndUsedLetters is defined .
 * In the method a variable nLives is initiated with value 8. (every time the cleaning method is invoked)
 * a new instance object StringBuffer is declared to store letter used. 
 * It is used new StringBuffer to clean buffer of used letters
 */
	
	public void cleanLivesAndUsedLetters(){                                 
		nLives = 8;
		lettersUsed = new StringBuffer();
	}
	
	
	public boolean getResultGame(){    //a public boolean method getResultGame is defined. In the method result game is returned. 
		                               //Result is won when boolean expression is true.
		return wonGame;
	}
	
	
	public void setWord(String word){  // a public void setWord is defined . It receives draft word in String values. 
		                                // The word is stored in word value.
		this.word=word; 
	}
	
	
	private void createWordToGuess(){  // a private method createWordToGuess is defined to create word presented for user. 
		                               // It is composed of used letters and underscores 
	
		int len = word.length();       // a method word.length() is invoked to count length of draft word  and it is stored in  value len 
		wordToGuess = new char[len];   // an arrow of characters as word to guess is created with size of arrow  = len
		
		for(int i=0; i<wordToGuess.length; i++){    // here an array of characters as word to guess is traversed 
			                                        // to initialized every character of arrow with value  
			                                        //  equal t (underscore). For this purpose loop 'for' is used.	                           
			wordToGuess[i]=t;
		}
	}
	
	/**
 * @author Jacek Byzdra, email: jacekbwwa@gmail.com
 * created 04/17/2016 6:50 PM
 */
	private void display(){            // a public method display is defined. 
		                              // It is used as output for displaying values to the player  : life, Word, and Letters used
		System.out.println();          // display empty line for clear readiness
		System.out.println("Lives: " + nLives);    // display number of life
		System.out.print("Word: ");     // display word to guess from below traversed loop. The word to guess is word in which player guess letters
		                                          // (with initialized underscores chars)
		for(int i=0; i<wordToGuess.length; i++){  // in every iteration of the loop a value from position 'i' from arrow is displayed and space
			System.out.print(wordToGuess[i]);
			System.out.print(" ");
		}  
		
		System.out.println();            // pass to next line
		System.out.print("Letters used: ");  //display letters used from below traversed loop (buffer is traversed 
		                                     //on length and displayed characters from buffer)
		
		for(int i=0; i<lettersUsed.length(); i++){   //  First  a character from position 'i' from string buffer 
			                                         //lettersUsed is returned to character place
			                                         //next  character place is displayed .
			                                        // next the string buffer lettersUsed is traversed and is displayed comma
		
			char place = lettersUsed.charAt(i);
			System.out.print(place);                
			if(i<(lettersUsed.length()-1)){            // For last character comma  ", " is not dispalyed d
				System.out.print(", ");
			}
		}
		        System.out.println();              // pass to next line
	}
	
	
	
	private boolean checkLetterWasUsed(char x){     // a private boolean method named checkLetterWasUsed is defined.
		                                            // The method has parameter char x which is letter used to check
		for(int i=0; i<lettersUsed.length();i++){    //  The method is checking letersUsed in loop traversing string buffer.
			
			if(x==lettersUsed.charAt(i)){            // The letter from StringBuffer from position 'i' is checked if it is equals x 
				                                     // (it is used letter), 
	System.out.println("You have already used: "+ x);   // and if the boolean value is true it displays  the letter was already used.
	return true;
			      }	
			}
		return false;
		}
		
	
	private void checkLetterIsInWord(char y){     // a private method checkLetterIsInWord is defined to check 
		                                          // whether provided letter appears in guess word 
		char c;                                     // a variable character c is declared. 
		boolean foundletter = false;                   // a boolean foundletter is declared and initialized with false value.
		for(int i=0; i<word.length();i++){     // The method is traversing the word (word to be guess, drawed earlier from arrow of 40 words)   
			c = word.charAt(i);                   // the letter from i position is returned to c
			if(y==Character.toLowerCase(c)){     // if provided letter is equal c (is equal letter from word to be guess on position i) 
				wordToGuess[i]=c;                // than the letter from word with initialized underscores on i position is swapped with c value
				foundletter = true;              // and foundletter is marked as true 	
			}
		}
		
		if(foundletter==false){                // When the for loop is ended  the foundletetr is checked. 
			                                   // If letter was not found the life number is reduced per one
			nLives=nLives-1; 
		}
	}
	
	
	
	private void checkIfWordIsComplete(){         // a private method checkIfWordIsComplete is defined. The method checks whether 
		                                          // guessed word has still underscore values
		                                          // and it returns wonGame value
		
		for(int i=0; i<wordToGuess.length;i++){    //The method is traversing wordToGuess, and if still underscore values 
			                                       // are in the wordToGuess wonGame is returned as false
			
			if(wordToGuess[i]==t){                   // otherwise wonGame is returned as true 
				wonGame = false;
				return;
			}
		}
		    wonGame = true;	
	}
	
	
	private void displayEndGuessInfo(){            // A private method displayEndGuessInfo is defined. 
		                                          // It checks value wonGame, and it displays player '....you wan game' 
		                                          // when the wonGame value is true, and 'you lost ..' when the value is false 
		
		display();                              // a display method is invoked (output for displaying 
		                                        // values to the player  : life, Word, and Letters used)
		if(wonGame==true){
			
		  System.out.println("Congratulations, you won the game! ");	
		
		} else {
		   System.out.println("Sorry you lost the game. " );
		   System.out.println("The word was: " + word);
		}	
	}
/**
 * @author Jacek Byzdra, email: jacekbwwa@gmail.com
 * created 04/17/2016 6:50 PM
 */	
	
	public void guess(){                 //  a public method guess is defined below. 
		                                 //  It is main method to guess word. 
		                               // This method ask player for providing letter until the letter is not found in buffer of found letters
		
		createWordToGuess();  
		do{
			display();                // a display method is invoked (output for displaying values to the player: life, Word, and Letters used)
			char letter = 'a';         // a character letter is declared and initialized with default 'a' value. 
			boolean isLetter = true;      // a boolean isLetter value is declared and initialized with true value
			do{                           //  In the loop player is asked to provide letter until provided letter 
				                         // is correct (letter is not found in used letters)
				
			System.out.print("Guess a letter: ");    // A print method is invoked to print ' ask user for providing letter '
			String s =	sc.next();      // a Scanner method is invoked to receive value from the keyboard, and it is returned to s String value
			char temp = s.charAt(0);      // first character from String s (letters provided by user) is stored in character temp value
			if(Character.isLetter(temp)){    // a method Character.isLetter is invoked to check whether value temp is letter
				letter = Character.toLowerCase(temp);   // if value temp is letter the value is returned in lower case to variable letter 
				isLetter = true;                          // a variable isLetter is initialized with true value (when temp value is letter)	
			} else {
				System.out.println("Please enter a letter. Other charcters are not valid. ");
				isLetter = false;                       // a variable isLetter is initialized with false when temp value is not letter
			   }	
			}
			while (isLetter == false || checkLetterWasUsed(letter)==true);  //a private boolean method named checkLetterWasUsed is invoked, 
			                                                                // and it checks the variable isLetter 
			
			 lettersUsed.append(letter);   // a method lettersUsed.append is invoked and it adds to end of buffer 'letter' value 
			                               // (value provided by user and returned in above 'do' loop)
			 checkLetterIsInWord(letter);    // a method checkLetterIsInWord is invoked ( to check whether provided letter appears 
			                                 // in guess word). It modifies the word with underscores 
			 checkIfWordIsComplete();        // a method checkIfWordIsComplete is invoked (to check whether guessed word has still 
			                                 // underscore values);
		} while(nLives>0 && !wonGame);       // the above do loop is processing when player has still life and he hasn't guessed word
		 
		displayEndGuessInfo();               // a method displayEndGuessInfo is invoked when player has no life or game was wan.
	 }
	

}
	
	
	
	
	
	