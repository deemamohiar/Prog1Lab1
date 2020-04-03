/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicules;
import java.util.Scanner;
/**
 *
 * @author deema
 */
public class Vehicules {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Who is the owner of the car?");
        String ownerName = scan.nextLine();
       
        Car D = new Car (ownerName);
       int counter = 0;
        while (counter > 3){ 
            counter++;
           System.out.println("How many passengers got in your car?");
           int nbPassengers = scan.nextInt();
           D.setNbPassengers(nbPassengers + D.getPassengerCount());
           System.out.println(ownerName + "'s car has " + D.getPassengerCount() + " passengers.");
        }
       
    }
    
    
    
}
