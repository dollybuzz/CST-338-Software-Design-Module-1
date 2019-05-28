//Part 1
import java.util.Scanner;

/* Purpose: Requests user's name, demonstrates basic string methods
 * and string manipulation using the Scanner class.
 * Preconditions: No implemented check in accordance with assignment specifications;
 * however, user is instructed to capitalize the first initial in the first and last name.
 * Postconditions: Results in the concatenation of first and last name,
 * the length of the full name, the full name displayed in uppercase
 * and lowercase letters.
 */
public class UserName 
{
   public static void main(String[] args) 
   {
        Scanner userinput = new Scanner(System.in);
      System.out.print("Please enter your first name with "
            + "the first initial capitalized: ");
      String firstName = userinput.nextLine();
      System.out.print("Please enter your last name with "
            + "the first initial capitalized: ");
      String lastName = userinput.nextLine();
      String fullName = firstName + " " + lastName;
      System.out.println( "Your full name is " + fullName);
      int lengthOfName = (fullName.length() - 1);
      System.out.println("The length of your full name is " + lengthOfName);
      System.out.println("Your name in all uppercase: " + fullName.toUpperCase());
      System.out.println("Your name in all lowercase: " + fullName.toLowerCase());
   }
}