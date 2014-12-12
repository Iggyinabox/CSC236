/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 7-A
 */
package dijkstras;

/**
 * 
 * @author ilorenzo
 */
public class UnorderedLinkedList<T> extends LinkedListClass<T>
{
    public UnorderedLinkedList(){
        super();
    }

    //Method to determine whether item is in the list
    public boolean search(T item){
        LinkedListNode<T> current; 
        boolean found;

        current = first;  

        found = false; 
        //search the list
        while (current != null && !found){
            if (current.info.equals(item)) //item is found
                found = true;
            else
               current = current.link; 
        }
        return found;
    }

    //Mthod that inserts a new item to the front of the list
    public void insertFirst(T newItem){
        LinkedListNode<T> newNode;    

        newNode = new LinkedListNode<T>(newItem, first); 

        first = newNode;  

        if (last == null)   
            last = newNode;

        count++;
    }

    //Method that inserts a new item to the back of the list
    public void insertLast(T newItem){
        LinkedListNode newNode; 

        newNode = new LinkedListNode(newItem, null);  //create newNode

        if (first == null){
            first = newNode;
            last = newNode;
        }
        else{    //if the list is not empty, insertnewNode after last
        last.link = newNode;
            last = newNode;      
        }

        count++;
    }

    //Method to delete deleteItem from the list
    public void deleteNode(T deleteItem){
        LinkedListNode<T> current; 
        LinkedListNode<T> trailCurrent; 
        boolean found;

        if ( first == null)    //the list is empty
            System.err.println("Cannot delete from an empty "
                             + "list.");
        else{
            if (first.info.equals(deleteItem)){
                first = first.link;

                if (first == null)  //the list had only one node
                 	last = null;
              	count--;
            }else{
                found = false;
                trailCurrent = first; 
                current = first.link; 

                while (current != null && !found){
                    if (current.info.equals(deleteItem))
                        found = true;
                    else{
                        trailCurrent = current;
                        current = current.link;
                    }
                }

                if (found){ //if found, delete the node
                    count--;
                    trailCurrent.link = current.link;

                    if (last == current)  
                       last = trailCurrent;  
                }
                else
                   System.out.println("Item to be deleted is "
                                    + "not in the list.");
            }
        }
    }
}