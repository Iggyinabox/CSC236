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
public class InvalidShift extends Exception {
    
    public InvalidShift(){
        super("Error: Invalid Shifrt");
    }
    
    public InvalidShift(int shift){
        super("Error: " + shift + " is and invlid shift");
    }
}
