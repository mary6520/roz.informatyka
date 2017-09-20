import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    public void klawisze()
    {
        //jeżeli klawisz prawy to przesun w prawo
        if( Greenfoot.isKeyDown("right") ) 
        {
            move( 2 );
        }
        //jeżeli klawiesz lewy to przesun w lewo
        if( Greenfoot.isKeyDown("left") )
        {
            move( -2 );
        }
        //jeżeli klawisz góra to przesun w górę
        if( Greenfoot.isKeyDown("up") ) 
        {
            turn(-90);
            move( 1 );
            turn(90);
        }
        //jeżeli klawiesz dół to przesun w dół
        if( Greenfoot.isKeyDown("down") )
        {
            turn(-90);
            move( -1 );
            turn(90);
        }        
    }
    
    public void zjadanie()
    {
        //jeżeli dotkam jakiegokolwiek obiektu klasy ludzik to usuń dotykany obiekt klasy ludzik
        if( isTouching( Ludzik.class ) )  
        {
            removeTouching( Ludzik.class );
        }
    }
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        klawisze();
        zjadanie();
    }    
}
