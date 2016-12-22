/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.ArrayList;

/**
 *
 * @author VC-019
 */
public class Phrase {
    
    private char[] phraseArray;
    
    //constructor which takes String in, casts it to character array
    public Phrase (String phrase) {
        this.phraseArray = phrase.toCharArray();
    }
    
    //checks to see if guessed character is part of phrase
    public boolean lookForChar (char guess) {     
        for ( char c: this.getPhraseArray()) {
            if (c == guess) {
                return true;                
            }
        }
        return false;
    }
    
    
    public ArrayList<Character> toList() {
        ArrayList<Character> newList = new ArrayList<>();
        for ( char c: this.getPhraseArray()) {
            newList.add(c);
        }
        return newList;
    }
    
    public void PrintEmptyPhrase() {
        for (char c : this.getPhraseArray() ) {
            if (c == ' ') { 
                System.out.print("  ");
            }
            else {
                System.out.print("_ ");
            }
        }
        System.out.println("");
    }
    
    public void PrintPhrase(ArrayList correctGuesses) {
        for (char c : this.getPhraseArray() ) {
            if (c == ' ') {
                System.out.print("  ");
            }
            else if (correctGuesses.contains(c)) {
                System.out.print(c + " ");
            }
            else {
                System.out.print("_ ");
            }
        }
        System.out.println("");
    }

    /**
     * @return the phraseArray
     */
    public char[] getPhraseArray() {
        return phraseArray;
    }

    /**
     * @param phraseArray the phraseArray to set
     */
    public void setPhraseArray(char[] phraseArray) {
        this.phraseArray = phraseArray;
    }

}
