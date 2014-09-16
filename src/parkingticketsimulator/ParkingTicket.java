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
    
    ParkingTicket(ParkedCar parked, String name, int badgeNum, int fine){
        System.out.println("Issuing ticket");
        System.out.println("Make:" + parked.getMake() + "\nModel:" 
                           + parked.getModel() + "\nColor:"+ parked.getColor() 
                           + "\nLicense Plate#:" + parked.getLicNum() + "\nFee:"
                           + fine + "\n\nIssuing Officer:" + name 
                           + "\nBadge Number:" + badgeNum);
        
    }
}
