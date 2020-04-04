/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.*;
/**
 *
 * @author Deema <deema2002@live.ca>
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("***** Question 1 *****");
        
        System.out.println("Enter a word: ");
        Scanner scan = new Scanner (System.in);
        String word = scan.next();
        word = word.replaceAll(" ", "").toLowerCase();
        int forward = 0;
        int backward = word.length()-1;
    

        Palindrome.isPalindrome(word, forward, backward);
            if (Palindrome.isPalindrome(word, forward, backward)){
                System.out.println("\"" + word + "\" is a palindrome!");
            }
            else{
                System.out.println("\"" + word + "\" is not a palindrome!");       
                    }  
            
            
        System.out.println("***** Question 2 *****");    
        
        System.out.println("Enter an email to validate: ");
        String email = scan.next();
        
        EmailCheck.IsValid(email);
            
        
        
        }
}

    
    
