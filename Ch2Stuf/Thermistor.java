import java.util.Scanner;
import java.lang.Math;

public class Thermistor
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       double resistance, liquidTemp;
       
       double rZero = 1075;
       double tZero = 358;
       double beta = 3969;
       
       System.out.print("Resistance: ");
       resistance = s.nextDouble();
       
       liquidTemp = (beta * tZero) / ((tZero * Math.log(resistance) / Math.log(rZero)) + beta) - 273;
       
       System.out.println("Degrees Celsius: " + liquidTemp);
    }
}
       
       