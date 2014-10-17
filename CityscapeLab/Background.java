import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

/**
 * Class that defines the classes which draw the background
 * 
 * @author @Davis Zhang
 * @7 October 2014
 */
public class Background
{
    /**
    * Constructor for the Background class
    */
    public Background()
    {
    }
    /**
    * Draws the background
    * @param Graphics2D
    * @returns void
    */
    public void drawBackground(Graphics2D g2)
    {
        int frameWidth = 800;
        int frameHeight = 600;
        
        Random randgen = new Random();
        
        g2.setColor(Color.BLACK);
        g2.fill3DRect(0, 0, 800, 600, true);
        
        for(int i = 0;i < 200; i++){
            Color darkBlue = new Color(0, 0, i);
        
            g2.setColor(darkBlue);
            g2.fill(new Ellipse2D.Double(2 * i, 4 * i, 800 - 4 * i, 800 - 4 * i));
        }
        
        for(int i = 0;i < 50; i++){
            Color darkGreen = new Color(0, i, 0);
        
            g2.setColor(darkGreen);
            g2.draw3DRect(0, 500 + 2 * i, frameWidth, 2, true);
            g2.fill3DRect(0, 500 + 2 * i, frameWidth, 2, true);
        }
    }

}