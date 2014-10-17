/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab NumberHere
 */

/**
 * Class Polynomial:
 * public class Polynomial
 *          The Polynomial class simulates a polynomial expression with 
 *          coefficients, variables, and exponents.
 * 
 * Parameters:
 * firstNode → a reference to the node at the front of the Polynomial
 * 
 * Specification:
 * constructor for the Polynomial
 * public Polynomial()
 * creates an empty Polynomial
 * 
 * public Polynomial(int coefficient, int exponents)
 * creates a Polynomial with the first node set
 * 
 * public boolean isEmpty()
 * returns ture if Polynomial is empty
 * 
 * public void setFirstNode(PolyNode firstNode)
 * changes the first node on the Polynomial
 * 
 * Parameters:
 * node → a node that holds a coefficient and an exponent
 * 
 * public PolyNode getFirstNode()
 * access the first node
 * 
 * public void addPolyNodeFirst(int coefficient, int exponent)
 * add new node to the front of the Polynomial
 * 
 * Parameters:
 * coefficient → any integer on its own. A fixed number
 * exponent → a number that tells you how many times to multiply the
 *            coefficient it is paired with by itself.
 * 
 * Precondition: exponent > 0
 * 
 * Throws: IllegalArgumentException
 *          Indicates that exponent is not positive
 * 
 * public void addPolyNodeLast(int coefficient, int exponent)
 * add new node to the end of the Polynomial
 * 
 * Parameters:
 * coefficient → any integer on its own. A fixed number
 * exponent → a number that tells you how many times to multiply the
 *            coefficient it is paired with by itself.
 * 
 * Precondition: exponent > 0
 * 
 * Throws: IllegalArgumentException
 *          Indicates that exponent is not positive
 *          
 * 
 * public boolean add PolyNode(int coefficient, int exponent)
 * Adds node to the Polynomial. When a change is successfully made this
 * returns true otherwise false.
 * 
 * Parameters:
 * coefficient → any integer on its own. A fixed number
 * exponent → a number that tells you how many times to multiply the
 *            coefficient it is paired with by itself.
 * 
 * Precondition: exponent > 0
 * 
 * Throws: IllegalArgumentException
 *          Indicates that exponent is not positive
 * 
 * public Polynomial addPolynomials(Polynomial p2)
 * Adds two Polynomial's like terms and returns a reference to 
 * the new expression.
 * 
 * public string toString()
 * Returns a string of the Polynomial
 * 
 * file: Polynomial.java
 */
package Polynomial;

/**
 *
 * @author ilorenzo
 */
public interface PolynomialADT {
    
    boolean isEmpty();
    PolyNode getFirstNode();
    void addPolyNodeFirst(int coefficient, int exponent);
    public void addPolyNodeLast(int coefficient, int exponent);
    boolean addPolyNode(int coefficient, int exponent);
    Polynomial addPolynomials(Polynomial p2);
    
}

