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
public class HumanPowered extends Vehicle {
    
   
    private String methodPropulsion;
    
    public HumanPowered (String methodPropulsion, String ownerName) {
        super(ownerName);
        this.methodPropulsion = methodPropulsion;
        
    }
    
    
    public String getMethodPropulsion (){
        return this.methodPropulsion;
    }
    
}
