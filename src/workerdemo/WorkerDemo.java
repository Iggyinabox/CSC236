/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 1-B
 */

package workerdemo;

/**
 * This class demonstrates the Employee class
 * @author ilorenzo
 */
public class WorkerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test Data 1
        
        String name ="John Smith";
        String employeeNumber = "123-A";
        String hireDate = "11-15-2005";
        int shift = 1;
        double payRate = 16.50;
        
        //Test Data 2
        String name2 = "Joan Jones";
        String employeeNumber2 = "222-L";
        String hireDate2 = "12-12-2005";
        int shift2 = 2;
        double payRate2 = 18.50;
        
        Employee emp = new ProductionWorker(name,employeeNumber,hireDate,shift,payRate);
        
        Employee emp2 = new ProductionWorker(name2,employeeNumber2,hireDate2,shift2,payRate2);
        
        System.out.println(emp.toString());
        System.out.println();
        System.out.println(emp2.toString());
    }
    
}
