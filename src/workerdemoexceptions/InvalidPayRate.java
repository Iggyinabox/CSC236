/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab NumberHere
 */
package workerdemoexceptions;

/**
 *
 * @author ilorenzo
 */
public class InvalidPayRate extends Exception{
    
    public InvalidPayRate(){
        super("Error: Invalid PayRate");
    }
    
    public InvalidPayRate(double rate){
        super("Error: $" + rate + " is not a valid PayRate");
    }
    
}
