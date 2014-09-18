/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab Lab 1-B
 */

package workerdemo;

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
    
    ProductionWorker(String name,String employeeNumber,String hireDate, int shift,double payRate){
        super(name,employeeNumber,hireDate);
        this.shift = shift;
        this.payRate = payRate;
    }
    
    /**
     * This method allows for shift to be set
     * @param shift
     */
    public void setShift(int shift){
        this.shift = shift;
    }
    
    /**
     * This method allows for payRate to be set
     * @param payRate
     */
    public void setPayRate(double payRate){
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
    
    @Override
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
