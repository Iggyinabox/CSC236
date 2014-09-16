/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 1-A
 */

package parkingticketsimulator;

import java.util.Scanner;
/**
 *
 * @author ilorenzo
 */
public class ParkingTicketSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner key = new Scanner(System.in);
        String name, carMake, carModel,carColor, carLicensePlate;
        int badgeNumber, meterReading;
        
        System.out.print("What is your name?:");
        name = key.nextLine();
        
        System.out.print("What is your badge number?:");
        badgeNumber = key.nextInt();
        
        System.out.println("\nOfficer "+name+" reporting for duty!");
        PoliceOfficer po = new PoliceOfficer(name, badgeNumber);
        
        System.out.println("While walking the beat you decied to check some cars");
        System.out.println("As you approch a car you start to examine it.");
        System.out.print("You notice the make, model, color, and license plate numbers are:");
        carMake = key.next();
        carModel = key.next();
        carColor = key.next();
        carLicensePlate = key.next();
        
        ParkedCar pc = new ParkedCar(carMake, carModel, carColor, carLicensePlate,80);
        System.out.println("\nThe car has been parked for "+ pc.getMinutesParked()
                           +  " minutes");
        
        System.out.println("You walk over to the metter and check how many minutes"
                + " have been puchased");
        System.out.print("The meter reads: ");
        meterReading = key.nextInt();
        
        ParkingMeter pm = new ParkingMeter(meterReading);
        
        
        po.checkParkedCar(pc, pm);
        
    }
}
