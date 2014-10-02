/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 2-A
 */
package combolock;

import java.util.ListIterator;

/**
 * A Circular Linked List made with Padlock class in mind.
 * I will modify this later to make it more general.
 * @author ilorenzo
 * @param <E>
 */
public class CircularDoubleLinkedList<E> {
    private DoublyLinkedListNode<E> firstNode;
    private DoublyLinkedListNode<E> lastNode;
    public int size;
    
    
    /**
     * Constructor creates an empty linkedlist
     */
    public CircularDoubleLinkedList(){
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    /**
     * Method to check if the linkedlist is empty
     * @return
     */
    public boolean isEmpty(){
        return firstNode == null;
    }

    /**
     * Method returns the size of the linkedlist
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * Adds a element to the end of the list. When a change is made
     * to the collection this method returns true otherwise false.
     * @param obj
     * @return
     */
    public boolean add(E obj){
        DoublyLinkedListNode<E> newNode = 
                new DoublyLinkedListNode<>(obj,null,null);
        //If the list is empty
        if(isEmpty()){
            newNode.setNext(newNode);
            newNode.setPrev(newNode);
            firstNode = newNode;
            lastNode = firstNode;
            size++;
            return true;
        }else if(!isEmpty()){
            newNode.setPrev(lastNode);
            lastNode.setNext(newNode);
            firstNode.setPrev(newNode);
            newNode.setNext(firstNode);
            lastNode = newNode;
            size++;
            return true;
        }
        //If no changes where made returns false
        return false;
    }

    /**
     * This method adds a element at a specific index in the list
     * @param index
     * @param obj
     */
    public void add(int index, E obj){
        DoublyLinkedListNode<E> newNode = 
                new DoublyLinkedListNode<>(obj,null,null);
        
        if(index == 1){
            addFirst(obj);
            return;
        }
        
        DoublyLinkedListNode<E> pointer = firstNode;
        
        for(int i = 2; i <= size; i++){
            if(i == index){
                DoublyLinkedListNode<E> temp = pointer.getNext();
                pointer.setNext(newNode);
                newNode.setPrev(pointer);
                newNode.setNext(temp);
                temp.setPrev(newNode);
                size++;
            }
            pointer = pointer.getNext();
        }
    }
    
    /**
     * Adds a new node to the front of the list
     * @param obj
     */
    public void addFirst(E obj){
        DoublyLinkedListNode<E> newNode = 
                new DoublyLinkedListNode<>(obj,null,null);
        //If list is empty
        if(isEmpty()){
            newNode.setNext(newNode);
            newNode.setPrev(newNode);
            firstNode = newNode;
            lastNode = firstNode;
            size++;
        }else{
            newNode.setPrev(lastNode);
            lastNode.setNext(newNode);
            firstNode.setPrev(newNode);
            newNode.setNext(firstNode);
            firstNode = newNode;
            size++;
        }
    }
    
    /**
     * returns the element in the head node
     * @return
     */
    public E element(){
        return firstNode.getValue();
    }
    
    /**
     * returns a listIterator for this collection
     * @return
     */
    public CircularListIterator listIterator(){
        return new CircularListIterator<E>(firstNode);
    }
    
    /**
     * Method only used to test linked list. This is commented out if not in
     * use for testing
     */
    /*
    public void displayTest(){
        System.out.print("The elements in the list:");
        DoublyLinkedListNode<E> pointer = firstNode;
        if(isEmpty()){
            System.out.println(" This list is empty\n");
            return;
        }
        if(firstNode.getNext() == firstNode){
            System.out.print(firstNode.getValue());
            return;
        }
        System.out.print(firstNode.getValue()+" ↔ ");
        pointer = pointer.getNext();
        while(pointer.getNext() != firstNode){
            System.out.print(pointer.getValue()+" ↔ ");
            pointer = pointer.getNext();
        }
        System.out.print(pointer.getValue());
        System.out.println("\n"+size);
    }
    */ 
    
    /**
     * Nested Iterator for the Circular doubly linked list
     * @param <E> 
     */
    public class CircularListIterator<E> implements ListIterator<E>{
        public DoublyLinkedListNode<E> current;
        
        public CircularListIterator(DoublyLinkedListNode<E> current){
            this.current = current;
        }
        //returns true if node refences another node growing foward, false
        //otherwise
        @Override
        public boolean hasNext(){
            return current.getNext() != null;
        }
        /**
         * returns true if node refences another node growing backwards, false
         * otherwise
         */
        @Override
        public boolean hasPrevious(){
            return current.getPrev() != null;
        }
        
        @Override
        public E next(){
            if(!hasNext())
                return null;
            current = current.getNext();
            return current.getValue();
        }
        
        @Override
        public E previous() {
            if(!hasPrevious())
                return null;
            current = current.getPrev();
            return current.getValue();
        }
        
        //unsopted methods
        //these are need for the implimentation
        //I will update this when I generlize this linked list to work
        //with other classes
        @Override
        public int nextIndex() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        @Override
        public int previousIndex() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        @Override
        public void set(E e) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        @Override
        public void add(E e) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
}


