/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 3-A
 */
package Polynomial;

/**
 * This class demonstrates the Polynomial class in all its splendor.
 * @author ilorenzo
 */
public class PolynomialDemo {
    
    public static void main(String[] args){
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial polySum = new Polynomial();
        
        //Fist Test Code
        /*
        p1.addPolyNode(4, 3);
        p1.addPolyNode(3, 2);
        p1.addPolyNode(-5, -1);
        System.out.println("P1: " + p1.toString());
        
        p2.addPolyNode(3, 5);
        p2.addPolyNode(4, 4);
        p2.addPolyNode(1, 3);
        p2.addPolyNode(-4, 2);
        p2.addPolyNode(4, 1);
        p2.addPolyNode(2, -1);
        
        System.out.println("P2: " + p2.toString());
        */
        
        
        //Second Test Code
        p1.addPolyNode(3, 5);
        p1.addPolyNode(2, 4);
        p1.addPolyNode(5, 3);
        p1.addPolyNode(7, 2);
        p1.addPolyNode(4, 1);
        p1.addPolyNode(7, -1);
        
        System.out.println("P1: " + p1.toString());
        
        p2.addPolyNode(4, 3);
        p2.addPolyNode(3, 2);
        p2.addPolyNode(-5, -1);
        
        System.out.println("P2: " + p2.toString());
        
        polySum = p1.addPolynomials(p2);
        
        System.out.println("P1 + P2 = " + polySum.toString());
        
    }
    
}
