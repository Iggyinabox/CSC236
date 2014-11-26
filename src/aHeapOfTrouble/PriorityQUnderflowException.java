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
public class PriorityQUnderflowException extends RuntimeException{
    
    public PriorityQUnderflowException(){
        super();
    }
    
    public PriorityQUnderflowException(String msg){
        super(msg);
    }
    
}
