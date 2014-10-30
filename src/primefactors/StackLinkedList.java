/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 4-A and B
 */
package primefactors;

import java.util.NoSuchElementException;

/**
 * This is a linked list stack that implements a user defined stack interface
 * @author ilorenzo
 */
public class StackLinkedList<T> implements Stack<T> {
    
    private int size;
    private Node top;
    
    public class Node{
        private T value;
        private Node next;
    }
    
    public StackLinkedList(){
        size = 0;
        top = null;
    }
    //Method pushes a node into the stack that holds a value and increments
    //the size global variable.
    public void push(T value){
        Node temp = top;
        top = new Node();
        top.value = value;
        top.next = temp;
        size++;
    }
    //Method pops out a node from the stack and returns it's value. The size
    //global variable is decremented.
    public T pop(){
        if(top == null)
            throw new NoSuchElementException();
        T value = top.value;
        top = top.next;
        size--;
        return value;
    }
    //Returns true if stack is empty false otherwise
    public boolean empty(){
        return top == null;
    }
    //Checks to see if stack has next.
    public boolean hasNext(){
        return size > 0;
    }
    
}
