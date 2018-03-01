/**
 * 
 * HangmanGame is  instantiable class to draw word from arrow of 40 words, 
 * and count statisctics of the game
 * @author Jacek Byzdra, email: jacekbwwa@gmail.com
 * created 04/17/2016 6:50 PM
 */

  import java.util.Scanner;   //import type of object Scanner
  
  
  public class HangmanGame {    //An object of type HangmanGuess is here declared and created
   
String table[];     //an array named table is here declared to store String elements. This is main input.
int gamesCounter = 0;     //an instance variable gamesCounter is declared here  
                          // as integer value and initialized as 0

int wonGamesCounter = 0;     //an instance variable wonGamesCounter is here declared 
                             //as integer value and initialized as 0
	  
Scanner sn = new Scanner(System.in);   //an object of type Scanner is here created 
                                        //to allow reading from the keyboard

HangmanGuess hgs = new HangmanGuess();       //   An object of type HangmanGuess is here declared and created

	
public HangmanGame() {    //here a constructor named HangmanGame without any parameters  
	                      //is declared to create objects  type of object HangmanGame
}

/*
 * a private method named randomNumber is defined below. It returns integer number.
 * The method aim is guessing number from integer 0 to n, and it is based on method Math.random
 * In this method first is declared an integer variable n which store the number 
 * from method Math.random  converted to integer value , and multipled by 40. 
 * in the end  the random number is returned
 * 
 */

private int randomNumber(){  
	int n = (int) (Math.random()*40);
	return n;	
}

public void setTable(String table[]){   //a public method   setTable is defined below 
	                              //to store an array of String elements in the instance variables table . 
	 this.table = table;
}

/*
 *a private method named randomWord is defined below. 
 *It returns String type of word from array table
 *In this method first a method named randomNumber is invoked below 
 *to store the guess number in the integer n 
 *Next a word from array table , from position n is stored in String value x
 *In the end a word is returned
 * 
 */

private String randomWord(){    
	
	int n = randomNumber();  
	String  x = table[n] ;   
	return x;        
}

/*
 * a public method named Game is below defined. This method draws the word from an array table
 * In this method first is  declared a variable char named c 
 * Next starts the loop do (while)
 * In the loop there is  invoked method randomWord and it stores the value from the method in String randWord
 * Next  a cleanLivesAndUsedLetters method  is  invoked in object of type HangmanGuess. 
 * (it cleans lifes and used letters at the beginning of the game)
 *     //Next a method named setWord is  invoked to store randWord 
 *     (to guess word by customer)(the word is passed to class HangmanGuess for further processing)
 *     Next a method named guess is invoked in object of type HangmanGuess. The method is processing guessing letter by player
 *     Next if selection statement is used , and here variable  wonGamesCounter is increased per 1  
 *     until method getResultGame(in object of type HangmanGuess)                                                                                                                returns     true. 
 *     and  the variable gamesCounter is increased per one both when getResultGame returns true or false.
 *     Next     a println method is invoked to display information to Player whether he wants continue playing or not. 
 *     When he continues he press Y pressing Yanything else stops the game.
 *     Next  a method Scanner is invoked to String  from keyboard.
 *     Next a  method charAt is invoked to return first character from the String 
 *     Next received character is changed to lower case by invoked method toLowerCase
 *     the do loop is ended when player press lower character y or  capital Y.
 * 
 */

/**
 * @author Jacek Byzdra, email: jacekbwwa@gmail.com
 * created 04/17/2016 6:50 PM
 */
public void Game(){       
	char c;  
	do{	
		 String randWord = randomWord();        
		 hgs.cleanLivesAndUsedLetters();      
		 hgs.setWord(randWord);     
		 hgs.guess();   
		 
		 if(hgs.getResultGame()== true){
			 
			 wonGamesCounter++;
		 }
		 gamesCounter++;
		 System.out.println("Play another game (Y to continue , anything else will stop the game)?");
		 String s = sn.next();
		 c = s.charAt(0);
		 c = Character.toLowerCase(c);
	} while(c=='y');
	
	}

   public int getGamesCounter(){           // a public method named getGamesCounter is  defined below to return games counter.
	   return gamesCounter;
}


   public int getWonGamesCounter(){        // a public method named getWonGamesCounter is defined below to return wan games counter.
	   return wonGamesCounter;
   }

  }
  
/**
 * @author Jacek Byzdra, email: jacekbwwa@gmail.com
 * created 04/17/2016 6:50 PM
 */