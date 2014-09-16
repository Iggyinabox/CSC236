/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab NumberHere
 */

package parkingticketsimulator;

/**
 * This class simulates a parking meter and will know the amount of minutes
 * that where purchased.
 * @author ilorenzo
 */
public class ParkingMeter {
    //The ammount of mintues purchased at the meter
    private int minutesPuchased;
    
    ParkingMeter(int time){
        minutesPuchased = time;
    }
    
    ParkingMeter(ParkingMeter obj2){
        minutesPuchased = obj2.minutesPuchased;
    }
    
    public void setMinutesPuchased(int time){
        minutesPuchased = time;
    }
    
    /**
     * This will return the value held in purchedTime
     * @return the int value in puchedTime
     */
    public int getMinutesPuchased(){
        return minutesPuchased;
    }
}
