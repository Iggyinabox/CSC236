/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 4-C
 */
package Palindrome;

import java.util.NoSuchElementException;
//import stack interface
import primefactors.Stack; 
/**
 * This is a Stack Array Class
 * @author ilorenzo
 */
public class StackArray<T> implements Stack<T> {
    
    private T[] arr;
    private int size;
    //Defult constuctor
    public StackArray(){
        arr = (T[]) new Object[2];
    }
    //Constructor used when setting capacity
    public StackArray(int capacity){
        arr = (T[]) new Object[capacity];
    }
    //This method resizes the array by creating a new array with bigger 
    //capacity. Then coping over the old array to this temp array, and
    //finally changing the refence of the StackArray to the new array
    private void resize(int capacity){
        T[] temp = (T[]) new Object[capacity];
        System.arraycopy(arr, 0, temp, 0, size);
        arr = temp;
    }
    
    //Push a element into the Stack. If the array is at capacity
    //increase the capacity of the array by double.
    public void push(T value){
        if(arr.length == size)
            resize(arr.length *2);
        arr[size++] = value;
    }
    
    //Pop an element out of the stack and return the value
    //If statck is empty the method throws an exception
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
