/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 4-A
 */
package primefactors;

/**
 * This class looks for all the prime factors of a number:
 * 
 * @author ilorenzo
 */
public class PrimeFactors {
    
    public static void main(String[] args){
        
        int number = 156870;
        //Create a stack holding all the prime factors of the number that
        //is passed to the findPrimeFactors method
        StackLinkedList<Integer> list = findPrimeFactors(number);
        System.out.print("Prime Factors of "+ number + " are : ");
        //Prints out the prime factors by poping them out of the stack
        while(!list.empty()){
            System.out.print(list.pop());
            //while the list has a next and it is not empty add a
            //multiplication sign.
            if(list.hasNext() && !list.empty())
                System.out.print(" * ");
        }
        System.out.println();
    }
    //Looks for all prime factors of a number and when it finds one it
    //pushes it onto a stack to be stored.
    public static StackLinkedList<Integer> findPrimeFactors(int number){
        StackLinkedList<Integer> list = new StackLinkedList<Integer>();
        for(int i = 2; i <= number;i++){
            while(number % i == 0){
                list.push(i);
                number /= i;
            }
        }
        return list;
    }
}
