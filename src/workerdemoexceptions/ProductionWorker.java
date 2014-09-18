/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 1-C
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
    
    ProductionWorker(String name,String employeeNumber,String hireDate, 
            int shift,double payRate) 
            throws InvalidShift, InvalidPayRate, InvalidEmployeeNumber{
        super(name,employeeNumber,hireDate);
        
        if(shift != DAY_SHIFT && shift != NIGHT_SHIFT )
            throw new InvalidShift(shift);
        this.shift = shift;
        
        if(payRate < 0)
            throw new InvalidPayRate(payRate);
        this.payRate = payRate;
    }
    
    public void setShift(int shift) throws InvalidShift{
        if(shift != DAY_SHIFT || shift != NIGHT_SHIFT )
            throw new InvalidShift(shift);
        
        this.shift = shift;
    }
    
    public void setPayRate(double payRate) throws InvalidPayRate{
        if(payRate < 0)
            throw new InvalidPayRate(payRate);
        
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
        
        if(payRate > 0)
            str += "\nPay Rate per Hour:" + pay.format(payRate);
        else
            str += "\nPay Rate per Hour:" + "INVALID PAY RATE";
        return str;
    }
}
