//Part 2
import java.util.Scanner;
import java.text.DecimalFormat;

/* Purpose: Requests user to input a number of hours they dedicated toward the class,
 * demonstrates string formatting using the DecimalFormat class.
 * Preconditions:No implemented check in accordance with assignment specifications;
 * user is instructed to input a value as a 3 decimal place integer.
 * Postconditions: Results in the returned value of the user’s input rounded to 1 decimal place.
 */
public class WeeklyHours 
{
   public static void main(String[] args) 
   {
      Scanner userinput = new Scanner(System.in);
      DecimalFormat decimalForm = new DecimalFormat("#.0");
      final int MIN_HOURS = 12;
      final int MAX_HOURS = 20;
      System.out.println("The range of minimum to maximum hours: " + MIN_HOURS
            + "-" + MAX_HOURS);
      System.out.println("Within this range, how many hours have you spent" 
            +" on this class this week?" 
            + "\nPlease enter your value to 3 decimal places. ");
      float userInputHours = userinput.nextFloat();
      System.out.println("The number of hours you have spent on this class"
            + " this week is " + decimalForm.format(userInputHours));
   }
}
