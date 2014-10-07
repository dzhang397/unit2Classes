import java.util.Scanner;
import java.lang.Math;

public class Convert
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       double distance;
       
       double feetPerMeter = 3.2;
       double milesPerMeter = feetPerMeter/5280;
       double inchesPerMeter = 12 * feetPerMeter;
       
       System.out.print("Distance in meters: ");
       distance = s.nextDouble();
       
       System.out.println("Distance in feet: " + distance * feetPerMeter);
       System.out.println("Distance in miles: " + distance * milesPerMeter);
       System.out.printf("Distance in inches: " + (distance * inchesPerMeter));
   }
}

       
