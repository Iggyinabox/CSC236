/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 1-C
 */

package workerdemoexceptions;


/**
 *
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
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmployeeNumber(String employeeNumber) throws InvalidEmployeeNumber{
        if(!isValidEmpNum(employeeNumber))
            throw new InvalidEmployeeNumber(employeeNumber);
        this.employeeNumber = employeeNumber;
    }
    
    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmployeeNumber(){
        return employeeNumber;
    }
    
    public String getHireDate(){
        return hireDate;
    }
    
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
        
        if(isValidEmpNum())
            str += employeeNumber;
        else
            str += "INVALID EMPLOYEE ID";
        
        str += "\nHire Date:" + hireDate;
        
        return str;
    }
}
