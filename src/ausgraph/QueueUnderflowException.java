/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 6-B
 */
package ausgraph;


/**
 *
 * @author ilorenzo
 */
public class QueueUnderflowException extends RuntimeException{
    
    public QueueUnderflowException(){
        super();
    }
    
    public QueueUnderflowException(String msg){
        super(msg);
    }
    
}
