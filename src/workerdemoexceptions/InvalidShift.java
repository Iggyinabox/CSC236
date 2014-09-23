/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 1-C
 */
package workerdemoexceptions;

/**
 * This exception is thrown when shift is set to an invalid int. The valid
 * ints are 1 for Day and 2 for night.
 * @author ilorenzo
 */
public class InvalidShift extends Exception {
    
    public InvalidShift(){
        super("Error: Invalid Shifrt");
    }
    
    public InvalidShift(int shift){
        super("Error: " + shift + " is an invlid shift");
    }
}
