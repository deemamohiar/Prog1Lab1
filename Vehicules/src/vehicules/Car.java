/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicules;

/**
 *
 * @author deema
 */
public class Car extends Motorized implements IPassengerVehicle{
    
    private int nbPassengers;
    
    public Car(String ownerName){
        super(ownerName);
        this.nbPassengers = 0;
    }
    
    public int getPassengerCount(){
        return this.nbPassengers;
    }
    
    public void setNbPassengers (int nbPassengers){
        this.nbPassengers= nbPassengers;
    }
}
