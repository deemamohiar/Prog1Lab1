/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19;

import java.util.Scanner;
/**
 * Write a short game about social behaviour in COVID-19 times.
You should use a switch/case to present the user a menu, and keep track of points. Points start at zero. 
* Each option on the menu will result in the user gaining or loosing points. 
* At the end of the game (exit option), the user is presented the amount of points as a result of the play. 
While the user does not choose to exit, the game should be repeating the menu.
Those are the menu options and corresponding points:
(a) Wash your hand very often [+1]
(b) Only go out if necessary [+1]
(c) Visit an elderly person, and shake hands [-1]
(d) Play with kids in a birthday party [-1]
(x) Exit
 *
 * @author Deema <deema2002@live.ca>
 */
public class COVID19 {

    public static void main(String[] args) {
        int points = 0;
        char entry;
        final char a  = 'a';
        final char b = 'b';
        final char c = 'c';
        final char d ='d';
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Let's play a COVID-19 game!\n Enter one menu option at a time:");
        System.out.println("(a) Wash your hand very often [+1]\n" +
        "(b) Only go out if necessary [+1]\n" +
        "(c) Visit an elderly person, and shake hands [-1]\n" +
        "(d) Play with kids in a birthday party [-1]\n" +
        "(x) Exit");
        
        do{
        System.out.println("Enter menu option: ");
        entry = scan.next().charAt(0);
       
         switch (entry){
            case a:
            points++;   
            break;
            case b:
            points++;
            break;
            case c:
            points--;
            break;
            case d:
            points--;
            break;
        }
        }while(entry!='x');
        
             System.out.println("Your total number of points is: "+ points);
         
            
               
        }
       
    }


