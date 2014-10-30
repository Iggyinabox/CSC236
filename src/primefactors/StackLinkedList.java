/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 4-A
 */
package primefactors;

import java.util.NoSuchElementException;

/**
 *
 * @author ilorenzo
 */
public class StackLinkedList<T> implements Stack<T> {
    
    private int size;
    private Node top;
    
    public class Node{
        private T value;
        private Node next;
    }

    public void push(T value){
        Node temp = top;
        top = new Node();
        top.value = value;
        top.next = temp;
        size++;
    }

    public T pop(){
        if(top == null)
            throw new NoSuchElementException();
        T value = top.value;
        top = top.next;
        size--;
        return value;
    }
    
    public boolean empty(){
        return top == null;
    }
    
    public boolean hasNext(){
        return size > 0;
    }
    
}
