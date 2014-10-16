/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 3-A
 */

package Polynomial;

/**
 * 
 * @author ilorenzo
 */
public class PolyNode {
    private int coefficient;
    private int exponent;
    private PolyNode next;
    
    public PolyNode(){
        coefficient = 0;
        exponent = 0;
        next = null;
    }
    
    public PolyNode(int coefficient, int exponent, PolyNode next){
        this.coefficient = coefficient;
        this.exponent = exponent;
        this.next = next;   
    }
    
    public void setCoefficient(int coefficient){
        this.coefficient = coefficient;
    }
    
    public int getCoefficient(){
        return coefficient;
    }
    
    public void setExponent(int exponent){
        this.exponent = exponent;
    }
    
    public int getExponent(){
        return exponent;
    }
    
    public void setNext(PolyNode next){
        this.next = next;
    }
    
    public PolyNode getNext(){
        return next;
    }
    
}
