import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @Davis Zhang
 * @7 October 2014
 */
public class CityscapeComponent extends JComponent
{
 
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Background background = new Background();
        Buildings buildings = new Buildings();
        SmallStars stars = new SmallStars();
        BigStars bigStars = new BigStars();
        Moon moon = new Moon();
        
        background.drawBackground(g2);
        buildings.drawBuildings(g2);
        stars.drawSmallStars(g2);
        bigStars.drawBigStars(g2);
        moon.drawMoon(g2);

    }
}   
   