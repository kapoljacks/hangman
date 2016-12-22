/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author VC-019
 */
public class Drawing {
    
    public void DrawCurrent(int drawPhase) {
        switch (drawPhase) {
            case 1: DrawEmpty();
            break;
            case 2: DrawNoose();
            break;
            case 3: DrawHead();
            break;
            case 4: DrawArmOne();
            break;
            case 5: DrawArmTwo();
            break;
            case 6: DrawBody();
            break;
            case 7: DrawLegOne();
            break;
            case 8: DrawFull();
            break;
        }
    }
    
    public void DrawFull(){
        System.out.println("	+-------+");
        System.out.println("	||	8");
        System.out.println("	||	|");
        System.out.println("	||	@");
        System.out.println("	||     /|\\");
        System.out.println("	||     / \\");
        System.out.println("	|| ");
        System.out.println("________||_________\n");
    }
    
    public void DrawEmpty(){
        System.out.println("	+-------+");
        System.out.println("	||	");
        System.out.println("	||	");
        System.out.println("	||	");
        System.out.println("	||     ");
        System.out.println("	||     ");
        System.out.println("	|| ");
        System.out.println("________||_________\n");
    }
        
    private void DrawNoose(){
        System.out.println("	+-------+");
        System.out.println("	||	8");
        System.out.println("	||	|");
        System.out.println("	||	");
        System.out.println("	||     ");
        System.out.println("	||     ");
        System.out.println("	|| ");
        System.out.println("________||_________\n");
    }
        
    private void DrawHead(){
        System.out.println("	+-------+");
        System.out.println("	||	8");
        System.out.println("	||	|");
        System.out.println("	||	@");
        System.out.println("	||     ");
        System.out.println("	||     ");
        System.out.println("	|| ");
        System.out.println("________||_________\n");
    }
        
    private void DrawArmOne(){
        System.out.println("	+-------+");
        System.out.println("	||	8");
        System.out.println("	||	|");
        System.out.println("	||	@");
        System.out.println("	||     / ");
        System.out.println("	||     ");
        System.out.println("	|| ");
        System.out.println("________||_________\n");
    }
    
    private void DrawArmTwo(){
        System.out.println("	+-------+");
        System.out.println("	||	8");
        System.out.println("	||	|");
        System.out.println("	||	@");
        System.out.println("	||     / \\");
        System.out.println("	||     ");
        System.out.println("	|| ");
        System.out.println("________||_________\n");
    }
    
    private void DrawBody(){
        System.out.println("	+-------+");
        System.out.println("	||	8");
        System.out.println("	||	|");
        System.out.println("	||	@");
        System.out.println("	||     /|\\");
        System.out.println("	||     ");
        System.out.println("	|| ");
        System.out.println("________||_________\n");
    }
    
    private void DrawLegOne(){
        System.out.println("	+-------+");
        System.out.println("	||	8");
        System.out.println("	||	|");
        System.out.println("	||	@");
        System.out.println("	||     /|\\");
        System.out.println("	||     / ");
        System.out.println("	|| ");
        System.out.println("________||_________\n");
    }
    
    public void DrawWin(){
        System.out.println("	+-------+");
        System.out.println("	||	8");
        System.out.println("	||	|");
        System.out.println("	||	");
        System.out.println("	||     ");
        System.out.println("	||     ");
        System.out.println("	|| ");
        System.out.println("________||________\n");
    }
    
        
}

