/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 1-C
 */

package workerdemoexceptions;

import java.text.DecimalFormat;

/**
 * This class extends Employee and simulates a production worker holding data
 * for the shift they work and their pay rate.
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
        //Condintonal statement to throw error if invalid number is being set
        if(shift != DAY_SHIFT && shift != NIGHT_SHIFT )
            throw new InvalidShift(shift);
        this.shift = shift;
        //ondintonal statement to throw error if negiative number is being set
        if(payRate < 0)
            throw new InvalidPayRate(payRate);
        this.payRate = payRate;
    }
    
    /**
     * This method allows for shift to be set
     * @param shift
     * @throws InvalidShift
     */
    public void setShift(int shift) throws InvalidShift{
        if(shift != DAY_SHIFT || shift != NIGHT_SHIFT )
            throw new InvalidShift(shift);
        
        this.shift = shift;
    }
    
    /**
     * This method allows for payRate to be set
     * @param payRate
     * @throws InvalidPayRate
     */
    public void setPayRate(double payRate) throws InvalidPayRate{
        if(payRate < 0)
            throw new InvalidPayRate(payRate);
        
        this.payRate = payRate;
    }
    
    /**
     * This method returns the int held in shift
     * @return
     */
    public int getShift(){
        return shift;
    }
    
    /**
     * This method returns the double held in payRate 
     * @return
     */
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
