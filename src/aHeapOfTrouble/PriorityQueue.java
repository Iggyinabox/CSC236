/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 6-B
 */
package aHeapOfTrouble;

/**
 *
 * @author ilorenzo
 */
public interface PriorityQueue<T extends Comparable<T>> {
    //return true if heap is empty
    boolean isEmpty();
    //return true if heap is full
    boolean isFull();
    //pushes element into the queue and drives it up the heap is needed
    //Precondition: heap must have room.
    //Throws PriorityQOverflowException if heap if full
    void enqueue(T element);
    
    //Pop top or root element out of the heap and returns it. The lowest item
    //is swaped to the top and pushed down the heap
    //Precondition: heap cannot be empty
    //Throws PriorityQUnderflowException is heap is empty
    T dequeue();
    
}
