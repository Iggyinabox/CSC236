/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 7
 */
package ohgodthislabisbig;

/**
 *
 * @author ilorenzo
 */
public class LinkedQueueClass<T> implements QueueInterface<T>{
          //Definition of the node
    protected class QueueNode<T>{
        T info;
        QueueNode<T> link;
        
        public QueueNode(){
            info = null;
            link = null;
        }

        //Constructor with parameters
        public QueueNode(T elem, QueueNode<T> ptr){
            info = elem;
            link = ptr;
        }

        //Method to return the info as a string
        public String toString(){
            return info.toString();
        }
    }


    private QueueNode<T> queueFront;
    private QueueNode<T> queueRear;  
    
    public LinkedQueueClass(){
  	queueFront = null;
	queueRear = null;
    }

    //Initialize empty queue
    public void initializeQueue(){
        queueFront = null;
        queueRear = null;
    }

    //Method to check if the queue is empty.
    public boolean isEmptyQueue(){
        return (queueFront == null);
    }

    //Method to check if the queue is full
    public boolean isFullQueue(){
        return false;
    }

    //This method returns the first element of the queue
    public T front() throws QueueUnderflowException{
        if (isEmptyQueue())
            throw new QueueUnderflowException();

        return queueFront.info;
    }

    //This method returns the last element of the queue
    public T back() throws QueueUnderflowException{
        if (isEmptyQueue())
            throw new QueueUnderflowException();

        return queueRear.info;
    }

    //This method adds and element to the queue
    public void addQueue(T newElement){
        QueueNode<T> newNode;

        newNode = new QueueNode<T>(newElement, null);
        
        //if queue is empty
        if (queueFront == null){
            queueFront = newNode;
            queueRear = newNode;
        }
        else{   //add at the end
            queueRear.link = newNode;
            queueRear = queueRear.link;
        }
     }


    //Method to remove the first element of the queue.
    public void deleteQueue() throws QueueUnderflowException
    {
        if (isEmptyQueue())
            throw new QueueUnderflowException();

        queueFront = queueFront.link;

        if (queueFront == null)  
            queueRear = null;  
    } 
}
