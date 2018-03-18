import java.io.*;
import java.util.*;

public class Hangman {

// This string holds the word that we are trying to guess
  public static String hangmanWord;
/* 
This array of characters holds the characters in the word that we have guessed
For example, if the word is: cake
Then, at the beginning of the game, the characters array should be empty (_ _ _ _)
If a user guesses the letter 'c', the character array should be updated to look like this (c _ _ _)
We know the user has guessed the word when all the spaces are filled!
*/
  public static char[] charArray;

 // This method returns a random integer between min and max
  public static int getRandomNumberInRange(int min, int max) {
    if (min >= max) {
      throw new IllegalArgumentException("max must be greater than min");
    }

    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
  }

// This method reads a random word from the file "words.txt"
	public static String readWordFromFile() throws FileNotFoundException {
	    int i = getRandomNumberInRange(0, 5040);
      int counter = 0;
	    for(Scanner sc = new Scanner(new File("words.txt")); sc.hasNext(); counter++) {
          String line = sc.nextLine();
          if (i == counter) {
            return line;
          }
      }
     return "default";    
	}

// TODO: This method should return true if the character array is complete
// Otherwise, it should return false
  public static boolean isCharArrayComplete() {

  }

// TODO: This method prints out the current char array in a way that the user can understand
// We want to go through the character array charArray, and print out '_' if the letter isn't filled
// Otherwise, we want to print out the letter
  public static void printCharAray() {

  }

  public static boolean guessLetter() {
    System.out.println("Please guess a letter:");
    Scanner in = new Scanner(System.in);
    char nextChar = in.next().charAt(0);
    boolean guessed = false;

    // TODO: So, nextChar is the value that the user has guessed
    // We want to update charArray if the letter is accurate
    // Return true if the user guessed correctly, and false if the user guessed incorrectly
    return false;
  }

	public static void main(String[] args) throws FileNotFoundException {
    // First we want to assign hangmanWord to a random word from words.txt
    // Hint: one of the methods above should do this for us!
    hangmanWord = readWordFromFile();
    // Next, we want to initialize charArray to have the same length as the word:
    charArray = new  char[hangmanWord.length()];

    int incorrectGuesses = 0;

    while(incorrectGuesses < 7){
      // 1. Guess a letter

      // 2. If we guessed incorrectly, increment incorrectGuesses

      // 3. Print out the current state of the array

      // 4. Check if we have completed the charArray

      // 5. If we have, let the user know they guessed the word!
      //    If not, let them know how many guesses they have left.

    }
    System.out.println("Sorry, that's the end! The word was " + hangmanWord);
	}
}