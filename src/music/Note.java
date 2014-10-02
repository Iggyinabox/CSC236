/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 2-B
 */
package music;

/**
 *
 * @author Toothbrush
 */
public class Note {
    private double length;
    private int value;
    
    public Note(){
        length = 1/4;
        value = -9;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public double getLength(){
        return length;
    }
    
    public int getValue(){
        return value;
    }
    
    public String noteLetter(){
        switch (value){
            case 2:
                return "B";
            
            case 1:
                return "Bb(A#)";
                
            case 0:
                return "A";
                
            case -1:
                return "Ab(G#)";
            
                        
        }
    }
}
