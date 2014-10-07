import java.util.Scanner;
import java.lang.Math;

public class Rectangle
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       double length, width, area, perimeter, diagonal;
       
       System.out.print("Length: ");
       length = s.nextDouble();
       System.out.print("Width: ");
       width = s.nextDouble();
       
       perimeter = 2 * (length + width);
       area = length * width;
       diagonal = Math.sqrt(length * length + width * width);
       
       System.out.println("Perimeter: " + perimeter);
       System.out.println("Area: " + area);
       System.out.println("Diagonal: " + diagonal);
    }
}