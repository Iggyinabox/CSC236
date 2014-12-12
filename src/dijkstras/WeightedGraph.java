/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 7-B
 */
package dijkstras;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author ilorenzo
 */
public class WeightedGraph extends Graph {
    protected double[][] weights;
    protected double[] smallestWeight;
    
    public WeightedGraph(){
        super();
        weights = new double[maxSize][maxSize];
        smallestWeight = new double[maxSize];
    }
    
    public WeightedGraph(int size){
        super(size);
        weights = new double[maxSize][maxSize];
        smallestWeight = new double[maxSize];
    }
    
    public void createWeightedGraph(){
        Scanner console = new Scanner(System.in);
        
        int index;
        int vertex;
        int adjacentVertex;
        int edge;
        
        String fileName;

        if (gSize != 0)
            clearGraph();

        Scanner infile = null;

        try{
            System.out.print("Input file name for edges: ");
            fileName = console.nextLine();
            System.out.println();

            infile = new Scanner(new FileReader(fileName));
        }
        catch (FileNotFoundException fnfe){
            System.out.println(fnfe.toString());
            System.exit(0);
        }

        gSize = infile.nextInt(); //get the number of edges
        
        for( index = 0; index < gSize; index++){
            
        }

       
    }    
    
    public void shortestPath(int vertex){
        for(int i = 0; i < gSize; i++)
            smallestWeight[i] = weights[vertex][i];
        
        boolean[]weightFound = new boolean[maxSize];
        
        for(int i = 0; i < gSize - 1; i++){
            double minWeight = Integer.MAX_VALUE;
            int v =0;
            
            for(int j = 0; j< gSize; j++)
                if(!weightFound[j])
                    if(smallestWeight[j] < minWeight){
                        v = j;
                        minWeight = smallestWeight[v];
                    }
            
            weightFound[v] = true;
            
            for(int j = 0; j < gSize; j++)
                if(!weightFound[j])
                    if(minWeight + weights[v][j] < smallestWeight[j])
                        smallestWeight[j] = minWeight + weights[v][j];
        }
    }
    
    public void printShortestDistance(int vertex){
        System.out.println("Source Vertex: "+ vertex);
        System.out.println("Shortest Distance from Source to each Vertex");
        System.out.println("Vertex Shortest_Distance");
        
        for(int j = 0; j < gSize; j++){
            System.out.print(" "+j+"\t\t");
            System.out.printf("%.2f \n", smallestWeight[j]);
        }
        
        System.out.println();
    }
}
