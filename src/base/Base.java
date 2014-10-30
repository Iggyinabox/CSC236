/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 4-B
 */
package base;


import java.util.Scanner;
//Stack used in Last Lab
import primefactors.StackLinkedList;

/**
 *
 * @author ilorenzo
 */
public class Base {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        
        int number;
        int base;
        int temp;
        
        String check = "y";
        
        
        while(check.toLowerCase().equals("y")){
            
            System.out.print("What is your base 10 number?:(Please pick "
                    + "a non-negative integer):");
            //Check to see if data entered is an int
            while(!key.hasNextInt()){
                System.out.println("That is not a number!");
                System.out.print("What is your base 10 number?:(Please "
                        + "pick a non-negative integer):");
                key.next();
            }
            //temp var to hold number
            temp = key.nextInt();
            //check to see if the number is a valid selection
            while(temp < 0){
                System.out.println("That number is negative!");
                System.out.print("What is your base 10 number?:(Please "
                        + "pick a non-negative integer):");
                temp = key.nextInt();
            }
            
            number = temp;
            
            System.out.print("What is your base you want to convert"
                    + " this to?(Please pick a number between 2-9)");
            //Check to see if data entered is an int
            while(!key.hasNextInt()){
                System.out.println("That is not a number!");
                System.out.print("What is your base you want to convert"
                    + " this to?(Please pick a number between 2-9)");
                key.next();
            }
            //temp var to hold number
            temp = key.nextInt();
            //check to see if the number is a valid selection
            while(temp < 2 || temp > 9){
                System.out.println("That number is out of the 2-9 range!");
                System.out.print("What is your base you want to convert"
                    + " this to?(Please pick a number between 2-9)");
                temp = key.nextInt();
            }
            
            base = temp;
            
            StackLinkedList<Integer> answer = convertBase(number, base);
            
            System.out.print(number + " Base 10" + " = ");
            
            while(!answer.empty()){
                System.out.print(answer.pop());

                if(!answer.hasNext())
                    System.out.print(" Base " + base);
            }
            System.out.println();
            System.out.print("Would you like to keep covering "
                    + "bases of 10? (y/n) :");
            String tempStr = key.next();
            while(!tempStr.toLowerCase().equals("y") && 
                    !tempStr.toLowerCase().equals("n")){
                System.out.println("Inavild selection: " + tempStr);
                System.out.print("Would you like to keep "
                        + "covering bases of 10? (y/n) :");
                tempStr = key.next();
            }
            check = tempStr;
        }
    }
    
    public static StackLinkedList<Integer> convertBase(int number, int base){
        StackLinkedList<Integer> remainders = new StackLinkedList<Integer>();
        for(;number / base != 0;number /= base){
            remainders.push(number % base); 
        }
        //To capture the last remainder
        remainders.push(number % base);
        
        return remainders;
    }
}
