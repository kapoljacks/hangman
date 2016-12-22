/*
Add "generate phrase" function from API
 */
package hangman;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VC-019
 */
public class Run {

    public static void main(String[] args) {
        
        //main menu
        Drawing drawing = new Drawing();
        System.out.println("   H A N G M A N\n");
        drawing.DrawFull();    
        System.out.println("Enter a phrase, or generate one?");
        System.out.print("Type \"enter\" or \"generate\": ");  
        
        //prompting for gameplay type, setting up required lists and variables
        Scanner input = new Scanner(System.in);
        ArrayList<Character> correctGuesses = new ArrayList<>();
        ArrayList<Character> allGuesses = new ArrayList<>();
        int remainingGuesses = 7;
        int drawPhase = 1;
        boolean wonGame = false;
        String gameType = input.nextLine();
        
        //"enter a phrase" game type
        if (gameType.equals("enter")) {
            System.out.print("Enter a phrase: ");          
            String userInput = input.nextLine();           
            Phrase phrase = new Phrase(userInput);
            if (phrase.lookForChar(' ')) {
                correctGuesses.add(' ');
            }
            ArrayList<Character> checkList = phrase.toList();
            System.out.println("Generating game...");
            System.out.println("");
            //drawing new empty hang and empty phrase line to start new game        
            drawing.DrawCurrent(drawPhase);
            System.out.println("");
            phrase.PrintEmptyPhrase();
            System.out.println("");
        
            
            //main game loop
            while (true) {     
                System.out.printf("Guesses remaining: %d\n", remainingGuesses);
                System.out.printf("Incorrect guesses: %s\n", allGuesses.toString());
                System.out.print("Guess a letter, or type \"solve\": ");
                String guess = input.next();
                char character = guess.charAt(0);
                System.out.println("");
                if (phrase.lookForChar(character) == true) {
                    correctGuesses.add(character);                   
                    if (correctGuesses.containsAll(checkList)) {                   
                        wonGame = true;
                        break;
                    }
                } else {              
                    //if returns false, call the next Draw() method, decrement guess. use switch statement here. if guesses > 7, break with you lose
                    allGuesses.add(character);
                    drawPhase++;
                    remainingGuesses--;
                    if (remainingGuesses == 0) {
                        break;
                    }
                }
                drawing.DrawCurrent(drawPhase);
                phrase.PrintPhrase(correctGuesses);
                System.out.println("");
            }
                   
            if (wonGame) {
                drawing.DrawWin();
                phrase.PrintPhrase(correctGuesses);
                System.out.println("You win!");
            }
            else {
                drawing.DrawCurrent(drawPhase);
                System.out.println("You lose.");
            }   
        }
        
        //"generate a phrase" game type
        else if (gameType.equals("generate")) {
            Generator gen = new Generator();
            String randomPhrase = gen.getRandomPhrase();       
            Phrase phrase = new Phrase(randomPhrase);
            if (phrase.lookForChar(' ')) {
                correctGuesses.add(' ');
            }
            ArrayList<Character> checkList = phrase.toList();
            System.out.println("Generating game...");
            System.out.println("");
            //drawing new empty hang and empty phrase line to start new game        
            drawing.DrawCurrent(drawPhase);
            System.out.println("");
            phrase.PrintEmptyPhrase();
            System.out.println("");
        
            
            //main game loop
            while (true) {     
                System.out.printf("Guesses remaining: %d\n", remainingGuesses);
                System.out.printf("Incorrect guesses: %s\n", allGuesses.toString());
                System.out.print("Guess a letter: ");
                String guess = input.next();
                char character = guess.charAt(0);
                System.out.println("");
                if (phrase.lookForChar(character) == true) {
                    correctGuesses.add(character);                   
                    if (correctGuesses.containsAll(checkList)) {                   
                        wonGame = true;
                        break;
                    }
                } else {              
                    //if returns false, call the next Draw() method, decrement guess. use switch statement here. if guesses > 7, break with you lose
                    allGuesses.add(character);
                    drawPhase++;
                    remainingGuesses--;
                    if (remainingGuesses == 0) {
                        break;
                    }
                }
                drawing.DrawCurrent(drawPhase);
                phrase.PrintPhrase(correctGuesses);
                System.out.println("");
            }        
            if (wonGame) {
                drawing.DrawWin();
                phrase.PrintPhrase(correctGuesses);
                System.out.println("You win!");
            }
            else {
                drawing.DrawCurrent(drawPhase);
                System.out.println("You lose.");
            }   
        }    
    }
}
