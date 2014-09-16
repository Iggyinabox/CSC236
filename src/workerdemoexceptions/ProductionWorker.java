/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 1-B
 */

package workerdemoexceptions;

import java.text.DecimalFormat;

/**
 *
 * @author ilorenzo
 */
public class ProductionWorker extends Employee {
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;
    private int shift;
    private double payRate;
    
    ProductionWorker(){
        super();
        shift = DAY_SHIFT;
        payRate = 8.25;
    }
    
    ProductionWorker(String name,String employeeNumber,String hireDate, int shift,double payRate){
        super(name,employeeNumber,hireDate);
        this.shift = shift;
        this.payRate = payRate;
    }
    
    public void setShift(int shift){
        this.shift = shift;
    }
    
    public void setPayRate(double payRate){
        this.payRate = payRate;
    }
    
    public int getShift(){
        return shift;
    }
    
    public double getPayRate(){
        return payRate;
    }
    
    public String toString(){
        DecimalFormat pay = new DecimalFormat("$#,##0.00");
        
        String str = super.toString();
        
        str += "\nShift";
        
        if(shift == DAY_SHIFT)
            str += "Day";
        else if(shift == NIGHT_SHIFT)
            str += "Night";
        else
            str += "INVALID SHIFT SELECTION";
        
        str += "\nPay Rate per Hour:" + pay.format(payRate);
        
        return str;
    }
}
