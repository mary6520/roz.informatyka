import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Kot kot = new Kot();
        addObject(kot,398,539);
    }

    public void zrobPizze()
    {
        int szansa = Greenfoot.getRandomNumber(100);
        
        if(szansa<10)
        {
            int szerokosc = getWidth();
            int x = Greenfoot.getRandomNumber(szerokosc);
            int y = 0;

            Pizza pizza = new Pizza();
            addObject( pizza, x, y);
        }
    }

    public void act ()
    {
        zrobPizze(); 
    }
}