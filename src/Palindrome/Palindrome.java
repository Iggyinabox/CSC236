/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 4-C
 */
package Palindrome;

/**
 * This class can determine if a String is a Palindrome using a stack
 * @author ilorenzo
 */
public class Palindrome {
    
    public static void main(String[] args){
        
        String str = "Gateman sees my name, garageman sees name tag";
        
        if(detector(str))
            System.out.println(str +" - is a Palindrome");
        else
            System.out.println(str +" - is not a Palindrome");
    }
    //Method to detect if String passed to it is a palindrome
    //Returns true if it is false is it is not
    public static boolean detector(String str){
        //Normalize data in string so it can be analyzed
        str = str.toUpperCase();
        //Replaces all whitespace and non alphabetical characters
        str = str.replaceAll("\\W", "");
        //Split up the string I could have also created a Char array here
        //but this felt like it would work better when comparing later on.
        String[] splitStr = str.split("");
        
        boolean isPalindrome = false;
        
        StackArray<String> stackArr = new StackArray<String>(splitStr.length);
        //fill up the Stack with our string array
        for(int i =0; i < splitStr.length;i++){
            stackArr.push(splitStr[i]);
        }
        //Run through Stack and String array to determine if String is a
        //Palindrome
        for(int i =0; i < splitStr.length;i++){
            if(splitStr[i].equals(stackArr.pop()))
                isPalindrome = true;
            else
                return false;
        }
        return isPalindrome;
    }
}
