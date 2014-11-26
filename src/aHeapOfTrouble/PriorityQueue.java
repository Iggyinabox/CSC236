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
    
    boolean isEmpty();
    
    boolean isFull();
    
    void enqueue(T element);
    
    T dequeue();
    
}
