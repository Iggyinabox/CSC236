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
public class PoliceOfficer {
    
    private String officerName;
    private int officerBadgeNumber;
    private boolean ticketIssued;
    
    PoliceOfficer(String officerName, int officerBadgeNumber){
        
        this.officerName = officerName;
        this.officerBadgeNumber = officerBadgeNumber;   
    }
    PoliceOfficer(PoliceOfficer obj2){
        officerName = obj2.officerName;
        officerBadgeNumber = obj2.officerBadgeNumber;
    }
    
    public void setName(String officerName){
        this.officerName = officerName;
    }
    
    public void setBadgeNumber(int officerBadgeNumber){
        this.officerBadgeNumber = officerBadgeNumber;       
    }
    
    /**
     * This method will return a String value holding the officers name
     * @return String value held in officerName
     */
    public String getName(){
        return officerName;
    }
    
    /**
     * This method will return the officers badge number as an int value
     * @return value held in officerBadgeNumber
     */
    public int getBadgeNumber(){
        return officerBadgeNumber;
    }
  
    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter){
        ParkingTicket pt;
        
        if(car.getMinutesParked() - meter.getMinutesPuchased() > 0){  
            pt = new ParkingTicket(meter,car,this);
            pt.calcFine();
           // ticketIssued = true;
        }else{
            pt = null;
           // ticketIssued = true;
        }
        
        return pt;
            
    }

    
    public String toString(){
        String str = "\nOfficer Name: " + officerName + "\nBadge Number: " 
                + officerBadgeNumber;
        
        return str;
    }
}
