/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 1-A
 */

package parkingticketsimulator;
/**
 * This demonstrates the PoliceOfficer Class
 * @author ilorenzo
 */
public class ParkingTicketSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name, carMake, carModel,carColor, carLicensePlate;
        int badgeNumber, meterReading, carTimeParked;
        
        name = "Joe Friday";
        badgeNumber = 4788;
        carMake = "Volkswagon";
        carModel = "1972";
        carColor = "Red";
        carLicensePlate = "147RHZM";
        carTimeParked = 60;
        meterReading = 60;
        
        PoliceOfficer po = new PoliceOfficer(name, badgeNumber);
        ParkedCar pc = new ParkedCar(carMake, carModel, carColor, 
                carLicensePlate,carTimeParked);
        
        System.out.println(pc.toString());
        System.out.println(po.toString());
        
        ParkingMeter pm = new ParkingMeter(meterReading);
        
        ParkingTicket pt = po.patrol(pc, pm);
        
        if(pt != null)
            System.out.println("\nThis car has been illegally parked for "
                + (carTimeParked - meterReading) + " min. A ticket has " 
                + "been issued with a $"+ pt.getFine() + " fine.");
        else
            System.out.println("\nNo crimes have been committed.");
        
    }
}
