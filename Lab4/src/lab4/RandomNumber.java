/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Deema <deema2002@live.ca>
 */
public class RandomNumber {
    private int guess;
    
    public static void guessNumber (int guess){
        
    Random r = new Random();
    int number = r.nextInt(101);
    int tries = 10;  
    while( tries>0 && guess!=number){
        if (tries==1){
            System.out.println("You have " + tries + " try left.\nEnter your guess.");
        }
        else{
        System.out.println("You have " + tries + " tries left.\nEnter your guess.");
        }
        Scanner scan = new Scanner (System.in);
        guess = scan.nextInt();
        if(guess!=number){
            System.out.println("Incorrect. try again.");
            tries--;
        }
    }
       
    if(guess==number){
        System.out.println("You guessed correctly! The number was " + number + ".\n Great job :)");
    }
    else{
        System.out.println("You were unable to guess the number. It was "  + r +"\nBetter luck next time.");
    }
    }
    public int getGuess (){
        return this.guess;
    }
    
    public void setGuess (int guess){
        this.guess = guess;
    }
    }


