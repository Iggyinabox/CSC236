/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 1-A
 */

package parkingticketsimulator;

/**
 * This class simulates a parking mete and holds the amount of minutes 
 * purchased
 * @author ilorenzo
 */
public class ParkingTicket {
    
    private int fine;
    private int minutesParked;
    private int minutesPuchased;
    private String car,officer;
    
    
    ParkingTicket(ParkingMeter meter, ParkedCar car,PoliceOfficer officer){
        this.minutesParked = car.getMinutesParked();
        this.minutesPuchased = meter.getMinutesPuchased();
        this.car = car.toString();
        this.officer = officer.toString();
        
        
    }
    
    ParkingTicket(ParkingTicket obj2){
        minutesParked = obj2.minutesParked;
        minutesPuchased = obj2.minutesPuchased;
    }
    
    /**
     * The calcFee method will calculate the fine for the parking ticket
     */    
    public void calcFine(){
        int total = 0;
        int minOver = minutesParked - minutesPuchased;
        int hour = minOver / 60;
        int partOfHour = minOver % 60;
        boolean firstTime = true;
        
        if(hour > 0){
            total += 25;
            --hour;
            firstTime = false;
        }else{
            total = 25;
        }
        
        while(hour > 0){
            total += 10;
            --hour;
        }
        
        if(!firstTime && partOfHour > 0)
            total+=10;
        
        fine = total;
    }
    
    /**
     * This method allows for the setCar variable to be set.
     * @param car
     */
    public void setCar(ParkedCar car){
        this.car = car.toString();
    }
    
    /**
     * This method allows for the setOfficer variable to be set.
     * @param officer
     */
    public void setOfficer(PoliceOfficer officer){
        this.officer = officer.toString();
    }
    
    /**
     * This method returns the value held in car
     * @return String object
     */
    public String getCar(){
        return car;
    }

    /**
     * This method returns the value held in fine
     * @return the int held in the fine value
     */    
    public int getFine(){
        return fine;
    }
    
    /**
     * This method returns the value held in officer
     * @return
     */
    public String getOfficer(){
        return officer;
    }
    
    @Override
    public String toString(){
        
        String str = car + officer + "\nFine Issued: $" + fine;
        return str;
    }
}
