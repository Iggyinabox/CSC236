/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 2-A
 */
package combolock;

/**
 * The Padlock class simulates a combination 3 wheel pack padlock that can be
 * locked, unlocked, opened, and closed. The combination required to unlock the
 * padlock can also be changed.
 * @author ilorenzo
 */
public class Padlock {
    
    private int x,y,z;
    private final int IS_SHUT = 0;
    private final int IS_OPEN = 1;
    private final int IS_LOCKED = 0;
    private final int IS_UNLOCKED = 1;
    private int status;
    private int state;
    private int currentTopNumber;
    private int dialSize = 40;
    private int numberOfRevolutions = 0;
    private int numberOfNotchesAligned = 0;
    private  CircularDoubleLinkedList<Integer> dial;
    private CircularDoubleLinkedList.CircularListIterator dialItr;
    
    /**
     *
     */
    public Padlock(){
        x = 0;
        y = 0;
        z = 0;
        status = IS_SHUT;
        state = IS_LOCKED;
        currentTopNumber = 0;
        fillDial();
        dialItr = dial.listIterator();
    }
    
    /**
     *
     * @param x
     * @param y
     * @param z
     */
    public Padlock(int x, int y, int z){
        if(x < 0 || x > dialSize){
            throw new IllegalArgumentException(x + 
                    " is not a valid combination number");
        }else
            this.x = x;
        if(y < 0 || y > dialSize){
            throw new IllegalArgumentException(y + 
                    " is not a valid combination number");
        }else
            this.y = y;
        if(z < 0 || z > dialSize){
            throw new IllegalArgumentException(z + 
                    " is not a valid combination number");
        }else
            this.z = z;
        status = IS_SHUT;
        state = IS_LOCKED;
        currentTopNumber = 0;
        fillDial();
        dialItr = dial.listIterator();
    }
    
    /**
     *
     * @param x
     * @param y
     * @param z
     * @param status
     * @param state
     * @param currentTopNumber
     */
    public Padlock(int x, int y, int z, int status, int state, int currentTopNumber){
        if(x < 0 || x > dialSize){
            throw new IllegalArgumentException(x + 
                    " is not a valid combination number");
        }else
            this.x = x;
        if(y < 0 || y > dialSize){
            throw new IllegalArgumentException(y + 
                    " is not a valid combination number");
        }else
            this.y = y;
        if(z < 0 || z > dialSize){
            throw new IllegalArgumentException(z + 
                    " is not a valid combination number");
        }else
            this.z = z;
        this.status = status;
        this.state = state;
        this.currentTopNumber = currentTopNumber;
        fillDial();
        dialItr = dial.listIterator();
    }
    
    /**
     *
     * @param x
     * @param y
     * @param z
     */
    public void setCombination(int x, int y, int z){
        if(x < 0 || x > dialSize){
            throw new IllegalArgumentException(x + 
                    " is not a valid combination number");
        }else
            this.x = x;
        if(y < 0 || y > dialSize){
            throw new IllegalArgumentException(y + 
                    " is not a valid combination number");
        }else
            this.y = y;
        if(z < 0 || z > dialSize){
            throw new IllegalArgumentException(z + 
                    " is not a valid combination number");
        }else
            this.z = z;
        //set dial to 0 after changing code
        dialItr.setToFirst();
        
    }
    
    /**
     * 
     * @param number
     * @param direction
     */
    public void turnDial(int number, int direction){
        //If turning clockwise
        if(direction == 0){
            System.out.print("Turning clockwise :");
            do{
                System.out.print(dialItr.current.getValue()+" ");
                dialItr.previous();
                //check to see if a full revolution has been made
                if(currentTopNumber == (Integer)dialItr.current.getValue())
                    numberOfRevolutions++;
            }while((Integer)dialItr.current.getValue() != number);
            System.out.print(dialItr.current.getValue() + "\n");
            //set currentTopNumber to the value of the obj the iterator is
            // currently point to.
            currentTopNumber = (Integer)dialItr.current.getValue();
        }
        //if turning counter clockwise
        if(direction == 1){
            System.out.print("Turning counter-clockwise :");
            do{
                System.out.print(dialItr.current.getValue()+" ");
                dialItr.next();
                //check to see if a full revolution has been made
                if(currentTopNumber == (Integer)dialItr.current.getValue())
                    numberOfRevolutions++;
            }while((Integer)dialItr.current.getValue() != number);
            System.out.print(dialItr.current.getValue() + "\n");
            //set currentTopNumber to the value of the obj the iterator is
            // currently point to.
            currentTopNumber = (Integer)dialItr.current.getValue();
            
            
        } 
         
        //check to see if notch is aligned by checking if dial has been turned 
        //at the proper ammount of revolutions in the right direction and to
        //the right number
        if(numberOfNotchesAligned == 0 && numberOfRevolutions == 1 && 
                direction == 0 && currentTopNumber == x){
            numberOfNotchesAligned++;
            numberOfRevolutions = 0;
        }
        if(numberOfNotchesAligned == 1 && numberOfRevolutions == 1 && 
                direction == 1 && currentTopNumber == y){
            numberOfNotchesAligned++;
            numberOfRevolutions = 0;
        }
        if(numberOfNotchesAligned == 2 && numberOfRevolutions == 0 && 
                direction == 0 && currentTopNumber == z){
            state = IS_UNLOCKED;
            numberOfRevolutions = 0;
        }     
    }
    
    /**
     *
     */
    public void closeLock(){
        if(status == IS_SHUT)
            System.out.println("The lock is already shut!");
        else{
            status = IS_SHUT;
            //The padlock will lock when shut
            state = IS_LOCKED;
            System.out.println("You shut the lock");
        }
    }
    
    /**
     * 
     */
    public void attemptToOpen(){
        if(state == IS_LOCKED){
            status = IS_SHUT;
            System.out.println("You pull at the lock with all your might but "
                    + "it seems it is locked.");   
        }else{
            status = IS_OPEN;
            System.out.println("You pull at the lock and it opens up.");
        }
        
    }
    
    /**
     *
     * @return
     */
    public boolean lockStatus(){
        return status == IS_OPEN;
    }
    
    /**
     *
     * @return
     */
    public int getCurrentTopNumber(){
        return currentTopNumber;
    }
    
    //Used to fill the Dial with numbers
    private void fillDial(){
        dial = new CircularDoubleLinkedList();
        
        for(int i = 0;i < dialSize;i++){
            dial.add(i);
        }
        //Test Code
        //dial.displayTest();
    }
    
    
    
}
