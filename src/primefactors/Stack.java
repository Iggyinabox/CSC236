/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 4-A and B and C
 */
package primefactors;

/**
 * An interface for a Stack
 * @author ilorenzo
 */
public interface Stack<T> {
    //Pushes a value into the collection
    void push(T value);
    //Pops a element out of the collection and returns any value the 
    //elemnt held
    //Precondition: The stack cannot be empty
    //Throws NoSuchElementException if stack is empty
    T pop();
}
