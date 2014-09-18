/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 1-B
 */

package workerdemo;


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
    
    Employee(String name,String employeeNumber,String hireDate ){
        this.name = name;
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
     */
    public void setEmployeeNumber(String employeeNumber){
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
