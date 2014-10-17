import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

/**
 * Class that defines the classes which draw the moon
 * @author @Davis Zhang
 * @7 October 2014
 */
public class Moon
{
    /**
    * Constructor for the Moon class
    */
    public Moon()
    {
    }
    
    /**
    * Draws the moon
    * @param Graphics2D
    * @returns void
    */

    public void drawMoon (Graphics2D g2)
    {
        for(int i = 0;i < 25; i++){
            Color moonColor = new Color(150 + 4 * i, 150 + 4 * i, 100 + 6 * i);
        
            g2.setColor(moonColor);
            g2.fill(new Ellipse2D.Double(600 + i, 50 + 2 * i, 100 - 4 * i, 100 - 4 * i));
        }

    }
}