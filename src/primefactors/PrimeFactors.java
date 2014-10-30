/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 4-A
 */
package primefactors;

/**
 *
 * @author ilorenzo
 */
public class PrimeFactors {
    
    public static void main(String[] args){
        StackLinkedList<Integer> list = findPrimeFactors(3960);
        while(!list.empty()){
            System.out.print(list.pop());
            
            if(list.hasNext() && !list.empty())
                System.out.print(" * ");
        }
        System.out.println();
    }
    
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
