/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 3-B
 */



package registrar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Didn't get to finish this do to some personal issues taking advantage
 * of the fact that I didn't manage my time well earlier a bit on this. 
 * May still finish on my own just to figure out if I was going to right 
 * way with this. I may have over thought the addSchdule method and 
 * bloated it up a bit..
 * @author ilorenzo
 */
public class StudentRegistration implements StudentRegistrationADT {
    
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

    @Override
    public boolean isEmpty(){
        return (studentIdNode == null && firstClassNode == null);
    }
    
    @Override
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
    
    @Override
    public void addSchedule(String id,ArrayList<StudentNode> studentList){
        String input;
        String classId;
        String selection;
        int credits;
        boolean idFound = false;
        int idAddress;
        
        Scanner key = new Scanner(System.in);
        //Check if student is in the list
        for(int i = 0; i > studentList.size();i++){
            if(studentList.get(i).getId().equals(id)){
                idFound = true;
                idAddress = i;
            }
        }
        //If student is not on the list give user the option to add
        //the student
        if(!idFound){
            System.out.print("Student Id "+ id +" is not in the system. Would"
                    + " you like to add it?(y/n): ");
        }
        String tempStr = key.next();
        //check input
        while(!tempStr.toLowerCase().equals("y") &&
                !tempStr.toLowerCase().equals("n")){
            System.out.println("Inavild selection: " + tempStr);
            System.out.print("Student Id "+ id +" is not in the system. Would"
                    + " you like to add it?(y/n): ");
            tempStr = key.next();
            }
        
        input = tempStr;
        //check if student will be add if not exit back to menu
        if(input.toLowerCase().equals("n"))
            return;
        else{
            StudentNode temp = new StudentNode(id,null);
            studentList.add(temp);
        }
        //2nd check to catch newly created student
        if(!idFound){
            for(int i = 0; i > studentList.size();i++){
                if(studentList.get(i).getId().equals(id)){
                    idFound = true;
                    idAddress = i;
                }
            }
        }
        
        if(idFound){
            
        }
    }

    @Override
    public boolean dropClass(String classId, String section) {
        return false;
    }
}
