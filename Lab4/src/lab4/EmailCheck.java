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
public class EmailCheck {
    
    
    public static void IsValid (String email){
    
   boolean foundAt = false;
   boolean foundDot = false;
   
        for (int i =0; i<email.length(); i++){
            if( (email.charAt(i)== '@')&&(i!=0)&&(i!=email.length()-1) ){
            foundAt = true;
        }
            else if ( (email.charAt(i)=='.')&&(i!=0)&&(i!=email.length()-1) ){
            foundDot = true;
        }
}
       if (foundAt && foundDot){
           System.out.println("This email is valid.");
       }
       else{
           System.out.println("This email is invalid.");
       }
    }
}
