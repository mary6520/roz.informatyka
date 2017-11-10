import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kot extends Actor
{
    //sekcja stałych
    //final - stała
    final int STAN_SIEDZI = 0;
    final int STAN_W_PRAWO_1 = 1;
    final int STAN_W_PRAWO_2 = 2;
    final int STAN_W_LEWO_1 = 3;
    final int STAN_W_LEWO_2 = 4;

    //sekcja zmiennych
    int stanKot = STAN_SIEDZI;
    public void ruch()
    {
        if ( Greenfoot.isKeyDown ("right") ) move(2);
        {
            if(stanKot == STAN_W_PRAWO_1)
                stanKot = STAN_W_PRAWO_2;
            else
                stanKot = STAN_W_PRAWO_1;
        }

        if ( Greenfoot.isKeyDown ("left") ) move(-2);
        {
            if(stanKot == STAN_W_LEWO_1)
                stanKot = STAN_W_LEWO_2;
            else
                stanKot = STAN_W_LEWO_1;  
        }
    }
    //koniec ruchu
    public void zjadajPizze()
    {
        if (isTouching(Pizza.class) )
        {
            removeTouching(Pizza.class);
        }
    }

    public void ustawWyglad()
    {
        if(stanKot == STAN_SIEDZI)
            setImage("cat-sit.png");
            
        if(stanKot == STAN_W_PRAWO_1)
            setImage("cat-walk-right.png");
            
        if(stanKot == STAN_W_PRAWO_2)
            setImage("cat-walk-right2.png");
            
        if(stanKot == STAN_W_LEWO_1)
            setImage("cat-walk-left.png");
            
        if(stanKot == STAN_W_LEWO_2)
            setImage("cat-walk-left2.png");
    }

    /**
     * Act - do whatever the Kot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ruch();
        zjadajPizze();
        ustawWglad();
    }    
}
