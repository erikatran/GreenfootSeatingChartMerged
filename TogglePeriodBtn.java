import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TogglePeriodBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TogglePeriodBtn extends Actor
{
    public int currentPeriod = 2; //default period is 2
    public int getCurrentPeriod() {
        return currentPeriod; //returns the current period
    }
    
    /**
     * Act - do whatever the TogglePeriodBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            if (currentPeriod == 2) {
                currentPeriod = 3; //period 2 change to period 3 if button is clicked
                //setImage("period2.jpg");
            }
            else {
                currentPeriod = 2; //period 3 changed to period 2 if button is clicked 
                //setImage("period3.jpg");
            }
            ((Classroom)getWorld()).setPeriod(currentPeriod); //sets world with current period
    }    
}
}
