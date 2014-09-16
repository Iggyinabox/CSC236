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
    
    private final String officerName;
    private final int officerBadgeNumber;
    private int fine;
    private ParkingTicket parkingTicket;
    private ParkedCar parkedCar;
    private ParkingMeter parkingMeter;
    
    PoliceOfficer(String name, int badgeNum){
        
        officerName = name;
        officerBadgeNumber = badgeNum;
        
        
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
    public int getBadge(){
        return officerBadgeNumber;
    }
    
    /**
     * The calcFee method will calculate the fine for the parking ticket
     * @param parkedTime
     * @param meterTime
     */
    public void calcFine(int parkedTime, int meterTime){
        int total = 0;
        int minOver = parkedTime - meterTime;
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
     * This method will return the value head in fine
     * @return the int held in the fine value
     */
    public int getFine(){
        return fine;
    }

    /**
     * This method simulates the police officer checking the car and getting
     * all the relevant info copied over from the car object and parking meter 
     * object. It will then check if the car has been parked longer than the
     * what was paid for. If this is true a parkingTicket object will be created.
     * @param car an argument that holds the ParkedCar object
     * @param meter an argument that holds the ParkingMeter object
     */
    public void checkParkedCar(ParkedCar car, ParkingMeter meter){
        
        parkedCar = new ParkedCar(car);
        parkingMeter = new ParkingMeter(meter);
        
        if(parkedCar.getMinutesParked() >= parkingMeter.getMinutesPuchased()){
            calcFine(parkedCar.getMinutesParked(), parkingMeter.getMinutesPuchased());
            parkingTicket = new ParkingTicket(parkedCar, officerName, 
                                              officerBadgeNumber, fine);
        }else{
            
            System.out.println("This car still has "+ (parkingMeter.getMinutesPuchased() 
                               - parkedCar.getMinutesParked())+ " minutes left");
        }
    }   
}
