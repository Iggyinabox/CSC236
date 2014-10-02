/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 2-B
 */
package music;

/**
 * This class holds information about a musical note
 * @author Toothbrush
 */
public class Note {
    private double length;
    private int value;
    
    /**
     * No arg constructor is a C quarter note
     */
    public Note(){
        length = 1.0/4.0;
        value = -9;
    }
    
    /**
     * This constructor will take arg and set them as the notes 
     * vale and length
     * @param value
     * @param length
     */
    public Note(int value,double length){
        if(length == 0.0625 || length == 0.125 || length == 0.25
                || length == 0.5 || length == 1)
            this.length = length;
        else
            throw new IllegalArgumentException(length + 
                    " is not a valid note length");
        
        if(value < -9 || value > 2)
            throw new IllegalArgumentException(value + 
                    " is not a valid note value");
        else
            this.value = value;
    }
    
    /**
     * This method sets the length of the note
     * Prereq: the note length must be 1/16 1/8 1/4 1/2 or 1
     * @param length
     */
    public void setLength(double length){
        if(length == 0.0625 || length == 0.125 || length == 0.25
                || length == 0.5 || length == 1)
            this.length = length;
        else
            throw new IllegalArgumentException(length + 
                    " is not a valid note length"); 
    }
    
    /**
     * This method sets the value of the note
     * Prereq: the value must be a int between -9 - 2
     * @param value
     */
    public void setValue(int value){
        
        if(value < -9 || value > 2)
            throw new IllegalArgumentException(value + 
                    " is not a valid note value");
        else
            this.value = value;
    }
    
    /**
     * This method returns the length of the note
     * @return
     */
    public double getLength(){
        return length;
    }
    
    /**
     * This method returns the value of the note
     * @return
     */
    public int getValue(){
        return value;
    }
    
    /**
     * This method returns a string representing the letter of the note
     * if a bad value got through it will throw an IllegalArgumentException
     * error.
     * @return
     */
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
            case -2:
                return "G";
            case -3:
                return "Gb(F#)";
            case -4:
                return "F";
            case -5:
                return "E";
            case -6:
                return "Eb(D#)";
            case -7:
                return "D";
            case -8:
                return "Db(C#)";
            case -9:
                return "C";
            default:
                throw new IllegalArgumentException( value +
                        " is not a valid note value.");
        }
    }

    /**
     * This method returns true if the note selected is natural if it is
     * flat the method returns false
     * @return
     */
    public boolean isNatural(){
        switch (value){
            case 2:
                return true;
            case 0:
                return true;
            case -2:
                return true;
            case -4:
                return true;
            case -5:
                return true;
            case -7:
                return true;
            case -9:
                return true;
            default:
                return false;
        }
    }
    
    /**
     * This method takes the double vale and based on that returns a string
     * representing the length of the note.
     * @return
     */
    public String lengthToString(){
        if(length == 0.0625)
            return "sixteenth";
        else if(length == 0.125)
            return "eigth";
        else if(length == 0.25)
            return "quarter";
        else if(length == 0.5)
            return "half";
        else
            return "whole";
    }
    
    /**
     * This method calculates the frequency of the notes in Hz
     * @return
     */
    public double noteFrequency(){
        return (440 * Math.pow(2,value/12.00));
    }
    
    @Override
    public String toString(){
        String str;
        
        str = this.noteLetter() + " " + this.lengthToString() +
                " note";
        
        return str;
    }
}
