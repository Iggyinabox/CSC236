/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 6-B
 */
package aHeapOfTrouble;

import java.util.ArrayList;

/**
 *
 * @author ilorenzo
 */
public class Heap<T extends Comparable<T>> implements PriorityQueue<T>{
    //priority queue elements
    private ArrayList<T> elements;
    private int lastIndex;
    private int maxIndex;
    
    public Heap(int maxSize){
        elements = new ArrayList<T>(maxSize);
        lastIndex = -1;
        maxIndex = maxSize-1;
    }
    
    public boolean isEmpty(){
        return (lastIndex == -1);
    }
    
    public boolean isFull(){
        return (lastIndex == maxIndex);
    }
    
    public void enqueue(T element) throws PriorityQOverflowException{
        if(lastIndex == maxIndex)
            throw new PriorityQOverflowException("Priority queue is full");
        else{
            lastIndex++;
            elements.add(lastIndex, element);
            upHeap(element);
        }
    }
    
    public T dequeue() throws PriorityQUnderflowException{
        T hold; //Element that is held then returned
        T temp; //Element that will move down the heap
        
        if(lastIndex == -1)
            throw new PriorityQUnderflowException("Priority Queue is empty");
        else{
            hold = elements.get(0);
            temp = elements.remove(lastIndex);
            lastIndex--;
            if(lastIndex != -1)
                downHeap(temp);
            return hold;
        }
    }
    
    public void upHeap(T element){
        int hole = lastIndex;
        while((hole > 0) && (element.compareTo(elements.get((hole-1)/2)) > 0)){
            elements.set(hole , elements.get((hole-1)/2));
            hole = (hole - 1) / 2;
        }
        elements.set(hole, element);
    }
    
    public void downHeap(T element){
        int hole = 0;
        int newhole;
        
        newhole = newHole(hole, element);
        while(newhole != hole){
            elements.set(hole, elements.get(newhole));
            hole = newhole;
            newhole = newHole(hole, element);
        }
        elements.set(hole, element);
    }
    /*
    If child or hole is larger than element, return the index of the larger
    child: otherwise, return the index of hole.
    */
    private int newHole(int hole, T element){
        int left = (hole * 2) +1; //left child
        int right = (hole * 2) +2; //right child
        
        if(left > lastIndex)
            //hole has no childern
            return hole;
        else
            if(left == lastIndex)
                //left child only
                if(element.compareTo(elements.get(left))< 0)
                    //elem < left child
                    return left;
                else
                    //element >= left child
                    return hole;
            else
                //hole has 2 children
                if(elements.get(left).compareTo(elements.get(right)) < 0)
                    //left child < right child
                    if(elements.get(right).compareTo(element)<= 0)
                        //right child <= element
                        return hole;
                    else
                        //element < right child
                        return right;
                else
                    //left child >= right child
                    if(elements.get(left).compareTo(element) <=0)
                        //left child <= element
                        return hole;
                    else
                        //element < left child
                        return left;
    }
    
    public String toString(){
        String heapTree = new String("Heap Tree:\n");
        
        for(int i = 0; i <= lastIndex; i++)
            heapTree = heapTree + i + ". " + elements.get(i) + "\n";
        return heapTree;
    }
}
