/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 1-A
 */

package parkingticketsimulator;

/**
 * This class simulates a parked cat with a make model color and lic plate.
 * It also holds the int value for the amount of time the car has been parked.
 * @author ilorenzo
 */
public class ParkedCar {
   
    
    private String carMake, carModel, carColor, carLicenseNum;
    private int minutesParked;
    
    
    ParkedCar(String make,String model, String color, String licenseNum,
            int timeParked){
        
        carMake = make;
        carModel = model;
        carColor = color;
        carLicenseNum = licenseNum;
        // A Random value is added to mintues parked
        // I used 1440 as that is the ammount of minits in a day
        //minutesParked = r.nextInt(1440) + 1;
        
        //Hard code for testing
        minutesParked = timeParked;
    }
    /**
     * This constructor will take a ParkedCar object as and arg and copy
     * over the values it holds to this obj
    */
    ParkedCar(ParkedCar obj2){
        
        carMake = obj2.carMake;
        carModel = obj2.carModel;
        carColor = obj2.carColor;
        carLicenseNum = obj2.carLicenseNum;
        
        minutesParked = obj2.minutesParked;
    
    }

    /**
     * This method allows for the carkMarke variable to be set.
     * @param make
     */
    public void setMake(String make){
        carMake = make;
    }

    /**
     * This method allows for the carModel variable to be set.
     * @param model
     */
    public void setModel(String model){
        carModel = model;
    }
    
    /**
     * This method allows for the carColor variable to be set.
     * @param color
     */
    public void setColor(String color){
        carColor = color;
    }

    /**
     * This method allows for the carLicenseNum variable to be set.
     * @param licenseNum
     */
    public void setLicenseNumber(String licenseNum){
        carLicenseNum = licenseNum;
    }

    /**
     * This method allows for the setMinutesParked variable to be set.
     * @param timeParked
     */
    public void setMinutesParked(int timeParked){
        minutesParked = timeParked;
    }
    /**
     * This method will return the value in carMake
     * @return the String value held in carMake
     */
    public String getMake(){
        return carMake;
    }
    
    /**
     * This method will return the value in catModel
     * @return the String value held in carModel
     */
    public String getModel(){
        return carModel;
    }
    
    /**
     * This method will return the value in getColor
     * @return the String value held in carColor
     */
    public String getColor(){
        return carColor;
    }
    
    /**
     * This method will return the value in carLiceNum
     * @return the String value held in carLicenseNum
     */
    public String getLicenseNumber(){
        return carLicenseNum;
    }
    
    /**
     * This method will return the value in minutesParked
     * @return the  int value held in mintuesParked
     */
    public int getMinutesParked(){
        return minutesParked;
    }
    
    @Override
    public String toString(){
        String str = "Make:" + carMake + "\nModel:" 
                    + carModel + "\nColor:"+ carColor 
                    + "\nLicense Plate#:" + carLicenseNum;
        
        return str;
    }
}
