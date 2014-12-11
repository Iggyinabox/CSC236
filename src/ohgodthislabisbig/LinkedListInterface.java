/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 7-A
 */
package ohgodthislabisbig;

/**
 *
 * @author ilorenzo
 */
public interface LinkedListInterface<T> extends Cloneable {
    
    //Copys and returns an objects data
    //Only the refences are stored are cloned not the objects themselves
    public Object clone();
    
    //Method to check if the list in empty
    public boolean isEmpty();
    
    //Method that outputs the data contained in each node
    public void print();
    
    //Returns the number of nodes in the list
    public int length();
    
    //Returns the node at the front of the list
    //Preconditions:The list cannot be empty
    public T front();
    
    //Returns the node at the back of the list
    //Precondition: the list cannot be empty
    public T back();
    
    //method that check to see if item is in the list
    public boolean search(T item);
    
    //Method that inserts a new item to the front of the list
    public void insertFirst(T newItem);
    
    //Method that inserts a new item to the back of the list
    public void insertLast(T newItem);
    
    //method to delete the item passed to it from the list
    public void deleteNode(T item);
    
}
