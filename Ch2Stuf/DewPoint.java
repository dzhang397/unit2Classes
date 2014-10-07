import java.util.Scanner;
import java.lang.Math;

public class DewPoint
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       double humidity, temperature, dewPoint;
       
       double a = 17.27;
       double b = 237.7;
       
       System.out.print("Current Relative Humidity: ");
       humidity = s.nextDouble();
       System.out.print("Current Temperature: ");
       temperature = s.nextDouble();
       
       dewPoint = (a * temperature / (b * temperature)) + (Math.log(humidity) / Math.log(7.71828));
       
       System.out.println(dewPoint);
    }
}
       
       