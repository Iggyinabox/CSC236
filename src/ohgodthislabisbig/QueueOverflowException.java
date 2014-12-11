/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 6-B
 */
package ohgodthislabisbig;

/**
 *
 * @author ilorenzo
 */
public class QueueOverflowException extends RuntimeException{
    
    public QueueOverflowException(){
        super();
    }
    
    public QueueOverflowException(String msg){
        super(msg);
    }
    
}
