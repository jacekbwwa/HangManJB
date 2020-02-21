# HangManJB
## Game of Hangman. Author: Jacek Byzdra


## Description  
- Game randomly chooses one word from a list of 40 words stored in an array of words.  
- The player must guess the word.  
- Player enters a letter at prompt. A player cannot enter the same letter twice.  
- If the letter is not part of the word the player loses one life.  
- If the letter is correct game shows the letter in its position/positions in the word.  
- Game keeps asking for letters until the player runs out of lives or the player has guessed the word.  
- At the start of a game the player is given 8 lives.  
- At the end of a game , game asks the player if he/she would like to play another game.  

## Technologies Used
- Java

## How to run 
**Compiling with pure Java**    

- First, copy all files from HangManJB/src  directory to any folder, for ex. to HangMan directory
- Then, build it:     
```   
cd HangMan 
```   
```   
$ javac Hangman.java 
```   

- Then, run:   
```   
$ java Hangman   
```     

**Compiling with IDE**   

- Clone the repository
- Open the folder on IDE
- Compile project

You now have two options:   

- Execute on IDE   
- Execute via terminal (you can also build via terminal)    

## Code Explaination
The code includes several shared Java objects which cover different tasks in the game:

### Author

**Jacek Byzdra**  
*Software Developer  
jacek.jaroslaw.byzdra@gmail.com  
[Linkedin](https://www.linkedin.com/in/jacek-byzdra/) - [GitHub](https://github.com/jacekbwwa)*

### License
This work is available under a Creative Commons License Attribution - Non-Commercial Use - No Derivative Works 4.0 International
[![License: CC BY-NC-ND 4.0](https://licensebuttons.net/l/by-nc-nd/4.0/80x15.png)](https://creativecommons.org/licenses/by-nc-nd/4.0/)
