/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Deema <deema2002@live.ca>
 */
public class Palindrome {
    
    public static boolean isPalindrome (String word, int forward, int backward){
        while (backward>forward){
        char advance = word.charAt(forward++);
        char back = word.charAt(backward--);
        if(advance != back){
           return false;
        }
        
        }
      return true; 
         
        }

   
}
