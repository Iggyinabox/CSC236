/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab NumberHere
 */
package Palindrome;

/**
 *
 * @author ilorenzo
 */
public class Palindrome {
    
    public static void main(String[] args){
        if(detector("Too bad--I hid a boot"))
            System.out.println("This is a Palindrome");
        else
            System.out.println("This is not a Palindrome");
    }
    
    public static boolean detector(String str){
        str = str.toUpperCase();
        str = str.replaceAll("\\W", "");
        String[] splitStr = str.split("");
        
        boolean isPalindrome = false;
        
        StackArray<String> stackArr = new StackArray<String>(splitStr.length);
        
        for(int i =0; i < splitStr.length;i++){
            stackArr.push(splitStr[i]);
        }
        
        for(int i =0; i < splitStr.length;i++){
            if(splitStr[i].equals(stackArr.pop()))
                isPalindrome = true;
            else
                isPalindrome = false;
        }
        return isPalindrome;
    }
}
