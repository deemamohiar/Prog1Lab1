/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Scanner;
/**
*For each reading, you should only output “Input: value”, value being the number the user input.
*At the end of the readings (after the user inputs zero), your program should output how many of them refer to a condition of fever 
* greater than 37.5), what was the maximum temperature achieved, and what was the average temperature of all.
*Attention to not consider zero as a valid temperature.
 * @author Deema <deema2002@live.ca>
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        double temp;
        int nbFever = 0;
        int i =0;
        double sum= 0;
        double maxTemp=0;
        Scanner scan = new Scanner (System.in);
      
        do{
            System.out.println("Enter temperature: ");
            temp = (double)scan.nextDouble();
            System.out.println("Input: "+ temp);
            if(temp>37.5){
            nbFever++;
            }
            if (temp!=0){
            i++;
            }
            if(temp!=0){
            sum+=temp;
            }
            if(temp>maxTemp){
                maxTemp = temp;
            }
            } while (temp!=0);
       
        System.out.println("The temperature was above 37.5 " + nbFever + " time(s).");
        System.out.println("The maximum temperature was: " + maxTemp + " degrees.");
        System.out.println("The average temperature was: " + sum/i + " degrees.");
        
        
    }
    }

    
    

