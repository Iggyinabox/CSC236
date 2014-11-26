/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 6-B
 */
package aHeapOfTrouble;

/**
 *
 * @author ilorenzo
 */
public class HeapTest {
    public static void main(String []args){
        PriorityQueue<String> heap = new Heap<String>(10);
        //push over elements
        heap.enqueue("I");
        heap.enqueue("C");
        heap.enqueue("S");
        heap.enqueue("K");
        heap.enqueue("D");
        heap.enqueue("N");
        heap.enqueue("G");
        heap.enqueue("J");
        heap.enqueue("U");
        heap.enqueue("L");
        
        System.out.println(heap);
        //dequeue 3 elements
        for(int i =0;i < 3; i++)
            System.out.println("Dequeue: " + heap.dequeue());
        //print out heap!
        System.out.println("\n"+heap);
    }
}
