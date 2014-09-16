/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 1-B
 */

package workerdemo;


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
    
    Employee(String name,String employeeNumber,String hireDate ){
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setEmployeeNumber(String employeeNumber){
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
        
        if(employeeNumber.length() != 5){
            return false;
        }else{
            if(employeeNumber.charAt(3) != '-')
                return false;
            else{
                if((employeeNumber.charAt(4) >= 'A' && employeeNumber.charAt(4)<='M'))
                    for(int i = 0;i < employeeNumber.length()-2; i++){
                        if(Character.isDigit(employeeNumber.charAt(i)))
                            isValid = true;
                        else
                            return false;
                }
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
