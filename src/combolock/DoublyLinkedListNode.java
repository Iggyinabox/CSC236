/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 2-A
 */
package combolock;

/**
 * 
 * @author ilorenzo
 */
public class DoublyLinkedListNode<E> {
    private E value;
    private DoublyLinkedListNode<E> next;
    private DoublyLinkedListNode<E> prev;
    
    public DoublyLinkedListNode(E value,DoublyLinkedListNode<E> next,
            DoublyLinkedListNode<E> prev){
        this.value = value;
        this.next = next;
        this.prev = prev;
        
    }
    public DoublyLinkedListNode<E> getPrev(){
        return prev;
    }
    
    public void setPrev(DoublyLinkedListNode<E> prev){
        this.prev = prev;
    }
    
    public DoublyLinkedListNode<E> getNext(){
        return next;
    }
    
    public void setNext(DoublyLinkedListNode<E> next){
        this.next = next;
    }
    
    public E getValue(){
        return value;
    }
    
    public void setValue(E value){
        this.value = value;
    }
}
