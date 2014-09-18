/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 1-C
 */

package workerdemoexceptions;

/**
 * This class demonstrates the Employee class
 * @author ilorenzo
 */
public class WorkerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        createWorker();
        
        

    }
    
     static public void createWorker(){
        String name ="John Smith";
        String employeeNumber = "1234";
        String hireDate = "11-15-2009";
        int shift = 1;
        double payRate = 16.50;
        
        try{
        Employee emp = new ProductionWorker(name,employeeNumber,hireDate,shift,payRate);
        System.out.println(emp.toString());
        }catch(InvalidShift | InvalidPayRate | InvalidEmployeeNumber e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
