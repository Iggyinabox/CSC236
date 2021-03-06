/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 7-A
 */
package ausgraph;

import java.util.NoSuchElementException;

/**
 *
 * @author ilorenzo
 */
public abstract class LinkedListClass<T> implements LinkedListInterface<T>
{
    protected class LinkedListNode<T> implements Cloneable
    {
        public T info;
        public T name;
        public LinkedListNode<T> link;
        public boolean marked;
        //Default constructor
        //Postcondition: info = null; link = null;
        public LinkedListNode(){
            info = null;
            name = null;
            link = null;
            marked = false;
        }
        //Constructor with parameters
        public LinkedListNode(T elem, T name, LinkedListNode<T> ptr){
            info = elem;
            this.name = name;
            link = ptr;
            marked = false;
        }
        
        public boolean isMarked(){
            return marked;
        }
        
        //Returns a copy of objects data in store.
        public Object clone(){
            LinkedListNode<T> copy = null;
            try{
                copy = (LinkedListNode<T>) super.clone();
            }
                catch (CloneNotSupportedException e){
                return null;
            }
                return copy;
        }
        //Method to return the info as a string.
        public String toString(){
            return name.toString();
        }
    } //end class LinkedListNode
    
    public class LinkedListIterator<T>{
        protected LinkedListNode<T> current; 
        protected LinkedListNode<T> previous; 
        
        public LinkedListIterator(){
            current = (LinkedListNode<T>) first;
            previous = null;
        }
        //Method to reset the iterator to the first node
        //in the list.
        public void reset(){
            current = (LinkedListNode<T>) first;
            previous = null;
        }
        //Method to return a reference of the info of the
        //current node in the list and to advance iterator
        //to the next node.
        public T next(){
            if (!hasNext())
                throw new NoSuchElementException();
            LinkedListNode<T> temp = current;
            previous = current;
            current = current.link;
            return temp.info;
        }
        //Method to determine whether there is a next
        //element in the list.
        public boolean hasNext(){
            return (current != null);
        }
        //Method to remove the node currently pointed to
        //by the iterator.
        public void remove(){
            if (current == null)
                throw new NoSuchElementException();
            if (current == first){
                first = first.link;
                current = (LinkedListNode<T>) first;
                previous = null;
                if (first == null)
                    last = null;
            }else{
                previous.link = current.link;
                if (current == last)
                {
                last = first;
                while (last.link != null)
                last = last.link;
                }
                current = current.link;
            }
        
            count--;
        }
        //Method to return the info as a string.
        public String toString(){
            return current.info.toString();
        }
    }
    
    
    protected LinkedListNode<T> first; 
    protected LinkedListNode<T> last; 
    protected int count; //number of nodes in the list
    
    
    //Initializes the list to an empty state.
    public LinkedListClass(){
        first = null;
        last = null;
        count = 0;
    }
    //Method to determine whether the list is empty.
    public boolean isEmpty(){
        return (first == null);
    }
    //Method to output the data contained in each node.
    public void print(){
        LinkedListNode<T> current; 
        current = first; //set current so that it points to the first node
        while (current != null){
            System.out.print(current.info + " ");
            current = current.link;
        }
    }
    //Method to return the number of nodes in the list.
    public int length(){
        return count;
    }
    //Method to return a reference of the object containing
    //the data of the first node of the list.
    public T front(){
        return first.info;
    }
    //Method to return a reference of object containing
    //the data of the last node of the list.
    public T back(){
        return last.info;
    }
    //Returns a copy of objects data in store.
    public Object clone(){
        LinkedListClass<T> copy = null;
        try{
            copy = (LinkedListClass<T>) super.clone();
        }
        catch (CloneNotSupportedException e){
            return null;
        }
        //If the list is not empty clone the list
        if (first != null){
            //Clone the first node
            copy.first = (LinkedListNode<T>) first.clone();
            copy.last = copy.first;
            LinkedListNode<T> current;
            if (first != null)
                current = first.link;
            else
                current = null;
            //Clone the remaining nodes of the list
            while (current != null){
                copy.last.link = (LinkedListNode<T>) current.clone();
                copy.last = copy.last.link;
                current = current.link;
            }
        }
        return copy;
    }
    //Method to return an iterator of the list.
    public LinkedListIterator<T> iterator(){
        return new LinkedListIterator<T>();
    }
    //Method to determine whether searchItem is in
    //the list.
    public abstract boolean search(T searchItem);
    public abstract void insertFirst(T newItem, T name);
    public abstract void insertLast(T newItem, T name);
    public abstract void deleteNode(T deleteItem);
    }
