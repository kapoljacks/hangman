/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Random;

/**
 *
 * @author VC-019
 */
public class Generator {
    
    private String[] randomPhrases = {"hello World", "be the ball", "black and white", 
                                        "bread and butter", "raining cats and dogs", "clean as a whistle", "the whole nine yards",
                                        "hook line and sinker", "rock the boat", "reach for the sky"};
    
    private Random rng = new Random();
    int seed = rng.nextInt(10); 
    
    public String getRandomPhrase() {
        return randomPhrases[seed];
    }
    
}
