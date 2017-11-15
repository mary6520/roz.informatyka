import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    int punkty = 0;
    boolean tanczyc = false;

    public void ruch()
    {
        if ( Greenfoot.isKeyDown ("right") ) 

        {
            move(5);
            if(stanKot == STAN_W_PRAWO_1)
                stanKot = STAN_W_PRAWO_2;
            else
                stanKot = STAN_W_PRAWO_1;
        }
        //koniec "if" w prawo
        if ( Greenfoot.isKeyDown ("left") ) 

        {
            move(-5);
            if(stanKot == STAN_W_LEWO_1)
                stanKot = STAN_W_LEWO_2;
            else
                stanKot = STAN_W_LEWO_1;  
        }
        //koniec "if" w lewo
        if ( !Greenfoot.isKeyDown ("left") && !Greenfoot.isKeyDown ("right") ) 
        {
            stanKot =STAN_SIEDZI;
        }
        //koniec "if" siedzi
    }
    //koniec ruchu
    public void zjadajPizze()
    {
        if (isTouching(Pizza.class) )
        {
            removeTouching(Pizza.class);
            punkty++;
            tanczyc = true;
        }
    }
    //koniec zjedz pizze
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
    //koniec ustawWyglad

    public void pokazPunkty()

    {
        World world = this.getWorld();
        world.showText("Punkty:" + punkty, 100, 50);
    }
    //koniecpokazPunkty
    public void taniec()

    {
        if((punkty % 10 == 0) && tanczyc)
        {
            setImage("cat-dance.png");
            Greenfoot.delay(10);
            setImage("cat-dance-2.png");
            Greenfoot.delay(10);
            tanczyc = false;
        }

    }
    //koniec taniec
    public void act() 
    {
        ustawWyglad();
        ruch();
        zjadajPizze();
        pokazPunkty();
        taniec();
    }    
    //koniec act
}
