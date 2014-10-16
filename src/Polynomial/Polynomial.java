/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 3-A
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
 * The Polynomial class simulates a polynomial expression with 
 * coefficients, variables, and exponents.
 * @author ilorenzo
 */
public class Polynomial {
    
    private PolyNode firstNode;
    
    public Polynomial(){
        //create an empty polynomial
        firstNode = null;
    }
    
    public Polynomial(int coefficient, int exponent){
        //create a polynomial with the first node set.
        firstNode = new PolyNode(coefficient,exponent,null);
    }
    
    public boolean isEmpty(){
        return firstNode == null; //check if the Polynomial is empty
    }
    
    public void setFirstNode(PolyNode firstNode){
        this.firstNode = firstNode;
    }
    
    public PolyNode getFirstNode(){
        return firstNode;
    }
    
    public void addPolyNodeFirst(int coefficient, int exponent){
        //Check to see if exponent is a positive number(-1 = no exponent)
        if(exponent < -1)
            throw new IllegalArgumentException("Exponent must be a positive"
                    + " integer.");
        //Check to see if Polynomial is empty
        if(isEmpty())
            firstNode = new PolyNode(coefficient, exponent, null);
        else
            firstNode = new PolyNode(coefficient, exponent, firstNode);
    }
    
    public void addPolyNodeLast(int coefficient, int exponent){
        //Check to see if exponent is a positive number(-1 = no exponent)
        if(exponent < -1)
            throw new IllegalArgumentException("Exponent must be a positive"
                    + " integer.");
        //Check to see if Polynomial is empty
        if(isEmpty())
            firstNode = new PolyNode(coefficient, exponent, null);
        else{
            PolyNode current = firstNode;
            while(current.getNext() != null)
                current = current.getNext();
            
            current.setNext(new PolyNode(coefficient, exponent, null));
        }
    }
    
    public boolean addPolyNode(int coefficient, int exponent){
        //Check to see if exponent is a positive number(-1 = no exponent)
        if(exponent < -1)
            throw new IllegalArgumentException("Exponent must be a positive"
                    + " integer.");
        //Check to see if Polynomial is empty
        if(isEmpty()){
            firstNode = new PolyNode(coefficient, exponent, null);
            return true;//A change was made to the Polynomial
        }
        else if(!isEmpty()){
            PolyNode current = firstNode;
            while(current.getNext() != null)
                current = current.getNext();
            
            current.setNext(new PolyNode(coefficient, exponent, null));
            return true;//A change was made to the Polynomial
        }
        return false;//No changes where made to the Polynomial
    }
    
    public Polynomial addPolynomials(Polynomial p2){
        Polynomial polySum = new Polynomial();
        
        int x, y;
        
        PolyNode tempNode1 = this.firstNode;
        PolyNode tempNode2 = p2.firstNode;
        
        while(tempNode1 != null && tempNode2 != null){
            if(tempNode1.getExponent() == tempNode2.getExponent()){
                x = tempNode1.getCoefficient() + tempNode2.getCoefficient();
                y = tempNode1.getExponent();
                tempNode1 = tempNode1.getNext();
                tempNode2 = tempNode2.getNext();
            }else if(tempNode1.getExponent() > tempNode2.getExponent()){
                x = tempNode1.getCoefficient();
                y = tempNode1.getExponent();
                tempNode1 = tempNode1.getNext();
            }else{
                x = tempNode2.getCoefficient();
                y = tempNode2.getExponent();
                tempNode2 = tempNode2.getNext();
            }
            polySum.addPolyNode(x, y);
        }
        
        while(tempNode1 != null){
            x = tempNode1.getCoefficient();
            y = tempNode1.getExponent();
            tempNode1 = tempNode1.getNext();
            polySum.addPolyNode(x, y);
        }
        
        while(tempNode2 != null){
            x = tempNode2.getCoefficient();
            y = tempNode2.getExponent();
            tempNode2 = tempNode2.getNext();
            polySum.addPolyNode(x, y);
        }
        return polySum;
    }
    
    @Override
    public String toString(){
        PolyNode current = firstNode;
        String str = "";
        
        if(isEmpty())
            return "The polynomial is empty!";
        
        while(current != null){
            
            if(current == firstNode)
                str += current.getCoefficient();
            
            if(current != firstNode && current.getCoefficient() > 0)
                str+= " + " + current.getCoefficient();
            else if(current != firstNode && current.getCoefficient() < 0){
                str +=" - " + Math.abs(current.getCoefficient());
            }
            
            //check to see if the current variable has an exponent
            if(current.getExponent() != -1)
                str += "x";
            //check to see if the exponent is greater that one
            //if not only the variable will show otherwise
            //the exponent will be added to x
            if(current.getExponent() > 1)
                str += "^" + current.getExponent() + " ";
            current = current.getNext();
        }
        
        
        return str;
        
        
        
        
    }
}
