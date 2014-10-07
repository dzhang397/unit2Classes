import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

/**
 * Class that defines the classes which draw the cityscape
 * 
 * @author @Davis Zhang
 * @7 October 2014
 */
public class CityScape
{
    private int frameWidth;
    private int frameHeight;
    Random randgen = new Random();

    public CityScape(int sizeX, int sizeY)
    {
        frameWidth = sizeX;
        frameHeight = sizeY;
    }
    
    
    public void drawBackground (Graphics2D g2)
    {
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
    
    public void drawSmallStars (Graphics2D g2)
    {
        int starX;
        int starY;
        int starRadius;

        for(int i = 0;i < 160; i++){
            starX = randgen.nextInt(800);
            
            if(starX > 650){
                starY = randgen.nextInt(480);
            }
            else{
                starY = randgen.nextInt(320);
            }
        
            starRadius = randgen.nextInt(2) + 1;
        
            g2.setColor(Color.WHITE);
            g2.fill(new Ellipse2D.Double(starX, starY, starRadius, starRadius));
            try{
                Thread.currentThread().sleep(1000);
            }
                catch(InterruptedException ie){
            }
        }
    }
    
    public void drawBigStars (Graphics2D g2)
    {
        int starX;
        int starY;
        int starRadius;

        for(int i = 0;i < 30; i++){
            starX = randgen.nextInt(800);
            
            if(starX > 650){
                starY = randgen.nextInt(480);
            }
            else{
                starY = randgen.nextInt(320);
            }
        
            starRadius = randgen.nextInt(3) + 2;
        
            g2.setColor(Color.WHITE);
            g2.fill(new Ellipse2D.Double(starX, starY, starRadius, starRadius));
        }
    }
    
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
            
            /*for(int i = 0;i < (int) buildingHeight / 4; i++){
                
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

    public void drawMoon (Graphics2D g2)
    {
        for(int i = 0;i < 25; i++){
            Color moonColor = new Color(150 + 4 * i, 150 + 4 * i, 100 + 6 * i);
        
            g2.setColor(moonColor);
            g2.fill(new Ellipse2D.Double(600 + i, 50 + 2 * i, 100 - 4 * i, 100 - 4 * i));
        }

    }
}