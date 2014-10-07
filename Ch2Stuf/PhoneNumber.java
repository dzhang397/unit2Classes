import java.util.Scanner;

public class PhoneNumber
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       System.out.print("Number: ");
       String phoneNumber = s.next();
       
       String areaCode = phoneNumber.substring(0, 3);
       String first = phoneNumber.substring(3, 6);
       String last = phoneNumber.substring(6, 10);
       
       System.out.println("(" + areaCode + ")" + first + "-" + last);
    }
}