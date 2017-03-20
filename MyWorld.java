import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    private final static int IMAGE_COUNT = 10;

    private static GreenfootImage[] images = new GreenfootImage[IMAGE_COUNT];

    private int gifSpeedCounter = 0;

    private int slowness = 6;

    private int actCycle = 0;

    /**
     * Constructor for objects of class MyWorld.
     * @param no parameters
     * @return nothing is returned
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        for( int i = 0; i < images.length; i++ )
        {
            images[i] = new GreenfootImage("frame_"+i+"_delay-0.1s.gif");
        }

        setBackground( images[0] );
    }

    /**
     * act will run every time the act method is run
     * @param no parameters
     * @return nothing is returned
     */
    public void act()
    {
        setBackground( images[actCycle % IMAGE_COUNT] );

        if(gifSpeedCounter == slowness)
        {
            actCycle++;
            gifSpeedCounter = 0;
        }

        else
        {
            gifSpeedCounter++;  
        }
    }
}
