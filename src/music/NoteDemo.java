/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 2-B
 */
package music;

import java.text.DecimalFormat;

/**
 * This class demonstrates the Note class
 * @author ilorenzo
 */
public class NoteDemo {
    
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.0#Hz");
        String str;
        Note myNote = new Note();
        
        System.out.println("Note Length :"+myNote.getLength());
        System.out.println("Note Value :" + myNote.getValue());
        if(myNote.isNatural())
            str = myNote.noteLetter() + " note is Natural";
        else
            str = myNote.noteLetter() + " note is Sharp";
        System.out.println(str);
        System.out.println(myNote.noteLetter() + " note frequency :" + 
                df.format(myNote.noteFrequency()));
        System.out.println(myNote.toString());
        
        
        System.out.println("\n--Setting new note length and value--\n");
        myNote.setLength(1.0/16.0);
        myNote.setValue(-6);
        
        System.out.println("Note Length :"+myNote.getLength());
        System.out.println("Note Value :" + myNote.getValue());
        if(myNote.isNatural())
            str = myNote.noteLetter() + " note is Natural";
        else
            str = myNote.noteLetter() + " note is Sharp";
        System.out.println(str);
        System.out.println(myNote.noteLetter() + " note frequency :" + 
                df.format(myNote.noteFrequency()));
        System.out.println(myNote.toString());
        
        System.out.println("\n--Creating new note!--\n");
        Note myNote2 = new Note(-7,1);
        
        System.out.println("Note Length :"+myNote2.getLength());
        System.out.println("Note Value :" + myNote2.getValue());
        if(myNote2.isNatural())
            str = myNote2.noteLetter() + " note is Natural";
        else
            str = myNote2.noteLetter() + " note is Sharp";
        System.out.println(str);
        System.out.println(myNote2.noteLetter() + " note frequency :" + 
                df.format(myNote2.noteFrequency()));
        System.out.println(myNote2.toString());
        
    }
    
}
