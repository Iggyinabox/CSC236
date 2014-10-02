/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab NumberHere
 */
package combolock;

import java.util.Scanner;

/**
 *
 * @author ilorenzo
 */
public class PadlockDemo {
    
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        Padlock lock = new Padlock(6,3,6);
        int selection = 7;
        
        System.out.println("You are looking down at a combination lock."
                + " What would you like to do?");
        
        while(selection != 0){
            System.out.println("------------------------------------------");
            System.out.println("| 1-Alter the locks Combination          |");
            System.out.println("| 2-Turn the dial                        |");
            System.out.println("| 3-Close the lock                       |");
            System.out.println("| 4-Attempt to open the lock             |");
            System.out.println("| 5-Check if the lock is open or shut    |");
            System.out.println("| 6-Check what number is on top          |");
            System.out.println("|           Type 0 to exit               |");
            System.out.println("------------------------------------------");
        
            System.out.print("Selection: ");
            while(!key.hasNextInt()){
                System.out.println("That is not number!\n");
                System.out.println("-----------------------------------------"
                        + "-");
                System.out.println("| 1-Alter the locks Combination          "
                        + "|");
                System.out.println("| 2-Turn the dial                        "
                        + "|");
                System.out.println("| 3-Close the lock                       "
                        + "|");
                System.out.println("| 4-Attempt to open the lock             "
                        + "|");
                System.out.println("| 5-Check if the lock is open or shut    "
                        + "|");
                System.out.println("| 6-Check what number is on top          "
                        + "|");
                System.out.println("|           Type 0 to exit               "
                        + "|");
                System.out.println("-----------------------------------------"
                        + "-");
                System.out.print("Selection: ");
                key.next();
            }
            selection = key.nextInt();
            
            switch(selection){
                //Case 1 Alter the locks Comb
                case 1:
                    System.out.println("The lock goes from 0-39");
                    System.out.println("What would you like the first "
                            + "number to be in the new combination?");
                    //Check to see if data entered is an int
                    while(!key.hasNextInt()){
                        System.out.println("That is not number!");
                        System.out.println("What would you like the first "
                            + "number to be in the new combination?");
                        key.next();
                    }
                    //temp var to hold number
                    int temp = key.nextInt();
                    //check to see if the number is a valid selection
                    while(temp < 0 || temp > 39){
                        System.out.println("That number is too high!");
                        System.out.println("The lock goes from 0-39");
                        System.out.println("What would you like the first "
                            + "number to be in the new combination?");
                        temp = key.nextInt();
                    }
                    int x = temp;
                    
                    System.out.println("The lock goes from 0-39");
                    System.out.println("What would you like the second "
                            + "number to be in the new combination?");
                    //Check to see if data entered is an int
                    while(!key.hasNextInt()){
                        System.out.println("That is not number!");
                        System.out.println("What would you like the second "
                            + "number to be in the new combination?");
                        key.next();
                    }
                    //temp var to hold number
                    temp = key.nextInt();
                    //check to see if the number is a valid selection
                    while(temp < 0 || temp > 39){
                        System.out.println("That number is too high!");
                        System.out.println("The lock goes from 0-39");
                        System.out.println("What would you like the second "
                            + "number to be in the new combination?");
                        temp = key.nextInt();
                    }
                    int y = temp;
                    
                    System.out.println("The lock goes from 0-39");
                    System.out.println("What would you like the third "
                            + "number to be in the new combination?");
                    //Check to see if data entered is an int
                    while(!key.hasNextInt()){
                        System.out.println("That is not number!");
                        System.out.println("What would you like the third "
                            + "number to be in the new combination?");
                        key.next();
                    }
                    //temp var to hold number
                    temp = key.nextInt();
                    //check to see if the number is a valid selection
                    while(temp < 0 || temp > 39){
                        System.out.println("That number is too high!");
                        System.out.println("The lock goes from 0-39");
                        System.out.println("What would you like the third "
                            + "number to be in the new combination?");
                        temp = key.nextInt();
                    }
                    int z = temp;
                    
                    lock.setCombination(x, y, z);
                    System.out.println("Your new combo is: "+ x + " " + y +" "
                            + "" + z);
                    System.out.println("Also the dial has been reset to 0"
                            + " as the top number.");
                    break;
                //Case 2 - Turn the dials
                case 2:
                    String check = "y";
                    while(check.toLowerCase().equals("y")){
                        System.out.println("Would you like to turn the dial "
                                + "clockwize or counter-clockwise");
                        System.out.println("Type 0 for clockwise and 1 for"
                                + " counter-clockwise: ");
                        //Check to see if data entered is an int
                        while(!key.hasNextInt()){
                            System.out.println("That is not number!");
                            System.out.println("Type 0 for clockwise and 1 for"
                                + " counter-clockwise: ");
                            key.next();
                        }
                        //temp var to hold number
                        temp = key.nextInt();
                        //check to see if the number is a valid selection
                        while(temp < 0 || temp > 1){
                            System.out.println("That number is too high!");
                            System.out.println("Type 0 for clockwise and 1 for"
                                + " counter-clockwise: ");
                            temp = key.nextInt();
                        }
                        int direction = temp;

                        System.out.println("The lock goes from 0-39");
                        System.out.println("What number do you want to turn to?"
                                + " :");
                        //Check to see if data entered is an int
                        while(!key.hasNextInt()){
                            System.out.println("That is not number!");
                            System.out.println("The lock goes from 0-39");
                            System.out.println("What number do you want to turn "
                                    + "to? :");
                            key.next();
                        }
                        //temp var to hold number
                        temp = key.nextInt();
                        //check to see if the number is a valid selection
                        while(temp < 0 || temp > 39){
                            System.out.println("That number is too high!");
                            System.out.println("The lock goes from 0-39");
                            System.out.println("What number do you want to "
                                    + "turn to? :");
                            temp = key.nextInt();
                        }
                        int number = temp;

                        lock.turnDial(number, direction);
                        System.out.print("Would you like to keep turning?"
                                + " (y/n) :");
                        String tempStr = key.next();
                        while(!tempStr.toLowerCase().equals("y") && 
                                !tempStr.toLowerCase().equals("n")){
                            System.out.println("Inavild selection: " + tempStr);
                            System.out.print("Would you like to keep "
                                    + "turning? (y/n) :");
                            tempStr = key.next();
                        }
                        check = tempStr;
                    }
                    break;
                //Case 3 - Close the lock
                case 3:
                    lock.closeLock();
                    break;
                //Case 4 - Attempt to open the lock
                case 4:
                    lock.attemptToOpen();
                    break;
                //Case 5 - Check if lock is open or shut
                case 5:
                    if(lock.lockStatus())
                        System.out.println("The lock is open.");
                    else
                        System.out.println("The lock is shut");
                    break;
                //Case 6 - Check what number is on top
                case 6:
                    System.out.println("The number on top of the dial is "
                            + "" + lock.getCurrentTopNumber());
                    break;
                //Default case can only be 0
                default:
                    System.out.println("Exiting Program!");
                
            }
            
            
            
        
        }
        
        

    }
    
}