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
    
    int x,y,z;
    final int IS_SHUT = 0;
    final int IS_OPEN = 1;
    final int IS_LOCKED = 0;
    final int IS_UNLOCKED = 1;
    int status;
    int state;
    int currentTopNumber;
    int dialSize = 40;
    CircularDoubleLinkedList<Integer> dial;
    
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
    }
    
    /**
     *
     * @param x
     * @param y
     * @param z
     */
    public Padlock(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        status = IS_SHUT;
        state = IS_LOCKED;
        currentTopNumber = 0;
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
        this.x = x;
        this.y = y;
        this.z = z;
        this.status = status;
        this.state = state;
        this.currentTopNumber = currentTopNumber;
    }
    
    /**
     *
     * @param x
     * @param y
     * @param z
     */
    public void setCombination(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        
    }
    
    /**
     * 
     * @param number
     */
    public void turnDial(int number){
        
    }
    
    /**
     *
     */
    public void attemptToOpen(){
        
    }
    
    /**
     *
     * @return
     */
    public boolean lockStatus(){
        return false;
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
