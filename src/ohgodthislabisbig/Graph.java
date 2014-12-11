/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 7-A
 */
package ohgodthislabisbig;

import java.util.*;
import java.io.*;

/**
 *
 * @author ilorenzo
 */
public class Graph implements GraphInterface {
    protected int maxSize;          //maximum number of vertices
    protected int gSize;            //current number of vertices
    protected UnorderedLinkedList[] graph;
    
    public Graph(){
        maxSize = 100;
        gSize = 0;
        graph = new UnorderedLinkedList[maxSize];

        for (int i = 0; i < maxSize; i++)
            graph[i] = new UnorderedLinkedList<Integer>();
    }

    public Graph(int size){
        maxSize = size;
        gSize = 0;
        graph  = new UnorderedLinkedList[maxSize];

        for (int i = 0; i < maxSize; i++)
            graph[i] = new UnorderedLinkedList<Integer>();
    }

    //Method to check if the graph is empty
    public boolean isEmpty(){
        return (gSize == 0);
    }

    //Creates the grpah
    //Precondition: The Grpah is created using the adjacency list rep
    public void createGraph(){
        Scanner console = new Scanner(System.in);

        String fileName;

        if (gSize != 0)
            clearGraph();

        Scanner infile = null;

        try{
            System.out.print("Enter input file name: ");
            fileName = console.nextLine();
            System.out.println();

            infile = new Scanner(new FileReader(fileName));
        }
        catch (FileNotFoundException fnfe){
            System.out.println(fnfe.toString());
            System.exit(0);
        }

        gSize = infile.nextInt(); //get the number of vertices

        for (int index = 0; index < gSize; index++){
            int vertex = infile.nextInt();
            int adjacentVertex = infile.nextInt();

            while (adjacentVertex != -999){
                graph[vertex].insertLast(adjacentVertex);
                adjacentVertex = infile.nextInt();
            }
        } 
    }


    //Clears the graph
    public void clearGraph(){
        for (int index = 0; index < gSize; index++)
            graph[index] = null;

        gSize = 0;
    }

     //method to print the grpah
    public void printGraph(){
        for (int index = 0; index < gSize; index++){
            System.out.print(index + " ");
            graph[index].print();
            System.out.println();
        }

        System.out.println();
    }

    //DFT recrsive method
    private void dft(int v, boolean[] visited){
        visited[v] = true;

        System.out.print(" " + v + " ");  //visit the vertex

        UnorderedLinkedList<Integer>.
                 LinkedListIterator<Integer> graphIt
                                = graph[v].iterator();

        while (graphIt.hasNext()){
            int w = graphIt.next();

            if (!visited[w])
               dft(w, visited);
        } 
    } 

    //Method to perform dephth first traversal of the grpah
    //Postcondition: The verts of the graph in the DFT order are output
    public void depthFirstTraversal()
    {
        boolean[] visited;  
        
        visited = new boolean[gSize];

        for (int index = 0; index < gSize; index++)
            visited[index] = false;

        for (int index = 0; index < gSize; index++) 
            if (!visited[index])         
                dft(index, visited);      
    }

    //Method performs a DFT at the given vertext
    public void dftAtVertex(int vertex){
        boolean[] visited;
        visited = new boolean[gSize];

        for (int index = 0; index < gSize; index++)
            visited[index] = false;

        dft(vertex,visited);
    } 

    //Method to perform breadth first traversal of the grpah
    public void breadthFirstTraversal(){
        LinkedQueueClass<Integer> queue =
                     new LinkedQueueClass<Integer>();

        boolean[] visited;
        visited = new boolean[gSize];

        for (int ind = 0; ind < gSize; ind++)
            visited[ind] = false;   //initialize the array
                                    //visited to false

        for (int index = 0; index < gSize; index++)
            if (!visited[index]){
               queue.addQueue(index);
               visited[index] = true;
               System.out.print(" " + index + " ");

               while (!queue.isEmptyQueue()){
                   int u = queue.front();

                   queue.deleteQueue();

                   UnorderedLinkedList<Integer>.
                        LinkedListIterator<Integer> graphIt
                                      = graph[u].iterator();

                    while (graphIt.hasNext()){
                        int w1 = graphIt.next();

                        if (!visited[w1]){
                            queue.addQueue(w1);
                            visited[w1] = true;
                            System.out.print(" " + w1 + " ");
                        }
                    }
                } 
            } 
    }
}
