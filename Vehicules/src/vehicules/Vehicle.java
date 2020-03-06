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
public class Vehicle {
    
    private String ownerName;
    
    protected String driverName;
    
    public Vehicle (String ownerName) {
           this.ownerName = ownerName;
       }
    
    public String getOwnerName () {
        return this.ownerName;
    }
    
    public void setDriverName (String driverName){
        this.driverName = driverName;
    }
    
    public String getDriverName () {
        return this.driverName;
    }
 }
