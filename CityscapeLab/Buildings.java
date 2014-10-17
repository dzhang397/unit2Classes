import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

/**
 * Class that defines the classes which draw the buildings
 * 
 * @author @Davis Zhang
 * @7 October 2014
 */
public class Buildings
{
    /**
    * Constructor for the Buildings class
    */
    public Buildings()
    {
    }
    
    /**
    * Draws the buildings with random height, width, color, and window states.
    * @param Graphics2D
    * @returns void
    */
    public void drawBuildings (Graphics2D g2)
    {
        int totalWidth = 0;
        int xPos = 0;
        int buildingHeight, buildingWidth;
        int yPos;
        int windowSize = 10;
        int windowSill = 3;
        int windowX = 0;
        int windowY = 0;
        int windowTotal = 0;
        int rowTwoX;
        int frameWidth = 800;
        int frameHeight = 600;
        
        Random randgen = new Random();
        
        while(frameWidth - totalWidth > 200){
            
            yPos = 520;
           
            int rd = randgen.nextInt(55);
            int grn = randgen.nextInt(55);
            int bl = randgen.nextInt(55);
            
            Color buildingColor = new Color(rd + 15, grn + 15, bl + 15);
            
            buildingWidth = randgen.nextInt(10) + 50;
            buildingHeight = randgen.nextInt(20) * 5 + 100;
            totalWidth = buildingWidth + totalWidth;
            
            yPos = yPos - buildingHeight;
            
            /* for(int i = 0;i < (int) buildingHeight / 4; i++){
                
                Color buildingColor = new Color(r - buildingHeight + i, g - buildingHeight + i, b - buildingHeight + i);
                g2.setColor(buildingColor);
                
                g2.draw3DRect(xPos, yPos - buildingHeight + 4 * i, buildingWidth, 4, false);
                g2.fill3DRect(xPos, yPos - buildingHeight + 4 * i, buildingWidth, 4, false);
            }*/
            
            g2.setColor(buildingColor);
            g2.draw3DRect(xPos, yPos, buildingWidth, buildingHeight, true);
            g2.fill3DRect(xPos, yPos, buildingWidth, buildingHeight, true);
            
            int windowGap = (buildingWidth - 2*windowSize) / 3;
            
            windowX = xPos + windowGap;
            windowY = yPos + windowGap;
            
            while(yPos + buildingHeight - windowY > 30){
                
                int windowOn = randgen.nextInt(2);
                
                if(windowOn == 0){
                    g2.setColor(Color.YELLOW);
                }
                else{
                    g2.setColor(Color.BLACK);
                }
                
                g2.draw3DRect(windowX, windowY, windowSize, windowSize, true);
                g2.fill3DRect(windowX, windowY, windowSize, windowSize, true);
                
                windowY = windowY + windowSize;
                
                g2.setColor(Color.LIGHT_GRAY);
                g2.draw3DRect(windowX, windowY, windowSize, windowSill, true);
                g2.fill3DRect(windowX, windowY, windowSize, windowSill, true);
                
                windowY = windowY - windowSize;
                
                rowTwoX = totalWidth - windowSize - windowGap;
                
                windowOn = randgen.nextInt(2);
                
                if(windowOn == 0){
                    g2.setColor(Color.YELLOW);
                }
                else{
                    g2.setColor(Color.BLACK);
                }
                
                g2.draw3DRect(rowTwoX, windowY, windowSize, windowSize, true);
                g2.fill3DRect(rowTwoX, windowY, windowSize, windowSize, true);
                
                windowY = windowY + windowSize;
                
                g2.setColor(Color.LIGHT_GRAY);
                g2.draw3DRect(rowTwoX, windowY, windowSize, windowSill, true);
                g2.fill3DRect(rowTwoX, windowY, windowSize, windowSill, true);
                
                windowY = windowY + windowSill;
                windowY = windowY + windowGap;
                
            }
            
            totalWidth = totalWidth + 20;
            xPos = totalWidth;
        }
    }
}