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
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ludzik ludzik = new Ludzik();
        addObject(ludzik,446,248);
        Ludzik ludzik2 = new Ludzik();
        addObject(ludzik2,126,306);
        Ludzik ludzik3 = new Ludzik();
        addObject(ludzik3,271,289);
        Ludzik ludzik4 = new Ludzik();
        addObject(ludzik4,206,196);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik3.setLocation(329,318);
        ludzik4.setLocation(232,109);
        ludzik.setLocation(479,128);
        ludzik3.setLocation(345,298);
        ludzik2.setLocation(255,232);
        Monster monster = new Monster();
        addObject(monster,83,239);
        Ludzik ludzik5 = new Ludzik();
        addObject(ludzik5,225,461);
        Ludzik ludzik6 = new Ludzik();
        addObject(ludzik6,751,486);
        Ludzik ludzik7 = new Ludzik();
        addObject(ludzik7,870,220);
        Ludzik ludzik8 = new Ludzik();
        addObject(ludzik8,1255,588);
        Ludzik ludzik9 = new Ludzik();
        addObject(ludzik9,847,461);
        Ludzik ludzik10 = new Ludzik();
        addObject(ludzik10,648,334);
        Ludzik ludzik11 = new Ludzik();
        addObject(ludzik11,1151,267);
        Ludzik ludzik12 = new Ludzik();
        addObject(ludzik12,813,74);
        Ludzik ludzik13 = new Ludzik();
        addObject(ludzik13,462,563);
    }
}
