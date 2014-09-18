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
public class InvalidEmployeeNumber extends Exception {
    
    public InvalidEmployeeNumber(){
        super("Error: Invalid Employee Id");
    }
    
    public InvalidEmployeeNumber(String id){
        super("Error: " + id + " is an Invalid Employee Id");    
    }
        
}
