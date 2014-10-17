import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

/**
 * Class that defines the classes which draw the small stars
 * 
 * @author @Davis Zhang
 * @7 October 2014
 */
public class SmallStars
{
    /**
    * Constructor for the SmallStars class
    */
    public SmallStars()
    {
    }
    /**
    * Draws small stars with randomly generated position
    * @param Graphics2D
    * @returns void
    */
   
    public void drawSmallStars (Graphics2D g2)
    {
        int starX;
        int starY;
        int starRadius;
        
        Random randgen = new Random();
        
        for(int i = 0;i < 160; i++){
            starX = randgen.nextInt(800);
            
            /*If x-position < 650, overlaps with buildings */
            
            if(starX > 650){
                starY = randgen.nextInt(480);
            }
            else{
                starY = randgen.nextInt(320);
            }
        
            starRadius = randgen.nextInt(2) + 1;
        
            g2.setColor(Color.WHITE);
            g2.fill(new Ellipse2D.Double(starX, starY, starRadius, starRadius));
        }
    }
}