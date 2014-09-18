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
    
    public static boolean isMember(int[] intArray, int i) {
        if(intArray.length == 0) 
            return false;
        if(intArray[0] == i){
            System.out.println(i + " is a member of the Array");
            int[] intArray2 = new int[intArray.length-1];
            System.arraycopy(intArray,1,intArray2,0,intArray2.length);
            return isMember(intArray2, i+1);
        }
        
        return isMember(intArray, i+1);           
    }
}
 
