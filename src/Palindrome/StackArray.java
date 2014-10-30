/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 4-C
 */
package Palindrome;

import java.util.NoSuchElementException;
import primefactors.Stack; 
/**
 *
 * @author ilorenzo
 */
public class StackArray<T> implements Stack<T> {
    
    private T[] arr;
    private int size;
    
    public StackArray(){
        arr = (T[]) new Object[2];
    }
    
    public StackArray(int capacity){
        arr = (T[]) new Object[capacity];
    }
    
    private void resize(int capacity){
        T[] temp = (T[]) new Object[capacity];
        System.arraycopy(arr, 0, temp, 0, size);
        arr = temp;
    }
    
    
    public void push(T value){
        if(arr.length == size)
            resize(arr.length *2);
        arr[size++] = value;
    }
    
    public T pop(){
        if(size == 0)
            throw new NoSuchElementException();
        T value = arr[--size];
        arr[size] = null;
        if(size > 0 && size == arr.length / 4)
            resize(arr.length / 2);
        return value;
    }
    
}
