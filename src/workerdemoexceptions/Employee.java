/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 1-C
 */

package workerdemoexceptions;


/**
 * This class simulates and employee with a name, employee number, and a hire
 * date
 * @author ilorenzo
 */
public class Employee {
    
    private String name;
    private String employeeNumber;
    private String hireDate;
    
    Employee(){
        name = "";
        employeeNumber = "";
        hireDate = "";
    }
    
    Employee(String name,String employeeNumber,String hireDate ) 
            throws InvalidEmployeeNumber{
        this.name = name;
        if(!isValidEmpNum(employeeNumber))
            throw new InvalidEmployeeNumber(employeeNumber);
        
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }
    
    /**
     * This method allows for setName to be set
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * This method allows for employeeNumber to be set
     * @param employeeNumber
     * @throws InvalidEmployeeNumber
     */
    public void setEmployeeNumber(String employeeNumber) throws InvalidEmployeeNumber{
        if(!isValidEmpNum(employeeNumber))
            throw new InvalidEmployeeNumber(employeeNumber);
        this.employeeNumber = employeeNumber;
    }
    
    /**
     * This method allows for hireDate to be set
     * @param hireDate
     */
    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }
    
    /**
     * This method returns the String held in name
     * @return
     */
    public String getName(){
        return name;
    }
    
    /**
     * This method returns the String held in employeeNumber
     * @return
     */
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    
    /**
     * This method returns the String held in hireDate
     * @return
     */
    public String getHireDate(){
        return hireDate;
    }
    
    //This no arg method will check to see if the employeeNumber is valid
    //replaced by a method that takes an string as as arg
    /*
    private boolean isValidEmpNum(){
        
        boolean isValid = false;
        
        if(employeeNumber.length() != 3){
            return false;
        }else{
            for(int i = 0;i < employeeNumber.length(); i++){
                if(Character.isDigit(employeeNumber.charAt(i)))
                    isValid = true;
                else
                    return false;
            }
        }
        
        
        return isValid;
            
    }
    */
    
    //This method checks to see if String passed to it is a valid emp number
    //It will return true if it is false if it is not.
    private boolean isValidEmpNum(String employeeNumber){
        
        boolean isValid = false;
        
        if(employeeNumber.length() != 3){
            return false;
        }else{
            for(int i = 0;i < employeeNumber.length(); i++){
                if(Character.isDigit(employeeNumber.charAt(i)))
                    isValid = true;
                else
                    return false;
            }
        }
        
        
        return isValid;
            
    }
    
    public String toString(){
        
        String str = "Name:"+name+"\nEmployee ID:";
        str += employeeNumber;
        str += "\nHire Date:" + hireDate;
        
        return str;
    }
}
