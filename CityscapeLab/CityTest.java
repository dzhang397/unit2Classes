import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

public class CityTest
{
    private int frameWidth = 800;
    private int frameHeight = 600;
    static int totalWidth = 0;
    static int xPos = 0;
    static int yPos;
    private int citySize;
    
    public CityTest(int size)
    {
        citySize = size;
    }
    
    public void draw (Graphics2D g2)
    {
        int buildingWidth, buildingHeight;
        int windowSize = 10;
        int windowSill = 3;
        int windowX = 0;
        int windowY = 0;
        int windowTotal = 0;
        int rowTwoX;

        Random rand = new Random();
        
        while(frameWidth - totalWidth > 200){
            
            yPos = 520;
            
            int r = rand.nextInt(55);
            int g = rand.nextInt(55);
            int b = rand.nextInt(55);
        
            Color buildingColor = new Color(r + 20, g + 20, b + 20);
            
            buildingWidth = rand.nextInt(10) + 50;
            buildingHeight = rand.nextInt(20) * 5 + 100;
            totalWidth = buildingWidth + totalWidth;
            
            yPos = yPos - buildingHeight;
            /*g2.setColor(buildingColor);*/
            g2.draw3DRect(xPos, yPos, buildingWidth, buildingHeight, true);
            g2.fill3DRect(xPos, yPos, buildingWidth, buildingHeight, true);
            
            int windowGap = (buildingWidth - 2*windowSize) / 3;
            
            windowX = xPos + windowGap;
            windowY = yPos + windowGap;
            
            while(yPos + buildingHeight - windowY > 30){
                
                /*int windowOn = rand.nextInt(2);
                
                if(windowOn == 0){
                    g2.setColor(Color.YELLOW);
                }
                else{
                    g2.setColor(Color.BLACK);
                }*/
                
                g2.draw3DRect(windowX, windowY, windowSize, windowSize, true);
                g2.fill3DRect(windowX, windowY, windowSize, windowSize, true);
                
                windowY = windowY + windowSize;
                
                g2.setColor(Color.LIGHT_GRAY);
                g2.draw3DRect(windowX, windowY, windowSize, windowSill, true);
                g2.fill3DRect(windowX, windowY, windowSize, windowSill, true);
                
                windowY = windowY - windowSize;
                
                rowTwoX = totalWidth - windowSize - windowGap;
                
                /*windowOn = rand.nextInt(2);
                
                if(windowOn == 0){
                    g2.setColor(Color.YELLOW);
                }
                else{
                    g2.setColor(Color.BLACK);
                }*/
                
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