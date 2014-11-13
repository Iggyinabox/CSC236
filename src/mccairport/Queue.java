/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 5
 */
package mccairport;

/**
 * A queue interface. The queue will hold the value of its size and know if it
 * is empty. Items can be added and removed from the quote. You can also
 * look at the next element that is ready to leave the queue
 * @author ilorenzo
 */
public interface Queue<T> {
    
    //Add the item element to the back of the queue
    public void enqueue(T item);
    
    //Removes the item infront of the queue and returns it
    //Precondition: The queue cannot be empty
    //If the queue is empty throw NoSuchElementException
    public T dequeue();
    
    //Returns the front item from the queue without removing it from the queue
    //Precondition: The queue cannot be empty
    //If the queue is empty throw NoSuchElementException
    public T peek();
    
    //returns the number of items currently in the queue;
    public int count();
    
    //Returns true if the queue is empty false otherwise
    public boolean isEmpty();
    
    
}
