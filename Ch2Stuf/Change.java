import java.util.Scanner;

public class Change
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       int cents, dollars, quarters, dimes, nickels, pennies;
       
       System.out.print("Cents Owed: ");
       cents = s.nextInt();
       
       dollars = (int) cents / 100;
       cents = cents - 100 * dollars;
       
       quarters = (int) cents / 25;
       cents = cents - 25 * quarters;
       
       dimes = (int) cents / 10;
       cents = cents - 10 * dimes;
       
       nickels = (int) cents / 5;
       cents = cents - 5 * nickels;
       
       pennies = cents;
       
       System.out.println("Dollars: " + dollars + ", Quarters: " + quarters + ", Dimes: " + dimes + ", Nickels: " + nickels + ", Pennies: " + pennies);
   }
}