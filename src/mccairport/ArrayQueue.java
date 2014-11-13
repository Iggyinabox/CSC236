/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 5
 */
package mccairport;

import java.util.NoSuchElementException;

/**
 * This is an array implementation of a queue. This class implements a user
 * defined queue interface.
 * @author ilorenzo
 */
public class ArrayQueue<T> implements Queue<T> {
    
    private int queueCapacity;
    
    private T[] elements;
    private int count;
    private int front;
    private int back;
    
    public ArrayQueue(){
        this(20);
    }
    
    public ArrayQueue(int queueCapacity){
        this.queueCapacity = queueCapacity;
        elements = (T[]) new Object[this.queueCapacity];
        front = 0;
        back = 0;
        count = 0;
    }
    
    @Override
    public void enqueue(T item) {
        if(back ==  elements.length)
            expandQueue(2*elements.length);
        if(back == elements.length) 
            back = 0;
        count++;
    }

    @Override
    public T dequeue() {
        if(isEmpty())
            throw new NoSuchElementException("Queue Underflow: Queue is empty");
        T value = elements[front];
        elements[front] = null;
        count--;
        front++;
        if(front == elements.length)
            front = 0;
        if(count > 0 && count == elements.length/4)
            expandQueue(2*elements.length);
        return value;
            
    }

    @Override
    public T peek() {
        if(isEmpty())
            throw new NoSuchElementException("Queue Underflow: Queue is empty");
        return elements[front];
    }

    @Override
    public int count() {
       return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
    
    public void expandQueue(int newMax){
        T[] temp = (T[]) new Object[newMax];
        for(int i = 0; i < elements.length; i++){
            temp[i] = elements[(front + i) % elements.length];
        }
        elements = temp;
        front = 0;
        back = count;
    }
    
}
