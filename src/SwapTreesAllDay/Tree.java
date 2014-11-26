/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 6-A
 */
package SwapTreesAllDay;

/**
 *
 * @author ilorenzo
 */
public interface Tree{
    //returns true if Tree is empty
    boolean isEmpty();
    //incert value into the tree.
    void insert(int value);
    //Print the tree inorder
    void printTree();
}
