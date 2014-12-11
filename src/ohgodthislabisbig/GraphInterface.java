/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 7-A
 */
package ohgodthislabisbig;

/**
 * This interface is for a class the implements a directed graph.
 * Vertices are obj of the class T and can be marked as having been visited.
 * @author ilorenzo
 */
public interface GraphInterface {
    
    //Method to check if the graph is empty
    public boolean isEmpty();
    
    //Creates the grpah
    //Precondition: The Grpah is created using the adjacency list rep
    public void createGraph();
    
    //Clears the graph
    public void clearGraph();
    
    //method to print the grpah
    public void printGraph();
    
    //Method to perform dephth first traversal of the grpah
    //Postcondition: The verts of the graph in the DFT order are output
    public void depthFirstTraversal();
    
    //Method performs a DFT at the given vertext
    public void dftAtVertex(int vertex);
    
    //Method to perform breadth first traversal of the grpah
    public void breadthFirstTraversal();
}
