/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 4-A
 */
package interfaces;

import primefactors.*;

/**
 *
 * @author ilorenzo
 */
public interface Stack<T> {
    void push(T value);
    T pop();
}
