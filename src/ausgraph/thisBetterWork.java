/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 7-A
 */
package ausgraph;



/**
 * Testing the Graph Class
 * @author ilorenzo
 */
public class thisBetterWork {
    
    public static void main(String[]args){
        Graph g1 = new Graph();
        g1.createGraph();
        System.out.println("Depth-First Traversal:");
        g1.depthFirstTraversal();
        System.out.println("\nBreadth-First Traversal:");
        g1.breadthFirstTraversal();
        System.out.println();
        
    }
}
