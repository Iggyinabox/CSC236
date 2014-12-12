/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 7-A
 */
package dijkstras;


import java.util.*;
import java.io.*;

/**
 * The Graph class implements the Graph interface. This works with a node that
 * holds both the vertex index and the name. The Graph is directional but not
 * weighed. The data is loaded using a file.
 * @author ilorenzo
 */
public class Graph implements GraphInterface {
    protected int maxSize;          //maximum number of vertices
    protected int gSize;            //current number of vertices
    protected int eAmmount;         //Ammount of edges
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
            System.out.print("Input file name for nodes: ");
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
            String name = infile.next();
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


}
