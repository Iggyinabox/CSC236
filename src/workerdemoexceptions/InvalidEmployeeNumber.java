/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 1-C
 */
package workerdemoexceptions;

/**
 * This exception is thrown when an id is set for an employee that does not
 * match the following criteria:
 * - 3 integers
 * @author ilorenzo
 */
public class InvalidEmployeeNumber extends Exception {
    
    public InvalidEmployeeNumber(){
        super("Error: Invalid Employee Id");
    }
    
    public InvalidEmployeeNumber(String id){
        super("Error: " + id + " is an Invalid Employee Id");    
    }
        
}
