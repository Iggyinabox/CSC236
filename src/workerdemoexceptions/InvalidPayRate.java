/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 1-C
 */
package workerdemoexceptions;

/**
 * This exceptions is thrown when a employees pay rate is set below 0
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
