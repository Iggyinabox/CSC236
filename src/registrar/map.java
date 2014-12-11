/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab NumberHere
 */
package registrar;

import java.util.*;

/**
 *
 * @author ilorenzo
 */
public class map {
    
    public static void main(String[] args){
        
        String str = "";
        Set<String> s = new HashSet<>();
        s.add("The");
        s.add("rain");
        s.add("in");
        s.add("NJ");
        
        for(Iterator<String> i = s.iterator(); i.hasNext();)
            str = str+ (Integer)i.next();
    }
}
