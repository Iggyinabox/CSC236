/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 6-B
 */
package aHeapOfTrouble;

/**
 *
 * @author ilorenzo
 */
public class PriorityQOverflowException extends RuntimeException{
    
    public PriorityQOverflowException(){
        super();
    }
    
    public PriorityQOverflowException(String msg){
        super(msg);
    }
    
}
