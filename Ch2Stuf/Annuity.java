import java.util.Scanner;
import java.lang.Math;

public class Annuity
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       double pmt, i, n, presentValue;
       
       System.out.print("Periodic Payment: ");
       pmt = s.nextDouble();
       System.out.print("Periodic Interest: ");
       i = s.nextDouble()/100;
       System.out.print("Number of Payments: ");
       n = s.nextDouble();
       
       presentValue = pmt*(((Math.pow(1 + i, n - 1) - 1) / i ) / (Math.pow(1 + i,n - 1)) + 1);
       
       int newPresentValue = (int)presentValue * 100;
       double printPresentValue = newPresentValue / 100;
       System.out.println(printPresentValue);
       
       System.out.println(Math.floor(presentValue * 100)/100);
       
       System.out.printf("%.2f%n", presentValue);
   }
}
