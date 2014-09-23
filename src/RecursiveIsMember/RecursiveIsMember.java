/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 1-D
 */
package RecursiveIsMember;

/**
 *
 * @author ilorenzo
 */
public class RecursiveIsMember {
    
    public static void main(String[]args){
        
        int[] intArray = {2,4,6,8,10,12,14,16,18,20};
        int i = 0;
        
        isMember(intArray,i);
    }
    
    /**
     * This recursive method will run through numbers 0-20 and check to see if
     * the array passed to it contains any of those numbers. In order for this
     * method to work the array passed to it must be sorted in ascending order.
     * @param intArray
     * @param i
     * @return
     */
    
    public static boolean isMember(int[] intArray, int i) {
        if(intArray.length == 0) 
            return false;
        if(intArray[0] == i){
            System.out.println(i + " is a member of the Array");
            //create a 2nd array with one less space than the first one
            int[] intArray2 = new int[intArray.length-1];
            //Slice out the value that has been matched and push the remaining
            //ints to the 2nd array
            System.arraycopy(intArray,1,intArray2,0,intArray2.length);
            //Push over the new array and incriment the value that is being checked
            return isMember(intArray2, i+1);
        }
        //No match was found incriment to the next value
        return isMember(intArray, i+1);           
    }
    
    
    //Orginal isMemeber Recursive method
    /*
    public static boolean isMember(int[] intArray, int i) {
        if(intArray.length == 0) 
            return false;
        if(intArray[0] == i)
            return true;
        
        int[] intArray2 = new int[intArray.length-1];
        System.arraycopy(intArray,1,intArray2,0,intArray2.length);
        return isMember(intArray2, i);
    }
    */
}