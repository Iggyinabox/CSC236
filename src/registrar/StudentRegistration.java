/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 3-B
 */

/**
 * Class StudenRegistration:
 * public class StudentRegistration
 *          The Student Registration class represents a record of a students
 *          class registration. The class will know the student ID and 
 *          and relate that ID to the classes they have registered
 *          for.
 * 
 * Parameters:
 * studentNode → a reference to the node that holds the student ID
 * firstClassNode → a reference to the first class node
 * 
 * Specification:
 * constructor for StudenRegistration
 * public StudentRegistration()
 * creates a empty StudenRegistration
 * 
 * public StudentRegistration(String id)
 * creates a StudentRegistration with just the student not registered to
 * any classes
 * 
 * Parameters:
 * id → the student id number
 *       
 * 
 * public StudentRegistration(int id, String classId, String section, int credits)
 * creates a StudentRegistration with the student registered to one class
 * 
 * Parameters:
 * id → the student id number
 * classId → the code for the class
 * section → the class section
 * credits → the amount of credits the class is worth
 * 
 * Precondition: credits > 0
 * 
 * Throws: IllegalArgumentException
 *          Indicates that exponent is not positive
 * 
 * public boolean isEmpty()
 * returns ture if StudentRegistration is empty
 * 
 * public ArrayList<StudentRegistration> createArray()
 * returns and ArrayList for StudentRegistration if the List has a node it
 * will add it on otherwise it will send back an empty List.
 * 
 * public void addSchedule()
 * Runs through a loop adding in classes till done
 * 
 * public boolean addClass(String classId, String section, int credits)
 * returns true if a class is added to the schedule false otherwise
 * 
 * Parameters:
 * id → the student id number
 * classId → the code for the class
 * section → the class section
 * credits → the amount of credits the class is worth
 * 
 * Precondition: credits > 0
 * 
 * Throws: IllegalArgumentException
 *          Indicates that exponent is not positive
 * 
 * public boolean dropClass(String classId, String section)
 * returns true if designated class was removed false otherwise.
 * 
 * Parameters:
 * classId → the code for the class
 * section → the class section
 * 
 * public String toString()
 * Publish student id along with class schedule
 */

package registrar;

import java.util.ArrayList;

/**
 *
 * @author ilorenzo
 */
public class StudentRegistration {
    
    StudentNode studentIdNode;
    ClassNode firstClassNode;
    
    
    public StudentRegistration(){
        studentIdNode = null;
        firstClassNode = null;
    }
    
    public StudentRegistration(String id){
        studentIdNode = new StudentNode(id,null);
        firstClassNode = null;
    }
    
    public StudentRegistration(String id, String classId,
            String section, int credits){
        if(credits < 0)
            throw new IllegalArgumentException("Credits is set to a negative"
                    + " number");
        
        firstClassNode = new ClassNode(classId,section,credits,null);
        studentIdNode = new StudentNode(id,firstClassNode);
    }

    public boolean isEmpty(){
        return (studentIdNode == null && firstClassNode == null);
    }
    
    public ArrayList<StudentNode> createArray(){
        ArrayList<StudentNode> temp 
                    = new ArrayList<StudentNode>();
        if(isEmpty())
            return temp;
        else{
            temp.add(studentIdNode);
            return temp;
        }      
    }
    
    public void addSchedule(String id,ArrayList<StudentNode> studentList){
        String input;
        String classId;
        String selection;
        int credits;
        
        
        
    }
}
