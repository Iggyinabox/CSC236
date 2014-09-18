/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab NumberHere
 */

package parkingticketsimulator;

/**
 *
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
    
    public void setCar(ParkedCar car){
        this.car = car.toString();
    }
    
    public void setOfficer(PoliceOfficer officer){
        this.officer = officer.toString();
    }
    
    public String getCar(){
        return car;
    }

    /**
     * This method will return the value head in fine
     * @return the int held in the fine value
     */    
    public int getFine(){
        return fine;
    }
    
    public String getOfficer(){
        return officer;
    }
    
    public String toString(){
        
        String str = car + officer + "\nFine Issued: $" + fine;
        return str;
    }
}
