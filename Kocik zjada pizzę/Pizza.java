import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    public void spadaj ()
    {
        turn (90);
        move(1);
        turn(-90);
    }  
    //koniec spadaj

    public void wykryjDno ()
    {
        World world = getWorld();
        int wysokosc = world.getHeight() -1;
        int mojey = getY();
        if (mojey>= wysokosc) world.removeObject(this);
    }
    //koniec wykryjDno
    
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        spadaj();
        wykryjDno();
    }  
    //koniec act
}
